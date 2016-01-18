package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.factory.ILedFactory;

import javax.swing.JComponent;

import static com.bnpparibas.grp.ledletter.LedFactory.Type.OVAL;

/**
 * @author morinb.
 */
public class LedLetter extends JComponent implements LedLetterModelListener {
    public static final String PROPERTY_CHANGE_MODEL = "model";
    private LedLetterModel model;
    private Led[] leds;

    public LedLetter() {
        this(null);
    }

    public LedLetter(LedLetterModel model) {

        if (model == null) {
            model = createDefaultLedLetterModel();
        }

        setModel(model);
        setLayout(null);
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
            final ILedFactory ovalLedFactory = LedFactory.get(OVAL);
            final Led led = ovalLedFactory.getLed(10, 10);
            final int ledWidth = led.getWidth();
            final int ledHeight = led.getHeight();
            for (int i = 0; i < leds.length; i++) {
                leds[i] = ovalLedFactory.getLed(10, 10);
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
}
