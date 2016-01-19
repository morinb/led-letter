package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;

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
     * @return the number of led per rows.
     */
    int getRowCount();

    /**
     * @return the number of led per columns.
     */
    int getColumnCount();

    /**
     * @return the width of a Led.
     */
    int getLedWidth();

    /**
     * @return the height of a Led.
     */
    int getLedHeight();

    /**
     * Adds a listener to the list that is notified each time a change
     * to the data model occurs.
     *
     * @param l the LedLetterModelListener
     */
    void addLedLetterModelListener(LedLetterModelListener l);

    /**
     * Removes a listener from the list that is notified each time a
     * change to the data model occurs.
     *
     * @param l the LedLetterModelListener
     */
    void removeLedLetterModelListener(LedLetterModelListener l);


    /**
     * @return the String representation of the model.
     */
    String toString();

    void setValues(int c, boolean[][] values);

    void setOldValues(boolean[][] oldValues);

    boolean[][] getOldValues();

    boolean[][] getValues();

    LedLetterFont getLedLetterFont();

    int getHorizontalGap();

    int getVerticalGap();
}
