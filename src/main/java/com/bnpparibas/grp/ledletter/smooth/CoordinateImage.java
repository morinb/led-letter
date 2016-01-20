package com.bnpparibas.grp.ledletter.smooth;

import java.awt.image.BufferedImage;

/**
 * @author morinb.
 */
public class CoordinateImage {
    private final BufferedImage letterImage;
    private final int letterX;
    private final int letterY;

    public CoordinateImage(BufferedImage letterImage, int letterX, int letterY) {

        this.letterImage = letterImage;
        this.letterX = letterX;
        this.letterY = letterY;
    }

    public BufferedImage getLetterImage() {
        return letterImage;
    }

    public int getLetterX() {
        return letterX;
    }

    public int getLetterY() {
        return letterY;
    }
}
