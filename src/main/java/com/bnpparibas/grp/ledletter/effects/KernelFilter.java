package com.bnpparibas.grp.ledletter.effects;

import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

/**
 * Created by Baptiste on 18/01/2016.
 */
public class KernelFilter extends Effect {
    public final ConvolveOp BLUR_OP;

    public KernelFilter(Kernel kernel) {
        this(kernel, null);
    }

    public KernelFilter(Kernel kernel, Effect nextEffect) {
        super(nextEffect);

        BLUR_OP = new ConvolveOp(kernel);
    }


    @Override
    public BufferedImage apply(BufferedImage source) {
        return BLUR_OP.filter(source, null);
    }

}
