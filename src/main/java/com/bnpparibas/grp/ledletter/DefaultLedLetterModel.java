package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;

import javax.swing.event.EventListenerList;

/**
 * @author morinb.
 */
public class DefaultLedLetterModel implements LedLetterModel {
    private boolean[][] currentValues;
    private boolean[][] oldValues;
    private EventListenerList listenerList = new EventListenerList();
    private final LedLetterFont ledLetterFont;
    private int ledWidth;
    private int ledHeight;
    private final int horizontalGap;
    private final int verticalGap;

    public DefaultLedLetterModel(LedLetterFont ledLetterFont, int ledWidth, int ledHeight) {
        this(ledLetterFont, ledWidth, ledHeight, 2 * ledWidth, 0);
    }

    public DefaultLedLetterModel(LedLetterFont ledLetterFont, int ledWidth, int ledHeight, int horizontalGap, int verticalGap) {
        this.ledLetterFont = ledLetterFont;
        this.ledWidth = ledWidth;
        this.ledHeight = ledHeight;
        this.horizontalGap = horizontalGap;
        this.verticalGap = verticalGap;
        int rowCount = ledLetterFont.rowCount();
        int columnCount = ledLetterFont.columnCount();
        currentValues = new boolean[rowCount][columnCount];
        oldValues = new boolean[rowCount][columnCount];
        for (int r = 0; r < rowCount; r++) {
            for (int c = 0; c < columnCount; c++) {
                currentValues[r][c] = false;
                oldValues[r][c] = false;
            }
        }
    }


    @Override
    public int getRowCount() {
        return currentValues.length;
    }

    @Override
    public int getColumnCount() {
        return currentValues[0].length;
    }

    @Override
    public int getLedWidth() {
        return ledWidth;
    }

    @Override
    public int getLedHeight() {
        return ledHeight;
    }

    @Override
    public void addLedLetterModelListener(LedLetterModelListener l) {
        listenerList.add(LedLetterModelListener.class, l);
    }

    @Override
    public void removeLedLetterModelListener(LedLetterModelListener l) {
        listenerList.remove(LedLetterModelListener.class, l);
    }

    protected void fireValueChanged(int c) {
        for (LedLetterModelListener listener : listenerList.getListeners(LedLetterModelListener.class)) {
            listener.ledLetterChanged(new LedLetterModelEvent(c, this));
        }
    }

    @Override
    public void setOldValues(boolean[][] oldValues) {
        this.oldValues = oldValues;
    }

    @Override
    public boolean[][] getOldValues() {
        return this.oldValues;
    }

    @Override
    public boolean[][] getValues() {
        return this.currentValues;
    }

    @Override
    public void setValues(int c, boolean[][] values) {
        int rowCount = values.length;
        int columnCount = values[0].length;
        final boolean[][] oldValues = valuesCopy(currentValues);
        currentValues = new boolean[rowCount][columnCount];
        for (int r = 0; r < rowCount; r++) {
            System.arraycopy(currentValues[r], 0, oldValues[r], 0, columnCount);
            System.arraycopy(values[r], 0, currentValues[r], 0, columnCount);
        }
        this.setOldValues(oldValues);
        fireValueChanged(c);
    }

    private boolean[][] valuesCopy(boolean[][] ledStates) {
        final int rowCount = ledStates.length;
        final int columnCount = ledStates[0].length;
        final boolean[][] oldValues = new boolean[rowCount][columnCount];
        for (int r = 0; r < rowCount; r++) {
            System.arraycopy(ledStates[r], 0, oldValues[r], 0, columnCount);
        }
        return oldValues;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int r = 0; r < getRowCount(); r++) {
            for (int c = 0; c < getColumnCount(); c++) {
                sb.append(getValues()[r][c] ? "o" : ".");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    @Override
    public LedLetterFont getLedLetterFont() {
        return ledLetterFont;
    }

    @Override
    public int getHorizontalGap() {
        return horizontalGap;
    }

    @Override
    public int getVerticalGap() {
        return verticalGap;
    }
}
