package com.bnpparibas.grp.ledletter.effects;

import java.awt.image.Kernel;

/**
 * Created by Baptiste on 18/01/2016.
 */
public class Blur extends KernelFilter {


    public Blur() {
        super(new Kernel(3, 3, new float[]{1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f,}));
    }

    public Blur(Effect nextEffect) {
        super(new Kernel(3, 3, new float[]{1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f, 1 / 9f,}), nextEffect);
    }
}
