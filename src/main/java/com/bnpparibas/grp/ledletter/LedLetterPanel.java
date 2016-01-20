package com.bnpparibas.grp.ledletter;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.Timer;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * @author morinb.
 */
public class LedLetterPanel extends JComponent {

    private Thread imageThread;
    private Map<Character, BufferedImage> lettersMap = Maps.newHashMap();
    private int width;
    private int height;
    private int charNumber;
    private LedLetterModel model;
    private int scrollSpeed;
    private String message;
    private int scrollIndex;
    private int scrollStep;
    private ScrollWay scrollWay;
    private Timer scrollTimer;
    private int letterSize;
    private Map<String, BufferedImage> imageMap = Maps.newHashMap();
    private BufferedImageOp[] effects;
    private BufferedImage shadows;
    private String oldMessage = null;

    public LedLetterPanel(final LedLetterModel model, final int charNumber, final int scrollSpeed) {
        this.model = model;
        this.charNumber = charNumber;
        this.scrollSpeed = scrollSpeed;

        effects = new BufferedImageOp[0];

        this.setModel(model);

    }

    public BufferedImageOp[] getEffects() {
        return effects;
    }

    public void setEffects(BufferedImageOp[] effects) {
        this.effects = effects;
    }

    public void displayMessage(String message) {
        final String spaces = spaces(charNumber);
        oldMessage = this.message;
        this.message = spaces + message + spaces;


        final int imageWidth = letterSize * message.length();
        shadows = new BufferedImage(imageWidth, height, BufferedImage.TYPE_INT_ARGB);

        Color transparent = new Color(0, 0, 0, 0);
        GradientPaint gradientPaintLeft = new GradientPaint(
              new Point2D.Double(0, 0), Color.BLACK,
              new Point2D.Double(imageWidth / 4, 0), transparent
        );
        GradientPaint gradientPaintRight = new GradientPaint(
              new Point2D.Double(3 * imageWidth / 4, 0), transparent,
              new Point2D.Double(imageWidth, 0), Color.BLACK
        );
        final Graphics2D g2 = shadows.createGraphics();
        g2.setPaint(gradientPaintLeft);
        g2.fillRect(0, 0, imageWidth / 4, height);
        g2.setPaint(transparent);
        g2.fillRect(imageWidth / 4, 0, 3 * imageWidth / 4, height);
        g2.setPaint(gradientPaintRight);
        g2.fillRect(3 * imageWidth / 4, 0, imageWidth, height);
        g2.dispose();

        if (scrollTimer != null && !scrollTimer.isRunning()) {
            scrollTimer.start();
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        final int imageWidth = letterSize * message.length();
        String selectedMessage = message;
        if (selectedMessage.trim().isEmpty()) {
            g.setColor(model.getLetterBackgroundColor());
            g.fillRect(0, 0, width, height);
            return;
        }

        if (!imageMap.containsKey(selectedMessage)) {
            if (imageThread != null && imageThread.isAlive()) {
                if (oldMessage == null || oldMessage.trim().isEmpty()) {
                    g.setColor(model.getLetterBackgroundColor());
                    g.fillRect(0, 0, width, height);
                } else {
                    selectedMessage = oldMessage;
                }
            } else {
                if (imageThread != null) {
                    imageThread.interrupt();
                }
                imageThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            createTextImage(imageWidth);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }, "Image-Generator-Thread");
                imageThread.start();
            }

        }
        BufferedImage bi = imageMap.get(selectedMessage);
        g.drawImage(bi, scrollIndex, 0, imageWidth, height, null);


        // Draw shadow
        Graphics2D g2 = (Graphics2D) g;
        g2.setComposite(AlphaComposite.SrcOver);

