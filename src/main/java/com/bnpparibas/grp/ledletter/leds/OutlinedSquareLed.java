package com.bnpparibas.grp.ledletter.leds;

import com.bnpparibas.grp.ledletter.Led;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * @author morinb.
 */
public class OutlinedSquareLed extends Led {

    public OutlinedSquareLed() {
    }

    public OutlinedSquareLed(int width, int height) {
        super(width, height);
    }

    public OutlinedSquareLed(int width, int height, Color foregroundColor) {
        super(width, height, foregroundColor);
    }

    public OutlinedSquareLed(int width, int height, Color color, Color backgroundColor) {
        super(width, height, color, backgroundColor);
    }

    @Override
    protected void draw(Graphics2D g2) {
        g2.drawRect(1, 1, width - 2, height - 2);
    }
}
