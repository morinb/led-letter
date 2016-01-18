package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;
import com.bnpparibas.grp.ledletter.leds.OutlinedSquareLed;

/**
 * @author morinb.
 */
public class OutlinedSquareLedFactory implements ILedFactory {
    @Override
    public Led getLed() {
        return new OutlinedSquareLed(8, 8);
    }

}
