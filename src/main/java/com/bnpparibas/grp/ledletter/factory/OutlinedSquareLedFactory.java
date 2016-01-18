package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.OutlinedSquareLed;

import java.awt.Color;

/**
 * @author morinb.
 */
public class OutlinedSquareLedFactory implements ILedFactory {
    @Override
    public Led getLed() {
        return new OutlinedSquareLed();
    }

    @Override
    public Led getLed(int w, int h) {
        return new OutlinedSquareLed(w, h);
    }

    @Override
    public Led getLed(int w, int h, Color f) {
        return new OutlinedSquareLed(w, h, f);
    }

    @Override
    public Led getLed(int w, int h, Color f, Color b) {
        return new OutlinedSquareLed(w, h, f, b);
    }
}
