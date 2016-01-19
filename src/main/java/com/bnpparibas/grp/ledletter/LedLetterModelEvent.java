package com.bnpparibas.grp.ledletter;

import java.util.EventObject;

/**
 * @author morinb.
 */
public class LedLetterModelEvent extends EventObject {


    private final int c;
    private final LedLetterModel model;

    /**
     * Constructs a prototypical Event.
     *
     * @param c
     * @param model The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public LedLetterModelEvent(int c, LedLetterModel model) {
        super(model);
        this.c = c;
        this.model = model;
    }

    public int getC() {
        return c;
    }

    public LedLetterModel getModel() {
        return model;
    }
}
