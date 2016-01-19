package com.bnpparibas.grp.ledletter.leds;

import com.bnpparibas.grp.ledletter.Led;

import java.awt.*;

/**
 * @author morinb.
 */
public class OvalLed extends Led {

    public OvalLed() {
    }

    public OvalLed(int width, int height) {
        super(width, height);
    }

    public OvalLed(int width, int height, Color foregroundColor) {
        super(width, height, foregroundColor);
    }

    public OvalLed(int width, int height, Color color, Color backgroundColor) {
        super(width, height, color, backgroundColor);
    }

    @Override
    protected void draw(Graphics2D g2) {
        g2.fillOval(0, 0, width - 1, height - 1);
    }
}
