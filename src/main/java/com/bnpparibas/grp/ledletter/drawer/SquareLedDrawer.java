package com.bnpparibas.grp.ledletter.drawer;

import java.awt.Graphics;

/**
 * Created by Baptiste on 18/01/2016.
 */
public class SquareLedDrawer implements ILedDrawer {
    private final boolean outlined;

    public SquareLedDrawer(boolean outlined) {
        this.outlined = outlined;
    }

    @Override
    public void drawLed(Graphics g, int x, int y, int width, int height) {
        if (outlined) {
            g.drawRect(x, y, width, height);
        } else {
            g.fillRect(x, y, width, height);
        }
    }
}
