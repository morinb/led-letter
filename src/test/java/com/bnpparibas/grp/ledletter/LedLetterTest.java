package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;

/**
 * @author morinb.
 */
public class LedLetterTest {

    public static void main(String[] args) {
        JFrame f = new JFrame("LedTest");


        final LedLetterModel model = new DefaultLedLetterModel(5, 7);
        final LedLetter ledLetter = new LedLetter(model);

        f.add(ledLetter);

        f.setSize(200, 200);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

        LedLetterController controller = new LedLetterController(ledLetter, LedLetterFont.LLF_5x7);
        controller.displayChar('M');
    }

}