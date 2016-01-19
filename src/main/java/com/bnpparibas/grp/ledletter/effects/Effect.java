package com.bnpparibas.grp.ledletter.effects;

import java.awt.image.BufferedImage;

/**
 * Created by Baptiste on 18/01/2016.
 */
public abstract class Effect {
    protected Effect next;

    public Effect() {
        this(null);
    }

    public Effect(Effect nextEffect) {
        next = nextEffect;
    }

    public BufferedImage applyEffectChainOn(BufferedImage source) {
        BufferedImage bi = apply(source);
        if (next != null) {
            bi = next.applyEffectChainOn(bi);
        }

        return bi;
    }

    protected abstract BufferedImage apply(BufferedImage source);
}
