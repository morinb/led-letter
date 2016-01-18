package com.bnpparibas.grp.ledletter.drawer;

import java.awt.*;

/**
 * Created by Baptiste on 18/01/2016.
 */
public class DefaultLedDrawer implements ILedDrawer {
    @Override
    public void drawLed(Graphics g, int x, int y, int width, int height) {
        g.fillOval(x, y, width, height);
    }
}
