package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.SquareLed;

/**
 * @author morinb.
 */
public class SquareLedFactory implements ILedFactory {
    private final int ledSize;

    public SquareLedFactory(int ledSize) {

        this.ledSize = ledSize;
    }

    @Override
    public Led getLed() {
        return new SquareLed(ledSize, ledSize);
    }

}
