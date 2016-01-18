package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.OvalLed;

/**
 * @author morinb.
 */
public class OvalLedFactory implements ILedFactory {
    @Override
    public Led getLed() {
        return new OvalLed(8, 8);
    }

}
