package com.bnpparibas.grp.ledletter.effects;

import java.awt.image.Kernel;

/**
 * Created by Baptiste on 19/01/2016.
 */
public class ContourEffect extends KernelFilter {
    public ContourEffect() {
        this(null);
    }

    public ContourEffect(Effect nextEffect) {
        super(new Kernel(3, 3, new float[]{
                -1.0f, 0, 1.0f,
                -1.0f, 0, 1.0f,
                -1.0f, 0, 1.0f,
        }), nextEffect);
    }
}
