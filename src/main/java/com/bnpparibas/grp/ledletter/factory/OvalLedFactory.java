package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.OvalLed;

import java.awt.Color;

/**
 * @author morinb.
 */
public class OvalLedFactory implements ILedFactory {
    @Override
    public Led getLed() {
        return new OvalLed();
    }

    @Override
    public Led getLed(int w, int h) {
        return new OvalLed(w, h);
    }

    @Override
    public Led getLed(int w, int h, Color f) {
        return new OvalLed(w, h, f);
    }

    @Override
    public Led getLed(int w, int h, Color f, Color b) {
        return new OvalLed(w, h, f, b);
    }
}
