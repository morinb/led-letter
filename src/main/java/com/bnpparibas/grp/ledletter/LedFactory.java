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

    public static ILedFactory get() {
        return get(Type.SQUARE);
    }

    public static ILedFactory get(Type type) {
        return get(type, 5);
    }

    public static ILedFactory get(Type type, int ledSize) {
        switch (type) {
            case OVAL:
                return new OvalLedFactory(ledSize);
            case SQUARE:
                return new SquareLedFactory(ledSize);
            case OUTLINED_OVAL:
                return new OutlinedOvalLedFactory(ledSize);
            case OUTLINED_SQUARE:
                return new OutlinedSquareLedFactory(ledSize);
        }
        throw new IllegalArgumentException(type + " is not handled.");
    }
}
