package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.factory.ILedFactory;
import com.bnpparibas.grp.ledletter.factory.OutlinedOvalLedFactory;
import com.bnpparibas.grp.ledletter.factory.OutlinedSquareLedFactory;
import com.bnpparibas.grp.ledletter.factory.OvalLedFactory;
import com.bnpparibas.grp.ledletter.factory.SquareLedFactory;

/**
 * @author morinb.
 */
public final class LedFactory {
    enum Type {
        OVAL, SQUARE, OUTLINED_OVAL, OUTLINED_SQUARE
    }

    public static ILedFactory get(Type type) {
        switch (type) {
            case OVAL:
                return new OvalLedFactory();
            case SQUARE:
                return new SquareLedFactory();
            case OUTLINED_OVAL:
                return new OutlinedOvalLedFactory();
            case OUTLINED_SQUARE:
                return new OutlinedSquareLedFactory();
        }
        throw new IllegalArgumentException(type + " is not handled.");
    }
}
