package com.bnpparibas.grp.ledletter;

import javax.swing.*;
import java.awt.*;

/**
 * @author morinb.
 */
public abstract class Led extends JComponent {
    protected final int width;
    protected final int height;
    private Color foregroundColor;
    private Color backgroundColor;
    private boolean on;
    private boolean refreshing;

    public Led() {
        this(5, 5);
    }

    public Led(int width, int height) {
        this(width, height, Color.RED);
    }

    public Led(int width, int height, Color foregroundColor) {
        this(width, height, foregroundColor, Color.BLACK);
    }

    public Led(int width, int height, Color color, Color backgroundColor) {
        this.width = width;
        this.height = height;
        this.foregroundColor = color;
        this.backgroundColor = backgroundColor;
        setOn(false);
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        if (this.on != on) {
            this.on = on;
            repaint();
        }
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void setRefreshing(boolean refreshing) {
        this.refreshing = refreshing;
    }

    public boolean isRefreshing() {
        return refreshing;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (isRefreshing()) {
            return;
        }
        final Graphics2D g2 = (Graphics2D) g;

        g2.setPaint(backgroundColor);
        g2.fillRect(0, 0, width, height);

        if (isOn()) {
            g2.setPaint(foregroundColor);
            draw(g2);
        }

        g2.dispose();
    }

    protected abstract void draw(Graphics2D g2);
}
