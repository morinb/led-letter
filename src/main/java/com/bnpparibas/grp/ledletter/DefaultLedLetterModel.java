package com.bnpparibas.grp.ledletter;

import javax.swing.event.EventListenerList;

/**
 * @author morinb.
 */
public class DefaultLedLetterModel implements LedLetterModel {
    public static final int COLUMNS = 5;
    public static final int ROWS = 7;
    private boolean[][] value = new boolean[ROWS][COLUMNS];
    private EventListenerList listenerList = new EventListenerList();

    public DefaultLedLetterModel() {
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLUMNS; c++) {
                value[r][c] = false;
            }
        }
    }

    @Override
    public boolean getValueAt(int rowIndex, int columnIndex) {
        return value[rowIndex][columnIndex];
    }

    @Override
    public void setValueAt(boolean value, int rowIndex, int columnIndex) {
        this.value[rowIndex][columnIndex] = value;
        fireValueChanged();
    }

    @Override
    public int getRowCount() {
        return value.length;
    }

    @Override
    public int getColumnCount() {
        return value[0].length;
    }

    @Override
    public void addLedLetterModelListener(LedLetterModelListener l) {
        listenerList.add(LedLetterModelListener.class, l);
    }

    @Override
    public void removeLedLetterModelListener(LedLetterModelListener l) {
        listenerList.remove(LedLetterModelListener.class, l);
    }

    protected void fireValueChanged() {
        for (LedLetterModelListener listener : listenerList.getListeners(LedLetterModelListener.class)) {
            listener.ledLetterChanged(new LedLetterModelEvent(this));
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int r = 0; r < getRowCount(); r++) {
            for (int c = 0; c < getColumnCount(); c++) {
                sb.append(getValueAt(r, c) ? "o" : ".");
            }
            sb.append("\n");
        }

        return sb.toString();
    }
}
