package com.bnpparibas.grp.ledletter;

/**
 * <p>The <code>LedLetterModel</code> interface specifies the methods the
 * <code>LedLetter</code> will use to interrogate a tabular data model.</p>
 * <p/>
 * <p>The <code>LedLetter</code> can be set up to display any data model
 * which implements the <code>LedLetterModel</code> with a couple of
 * lines of code: </p>
 * <p/>
 * <p>
 * <pre>
 *     LedLetterModel model = new MyLedLetterModel();
 *     LedLetter ledLetter = new LedLetter(model);
 *
 * </pre>
 * </p>
 *
 * @author morinb.
 * @see LedLetter
 */
public interface LedLetterModel {
    /**
     * @param rowIndex    the row based coordinate of the led.
     * @param columnIndex the column based coordinate of the led.
     * @return the status of the led. <code>true</code> for "ON", <code>false</code> for "OFF".
     */
    boolean getValueAt(int rowIndex, int columnIndex);

    /**
     * @param value       the status of the led. <code>true</code> for "ON", <code>false</code> for "OFF".
     * @param rowIndex    the row based coordinate of the led.
     * @param columnIndex the column based coordinate of the led.
     */
    void setValueAt(boolean value, int rowIndex, int columnIndex);

    /**
     * @return the number of led per rows.
     */
    int getRowCount();

    /**
     * @return the number of led per columns.
     */
    int getColumnCount();

    /**
     * Adds a listener to the list that is notified each time a change
     * to the data model occurs.
     * @param l the LedLetterModelListener
     */
    void addLedLetterModelListener(LedLetterModelListener l);

    /**
     * Removes a listener from the list that is notified each time a
     * change to the data model occurs.
     * @param l the LedLetterModelListener
     */
    void removeLedLetterModelListener(LedLetterModelListener l);


}
