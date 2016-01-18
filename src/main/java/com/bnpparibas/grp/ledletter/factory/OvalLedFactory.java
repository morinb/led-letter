package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.OvalLed;

/**
 * @author morinb.
 */
public class OvalLedFactory implements ILedFactory {
    private final int ledSize;

    public OvalLedFactory(int ledSize) {

        this.ledSize = ledSize;
    }

    @Override
    public Led getLed() {
        return new OvalLed(ledSize, ledSize);
    }

}
