package com.bnpparibas.grp.ledletter;

import java.util.EventObject;

/**
 * @author morinb.
 */
public class LedLetterModelEvent extends EventObject {


    private final LedLetterModel model;

    /**
     * Constructs a prototypical Event.
     *
     * @param model The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public LedLetterModelEvent(LedLetterModel model) {
        super(model);
        this.model = model;
    }

    public LedLetterModel getModel() {
        return model;
    }
}
