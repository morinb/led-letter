package com.bnpparibas.grp.ledletter;

import javax.swing.event.EventListenerList;

/**
 * @author morinb.
 */
public class DefaultLedLetterModel implements LedLetterModel {
    private boolean[][] value;
    private EventListenerList listenerList = new EventListenerList();

    public DefaultLedLetterModel(int columnCount, int rowCount) {
        value = new boolean[rowCount][columnCount];
        for (int r = 0; r < rowCount; r++) {
            for (int c = 0; c < columnCount; c++) {
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
    public void setValues(boolean[][] values) {
        int rowCount = values.length;
        int columnCount = values[0].length;
        value = new boolean[rowCount][columnCount];
        for (int r = 0; r < rowCount; r++) {
            for (int c = 0; c < columnCount; c++) {
                value[r][c] = values[r][c];
            }
        }
        fireValueChanged();
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
