package com.bnpparibas.grp.ledletter.effects;

import java.awt.image.Kernel;

/**
 * Created by Baptiste on 19/01/2016.
 */
public class GaussianBlur extends KernelFilter {
    public GaussianBlur() {
        super(new Kernel(3, 3, new float[]{
                1 / 16f, 1 / 8f, 1 / 16f,
                1 / 8f, 1 / 4f, 1 / 8f,
                1 / 16f, 1 / 8f, 1 / 16f,
        }));
    }

    public GaussianBlur(Effect nextEffect) {
        super(new Kernel(3, 3, new float[]{
                1 / 16f, 1 / 8f, 1 / 16f,
                1 / 8f, 1 / 4f, 1 / 8f,
                1 / 16f, 1 / 8f, 1 / 16f,
        }), nextEffect);
    }
}
