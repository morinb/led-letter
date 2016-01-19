package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.factory.LedDrawerFactory;
import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.Color;

/**
 * @author morinb.
 */
public class LedLetterTest {

    public static void main(String[] args) {
        JFrame f = new JFrame("LedTest");


        final LedLetterModel model = new DefaultLedLetterModel(LedLetterFont.LLF_15x32, 15, 15);
        final LedLetter ledLetter = new LedLetter(model, LedDrawerFactory.getSquareLedDrawer());
        ledLetter.setForeground(
              new Color(1.0f, 0.0f, 0.0f, 0.25f));
        //ledLetter.setEffects(new BufferedImageOp[]{new BlurFilter()});
        f.add(ledLetter);

        f.pack();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

        LedLetterController controller = new LedLetterController(ledLetter);

        controller.displayChar('M');
    }

}