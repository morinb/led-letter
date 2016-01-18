package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.OutlinedOvalLed;

/**
 * @author morinb.
 */
public class OutlinedOvalLedFactory implements ILedFactory {
    @Override
    public Led getLed() {
        return new OutlinedOvalLed(8, 8);
    }

}
