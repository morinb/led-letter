package com.bnpparibas.grp.ledletter.leds;

import com.bnpparibas.grp.ledletter.Led;

import java.awt.*;

/**
 * @author morinb.
 */
public class SquareLed extends Led {

    public SquareLed() {
    }

    public SquareLed(int width, int height) {
        super(width, height);
    }

    public SquareLed(int width, int height, Color foregroundColor) {
        super(width, height, foregroundColor);
    }

    public SquareLed(int width, int height, Color color, Color backgroundColor) {
        super(width, height, color, backgroundColor);
    }

    @Override
    protected void draw(Graphics2D g2) {
        g2.fillRect(1, 1, width - 2, height - 2);
    }
}
