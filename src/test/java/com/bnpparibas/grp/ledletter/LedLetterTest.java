package com.bnpparibas.grp.ledletter;

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


        final LedLetterModel model = new DefaultLedLetterModel(LedLetterFont.LLF_15x32, 5, 5);
        final LedLetter ledLetter = new LedLetter(model);

        f.add(ledLetter);

        f.setSize(200, 200);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

        LedLetterController controller = new LedLetterController(ledLetter);
        controller.setForegroundColor(Color.RED);
        controller.displayChar(' ');
    }

}