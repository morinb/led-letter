package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.OutlinedSquareLed;

import java.awt.*;

/**
 * @author morinb.
 */
public class OutlinedSquareLedFactory implements ILedFactory {
    private final int ledSize;
    private final Color color;

    public OutlinedSquareLedFactory(int ledSize, Color color) {
        this.ledSize = ledSize;
        this.color = color;
    }

    @Override
    public Led getLed() {
        return new OutlinedSquareLed(ledSize, ledSize, color);
    }

}
