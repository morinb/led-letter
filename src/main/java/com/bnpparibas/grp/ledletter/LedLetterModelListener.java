package com.bnpparibas.grp.ledletter;

import java.util.EventListener;

/**
 * LedLetterModelListener defines the interface for an object that listens
 * to changes in a LedLetterModel.
 *
 * @author morinb.
 */
public interface LedLetterModelListener extends EventListener {
    void ledLetterChanged(LedLetterModelEvent e);
}
