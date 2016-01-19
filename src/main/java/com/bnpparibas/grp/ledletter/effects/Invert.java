package com.bnpparibas.grp.ledletter.effects;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ByteLookupTable;
import java.awt.image.LookupOp;

/**
 * Created by Baptiste on 18/01/2016.
 */
public class Invert extends Effect {

    public Invert() {
    }

    public Invert(Effect nextEffect) {
        super(nextEffect);
    }


    @Override
    public BufferedImage apply(BufferedImage source) {
        byte[] invertArray = new byte[256];

        for (int counter = 0; counter < 256; counter++)
            invertArray[counter] = (byte) (255 - counter);

        BufferedImageOp invertFilter = new LookupOp(new ByteLookupTable(0, invertArray), null);
        return invertFilter.filter(source, null);

    }

}
