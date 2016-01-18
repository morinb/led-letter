package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.OutlinedOvalLed;

import java.awt.*;

/**
 * @author morinb.
 */
public class OutlinedOvalLedFactory implements ILedFactory {
    private final int ledSize;
    private final Color color;

    public OutlinedOvalLedFactory(int ledSize, Color color) {

        this.ledSize = ledSize;
        this.color = color;
    }

    @Override
    public Led getLed() {
        return new OutlinedOvalLed(ledSize, ledSize, color);
    }

}
