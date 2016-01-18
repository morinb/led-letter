package com.bnpparibas.grp.ledletter;

import java.util.EventObject;

/**
 * @author morinb.
 */
public class LedLetterModelEvent extends EventObject {

    private final LedLetterModel ledLetterModel;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public LedLetterModelEvent(LedLetterModel source) {
        super(source);
        this.ledLetterModel = source;
    }

    public LedLetterModel getLedLetterModel() {
        return ledLetterModel;
    }
}
