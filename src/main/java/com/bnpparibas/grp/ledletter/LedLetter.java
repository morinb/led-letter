package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.drawer.ILedDrawer;
import com.bnpparibas.grp.ledletter.factory.LedDrawerFactory;
import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * @author morinb.
 */
public class LedLetter extends JComponent implements LedLetterModelListener {
    public static final String PROPERTY_CHANGE_MODEL = "model";
    private LedLetterModel model;
    private ILedDrawer ledDrawer;
    private boolean foregroundColorSet = false;
    private boolean backgroundColorSet = false;


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

            setPreferredSize(new Dimension(ledWidth * columnCount, ledHeight * rowCount));

            ledLetterChanged(new LedLetterModelEvent(model));
            firePropertyChange(PROPERTY_CHANGE_MODEL, old, model);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        final int ledWidth = model.getLedWidth();
        final int ledHeight = model.getLedHeight();

        final int imageWidth = ledWidth * model.getColumnCount();
        final int imageHeight = ledHeight * model.getRowCount();
        final BufferedImage bi = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_3BYTE_BGR);
        final Graphics2D g2 = bi.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        for (int row = 0; row < model.getRowCount(); row++) {
            for (int col = 0; col < model.getColumnCount(); col++) {
                int x = ledWidth * col;
                int y = ledHeight * row;
                if (model.getOldValues()[row][col] != model.getValues()[row][col]) {
                    g2.setPaint(model.getValues()[row][col] ? getForeground() : getBackground());
                    ledDrawer.drawLed(g2, x - 1, y - 1, ledWidth + 1, ledHeight + 1);
                }
            }
        }
        g2.dispose();
        g.drawImage(bi, 0, 0, imageWidth, imageHeight, null);
    }

    public LedLetterModel getModel() {
        return model;
    }


    @Override
    public void ledLetterChanged(LedLetterModelEvent e) {

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
