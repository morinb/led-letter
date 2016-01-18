package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.SquareLed;

/**
 * @author morinb.
 */
public class SquareLedFactory implements ILedFactory {
    @Override
    public Led getLed() {
        return new SquareLed(4, 4);
    }

}
