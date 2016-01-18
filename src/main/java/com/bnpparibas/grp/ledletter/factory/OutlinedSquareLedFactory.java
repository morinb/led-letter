package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.OutlinedSquareLed;

/**
 * @author morinb.
 */
public class OutlinedSquareLedFactory implements ILedFactory {
    private final int ledSize;

    public OutlinedSquareLedFactory(int ledSize) {

        this.ledSize = ledSize;
    }

    @Override
    public Led getLed() {
        return new OutlinedSquareLed(ledSize, ledSize);
    }

}
