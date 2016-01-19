package com.bnpparibas.grp.ledletter.effects;

import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorConvertOp;

/**
 * Created by Baptiste on 19/01/2016.
 */
public class GrayscaleEffect extends Effect {

    public GrayscaleEffect() {
    }

    public GrayscaleEffect(Effect nextEffect) {
        super(nextEffect);
    }

    @Override
    protected BufferedImage apply(BufferedImage source) {
        BufferedImageOp op = new ColorConvertOp(
                ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
        return op.filter(source, null);
    }
}
