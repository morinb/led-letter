package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.OvalLed;

import java.awt.*;

/**
 * @author morinb.
 */
public class OvalLedFactory implements ILedFactory {
    private final int ledSize;
    private final Color color;

    public OvalLedFactory(int ledSize, Color color) {

        this.ledSize = ledSize;
        this.color = color;
    }

    @Override
    public Led getLed() {
        return new OvalLed(ledSize, ledSize, color);
    }

}