        g2.drawImage(shadows, 0, 0, width, height, null);
        g2.dispose();
    }

    /**
     * Uses 1 thread per unique character to draw images.
     *
     * @param imageWidth
     * @throws InterruptedException
     */
    private void createTextImage(int imageWidth) throws InterruptedException {
        // create a big image with all the text.
        final BufferedImage stamp = new BufferedImage(imageWidth, this.height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = stamp.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Paint background
        final Color background = model.getLetterBackgroundColor();
        g2.setPaint(background);
        g2.fillRect(0, 0, imageWidth, height);

        // paint leds.
        char[] charArray = message.toCharArray();
        Set<Character> letterSet = Sets.newHashSet();
        for (int i = 0; i < charArray.length; i++) {
            letterSet.add(charArray[i]);
        }
        // Creates images for each cahr

        final Collection<Thread> imageThreads = Lists.newArrayList();
        for (final Character c : letterSet) {
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    if (!lettersMap.containsKey(c)) {
                        final int ledWidth = model.getLedDimension().width;
                        final int ledHeight = model.getLedDimension().height;
                        BufferedImage letterImage = new BufferedImage(letterSize, height, BufferedImage.TYPE_INT_ARGB);
                        Graphics2D letterGraphics = letterImage.createGraphics();
                        for (int row = 0; row < model.getRowCount(); row++) {
                            for (int col = 0; col < model.getColumnCount(); col++) {
                                int x = ledWidth * col;
                                int y = ledHeight * row;
                                if (model.getValues(c)[row][col]) {
                                    letterGraphics.setPaint(getForeground());
                                    model.getLedDrawer().drawLed(letterGraphics, x, y, ledWidth - 1, ledHeight - 1);
                                } else {
                                    letterGraphics.setPaint(new Color(255, 255, 255, 255));
                                }
                            }
                        }
                        letterGraphics.dispose();
                        lettersMap.put(c, letterImage);
                    }
                }
            }, "Thread-Generator-" + c);
            imageThreads.add(t);
            t.start();
        }

        for (Thread t : imageThreads) {
            t.join();
        }

        for (int i = 0; i < charArray.length; i++) {
            final char c = charArray[i];
            final int letterX = i * letterSize;
            final int letterY = 0;
            final BufferedImage bi = lettersMap.get(c);
            g2.drawImage(bi, letterX, letterY, letterSize, height, null);
        }


        g2.dispose();
        // Draw effects
        for (BufferedImageOp op : effects) {
            op.filter(stamp, stamp);
        }

        imageMap.put(message, stamp);
    }

    private String spaces(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    public void setModel(LedLetterModel model) {
        this.model = model;

        setBackground(model.getLetterBackgroundColor());
        setForeground(model.getLetterColor());

        this.letterSize = model.getLedDimension().width * model.getColumnCount() + 1 + model.getGap().width;
        this.width = charNumber * letterSize;
        this.height = model.getLedDimension().height * model.getRowCount() + 1 + model.getGap().height;
        final String spaces = spaces(charNumber);
        this.message = spaces + spaces;


        this.setPreferredSize(new Dimension(width, height));
        this.setMinimumSize(new Dimension(width, height));

        scrollWay = ScrollWay.RIGHT_TO_LEFT; // right to left
        scrollStep = 10; // px
        switch (scrollWay) {
            case RIGHT_TO_LEFT:
                scrollIndex = 0;
                break;
            case LEFT_TO_RIGHT:
                scrollIndex = -(letterSize * (message.length() * charNumber));
                break;
        }

        if (scrollTimer != null) {
            scrollTimer.stop();
        }

        scrollTimer = new Timer(scrollSpeed, new AbstractAction("Scroll Timer Action") {
            @Override
            public void actionPerformed(ActionEvent e) {
                scrollIndex += scrollStep * scrollWay.getWay();

                switch (scrollWay) {
                    case LEFT_TO_RIGHT:
                        if (scrollIndex >= charNumber * letterSize) {
                            scrollIndex = -(letterSize * (message.length() - charNumber));
                        }
                        break;
                    case RIGHT_TO_LEFT:
                        if (scrollIndex <= letterSize * (message.length() - charNumber) * scrollWay.getWay()) {
                            scrollIndex = 0;
                        }
                        break;
                }
                repaint();
            }
        });
    }

    public static int getNumberOfCharsForSpecifiedWidth(int wantedWidth, boolean allowOverflow, LedLetterModel model) {
        int numberOfChars = 0;
        int letterSize = model.getLedLetterFont().columnCount() * model.getLedDimension().width + 1 + model.getGap().width;

        numberOfChars = wantedWidth / letterSize;
        if (wantedWidth % letterSize != 0) {
            // Division has some rest
            if (allowOverflow) {
                numberOfChars = numberOfChars + 1;
            }
        }


        return numberOfChars;
    }
}
