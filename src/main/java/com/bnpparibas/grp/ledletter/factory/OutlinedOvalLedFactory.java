package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.OutlinedOvalLed;

/**
 * @author morinb.
 */
public class OutlinedOvalLedFactory implements ILedFactory {
    private final int ledSize;

    public OutlinedOvalLedFactory(int ledSize) {

        this.ledSize = ledSize;
    }

    @Override
    public Led getLed() {
        return new OutlinedOvalLed(ledSize, ledSize);
    }

}
