package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.factory.ILedFactory;
import com.bnpparibas.grp.ledletter.factory.OutlinedOvalLedFactory;
import com.bnpparibas.grp.ledletter.factory.OutlinedSquareLedFactory;
import com.bnpparibas.grp.ledletter.factory.OvalLedFactory;
import com.bnpparibas.grp.ledletter.factory.SquareLedFactory;

import java.awt.*;

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
        return get(type, 5, Color.RED);
    }

    public static ILedFactory get(Type type, int ledSize) {
        return get(type, ledSize, Color.RED);
    }

    public static ILedFactory get(Type type, Color color) {
        return get(type, 5, color);
    }

    public static ILedFactory get(Color color) {
        return get(Type.SQUARE, 5, color);
    }

    public static ILedFactory get(int ledSize) {
        return get(Type.SQUARE, ledSize, Color.RED);
    }



    public static ILedFactory get(Type type, int ledSize, Color color) {
        switch (type) {
            case OVAL:
                return new OvalLedFactory(ledSize, color);
            case SQUARE:
                return new SquareLedFactory(ledSize, color);
            case OUTLINED_OVAL:
                return new OutlinedOvalLedFactory(ledSize, color);
            case OUTLINED_SQUARE:
                return new OutlinedSquareLedFactory(ledSize, color);
        }
        throw new IllegalArgumentException(type + " is not handled.");
    }
}
