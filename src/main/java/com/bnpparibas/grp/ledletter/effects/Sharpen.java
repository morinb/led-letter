package com.bnpparibas.grp.ledletter.effects;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

/**
 * Created by Baptiste on 18/01/2016.
 */
public class Sharpen extends Effect {
    private static final BufferedImageOp SHARPEN_FILTER = new ConvolveOp(new Kernel(3, 3, new float[]{0.0f, -1.0f, 0.0f, -1.0f, 5.0f, -1.0f, 0.0f, -1.0f, 0.0f}), ConvolveOp.EDGE_NO_OP, null);

    public Sharpen() {
    }

    public Sharpen(Effect nextEffect) {
        super(nextEffect);
    }

    @Override
    public BufferedImage apply(BufferedImage source) {
        return SHARPEN_FILTER.filter(source, null);
    }
}
