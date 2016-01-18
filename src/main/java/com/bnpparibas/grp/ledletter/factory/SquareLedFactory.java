package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.OvalLed;
import com.bnpparibas.grp.ledletter.leds.SquareLed;

import java.awt.Color;

/**
 * @author morinb.
 */
public class SquareLedFactory implements ILedFactory {
    @Override
    public Led getLed() {
        return new SquareLed();
    }

    @Override
    public Led getLed(int w, int h) {
        return new SquareLed(w, h);
    }

    @Override
    public Led getLed(int w, int h, Color f) {
        return new SquareLed(w, h, f);
    }

    @Override
    public Led getLed(int w, int h, Color f, Color b) {
        return new SquareLed(w, h, f, b);
    }
}
