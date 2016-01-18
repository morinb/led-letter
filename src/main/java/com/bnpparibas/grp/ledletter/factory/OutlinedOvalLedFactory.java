package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.OutlinedOvalLed;
import com.bnpparibas.grp.ledletter.leds.OvalLed;

import java.awt.Color;

/**
 * @author morinb.
 */
public class OutlinedOvalLedFactory implements ILedFactory {
    @Override
    public Led getLed() {
        return new OutlinedOvalLed();
    }

    @Override
    public Led getLed(int w, int h) {
        return new OutlinedOvalLed(w, h);
    }

    @Override
    public Led getLed(int w, int h, Color f) {
        return new OutlinedOvalLed(w, h, f);
    }

    @Override
    public Led getLed(int w, int h, Color f, Color b) {
        return new OutlinedOvalLed(w, h, f, b);
    }
}
