package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.drawer.ILedDrawer;
import com.bnpparibas.grp.ledletter.factory.LedDrawerFactory;
import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;
import com.google.common.collect.Maps;

import javax.swing.JComponent;
import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.util.Map;

/**
 * @author morinb.
 */
public class LedLetter extends JComponent implements LedLetterModelListener {
    public static final String PROPERTY_CHANGE_MODEL = "model";
    private LedLetterModel model;
    private ILedDrawer ledDrawer;
    private boolean foregroundColorSet = false;
    private boolean backgroundColorSet = false;
    private int currentChar;
    private BufferedImageOp[] effects;


    public LedLetter() {
        this(null, null);
    }

    public LedLetter(ILedDrawer ledDrawer) {
        this(null, ledDrawer);
    }

    public LedLetter(LedLetterModel model) {
        this(model, null);
    }

    public LedLetter(LedLetterModel model, ILedDrawer ledDrawer) {
        if (ledDrawer == null) {
            ledDrawer = createDefaultLedDrawer();
        }

        if (model == null) {
            model = createDefaultLedLetterModel();
        }

        setLedDrawer(ledDrawer);
        setModel(model);
        setLayout(null);
        super.setBackground(Color.BLUE);
    }

    public void setEffects(BufferedImageOp[] effects) {
        this.effects = effects;
    }

    private ILedDrawer createDefaultLedDrawer() {
        return LedDrawerFactory.getDefaultDrawer();
    }

    private LedLetterModel createDefaultLedLetterModel() {
        return new DefaultLedLetterModel(LedLetterFont.LLF_5x7, 5, 5);
    }

    @Override
    public void setForeground(Color fg) {
        super.setForeground(fg);
        foregroundColorSet = true;
    }

    @Override
    public void setBackground(Color bg) {
        super.setBackground(bg);
        backgroundColorSet = true;
    }

    public void setModel(LedLetterModel model) {
        if (model == null) {
            throw new IllegalArgumentException("Cannot set a null LedLetterModel");
        }

        if (this.model != model) {
            LedLetterModel old = this.model;
            if (old != null) {
                old.removeLedLetterModelListener(this);
            }
            this.model = model;
            model.addLedLetterModelListener(this);

            this.removeAll();
            final int columnCount = model.getColumnCount();
            final int rowCount = model.getRowCount();

            final int ledWidth = model.getLedWidth();
            final int ledHeight = model.getLedHeight();

            setPreferredSize(new Dimension(ledWidth * columnCount + 1 + model.getHorizontalGap(), ledHeight * rowCount + 1 + model.getVerticalGap()));

            ledLetterChanged(new LedLetterModelEvent(' ', model));
            firePropertyChange(PROPERTY_CHANGE_MODEL, old, model);
        }
    }

    private Map<Integer, BufferedImage> imageMap = Maps.newHashMap();


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        final int ledWidth = model.getLedWidth();
        final int ledHeight = model.getLedHeight();

        final int imageWidth = ledWidth * model.getColumnCount() + 1 + model.getHorizontalGap();
        final int imageHeight = ledHeight * model.getRowCount() + 1 + model.getVerticalGap();

        int myCurrentChar = currentChar;
        if (!imageMap.containsKey(myCurrentChar)) {
            BufferedImage tempForeground = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_ARGB);
            {
                final Graphics2D g2 = tempForeground.createGraphics();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                for (int row = 0; row < model.getRowCount(); row++) {
                    for (int col = 0; col < model.getColumnCount(); col++) {
                        int x = ledWidth * col  /*+ model.getHorizontalGap()*/;
                        int y = ledHeight * row /*+ model.getVerticalGap()  */;
                        if (model.getValues()[row][col]) {
                            g2.setPaint(getForeground());
                            ledDrawer.drawLed(g2, x, y, ledWidth - 1, ledHeight - 1);
                        } else {
                            g2.setPaint(new Color(255, 255, 255, 255));
                        }
                    }
                }
                g2.dispose();
            }

            if (effects != null) {
                for (BufferedImageOp op : effects) {
                    System.out.println("Applying " + op.toString());
                    tempForeground = op.filter(tempForeground, null);
                }
            }


            BufferedImage finalBi = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = finalBi.createGraphics();
            g2.setPaint(getBackground());
            g2.fillRect(0, 0, imageWidth, imageHeight);
            g2.setComposite(AlphaComposite.SrcAtop);

            g2.drawImage(tempForeground, 0, 0, imageWidth, imageHeight, null);
            imageMap.put(myCurrentChar, finalBi);
            g2.dispose();
        }

        final BufferedImage img = imageMap.get(myCurrentChar);
        g.drawImage(img, 0, 0, imageWidth, imageHeight, null);


    }

    public LedLetterModel getModel() {
        return model;
    }


    @Override
    public void ledLetterChanged(LedLetterModelEvent e) {
        this.currentChar = e.getC();
        repaint();
    }


    public void setLedDrawer(ILedDrawer ledDrawer) {
        this.ledDrawer = ledDrawer;
    }


    public boolean isForegroundColorSet() {
        return foregroundColorSet;
    }

    public boolean isBackgroundColorSet() {
        return backgroundColorSet;
    }
}
