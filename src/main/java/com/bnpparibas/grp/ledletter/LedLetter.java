package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.factory.ILedFactory;

import javax.swing.JComponent;
import java.awt.Dimension;

import static com.bnpparibas.grp.ledletter.LedFactory.Type.OUTLINED_OVAL;
import static com.bnpparibas.grp.ledletter.LedFactory.Type.OVAL;

/**
 * @author morinb.
 */
public class LedLetter extends JComponent implements LedLetterModelListener {
    public static final String PROPERTY_CHANGE_MODEL = "model";
    private LedLetterModel model;
    private Led[] leds;
    private ILedFactory ledFactory;

    public LedLetter() {
        this(null, null);
    }

    public LedLetter(ILedFactory ledFactory) {
        this(null, ledFactory);
    }

    public LedLetter(LedLetterModel model) {
        this(model, null);
    }

    public LedLetter(LedLetterModel model, ILedFactory ledFactory) {
        if (ledFactory == null) {
            ledFactory = createDefaultLedFactory();
        }

        if (model == null) {
            model = createDefaultLedLetterModel();
        }

        setLedFactory(ledFactory);
        setModel(model);
        setLayout(null);
    }

    private ILedFactory createDefaultLedFactory() {
        return LedFactory.get(OUTLINED_OVAL);
    }

    private LedLetterModel createDefaultLedLetterModel() {
        return new DefaultLedLetterModel(1, 1);
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

            leds = new Led[columnCount * rowCount];
            final Led led = ledFactory.getLed();
            final int ledWidth = led.getWidth();
            final int ledHeight = led.getHeight();

            setPreferredSize(new Dimension(ledWidth * columnCount, ledHeight * rowCount));

            for (int i = 0; i < leds.length; i++) {
                leds[i] = ledFactory.getLed();
                int row = (i / (columnCount)) * ledHeight;
                int col = (i % (columnCount)) * ledWidth;
                leds[i].setBounds(col, row, ledWidth, ledHeight);
                System.out.println(String.format("Led %d [%d, %d]", i, col, row));
                this.add(leds[i]);
            }


            ledLetterChanged(new LedLetterModelEvent(model));
            firePropertyChange(PROPERTY_CHANGE_MODEL, old, model);
        }
    }

    public LedLetterModel getModel() {
        return model;
    }


    @Override
    public void ledLetterChanged(LedLetterModelEvent e) {
        final int columnCount = e.getLedLetterModel().getColumnCount();
        final int rowCount = e.getLedLetterModel().getRowCount();

        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                final int index = column + columnCount * row;
                final boolean status = e.getLedLetterModel().getValueAt(row, column);

                leds[index].setOn(status);

            }
        }
    }

    public void setLedFactory(ILedFactory ledFactory) {
        this.ledFactory = ledFactory;
    }

    public ILedFactory getLedFactory() {
        return ledFactory;
    }
}
