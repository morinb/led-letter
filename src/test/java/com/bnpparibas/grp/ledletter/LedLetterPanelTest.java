package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.factory.OvalLedFactory;
import com.bnpparibas.grp.ledletter.factory.SquareLedFactory;
import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author morinb.
 */
public class LedLetterPanelTest {

    public static void main(String[] args) {
        JFrame f = new JFrame("LedTest");
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        final LedLetterControllerController controllerController = new LedLetterControllerController();
        final LedLetter[] ledLetters = new LedLetter[6];


        for (int i = 0; i < ledLetters.length; i++) {
            final LedLetterModel model = new DefaultLedLetterModel(5,7);
            ledLetters[i] = new LedLetter(model, LedFactory.get(LedFactory.Type.SQUARE));
            controllerController.addController(new LedLetterController(ledLetters[i], LedLetterFont.LLF_5x7));
            controllerController.setSpeed(150);
            f.add(ledLetters[i]);
        }

        double prefW = 1200;

        double prefH = 300;

        f.setPreferredSize(new Dimension((int) prefW + 100, (int) prefH));

        f.pack();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);


        controllerController.displayString("Hi my name is Led-Letter !");

    }
}
