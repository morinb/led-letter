package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.SquareLed;

import java.awt.*;

/**
 * @author morinb.
 */
public class SquareLedFactory implements ILedFactory {
    private final int ledSize;
    private final Color color;

    public SquareLedFactory(int ledSize, Color color) {

        this.ledSize = ledSize;
        this.color = color;
    }

    @Override
    public Led getLed() {
        return new SquareLed(ledSize, ledSize, color);
    }

}
