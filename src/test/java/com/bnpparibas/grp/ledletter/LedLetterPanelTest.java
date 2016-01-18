package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.factory.OvalLedFactory;
import com.bnpparibas.grp.ledletter.factory.SquareLedFactory;
import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
            final LedLetterModel model = new DefaultLedLetterModel();
            ledLetters[i] = new LedLetter(model, LedFactory.get(LedFactory.Type.SQUARE));
            controllerController.addController(new LedLetterController(ledLetters[i], LedLetterFont.LLF_5x7));
            f.add(ledLetters[i]);
        }

        double prefW = 0;
        for (LedLetter ledLetter : ledLetters) {
            prefW += 1 + ledLetter.getPreferredSize().getWidth();
        }
        double prefH = 100;

        f.setPreferredSize(new Dimension((int) prefW+100, (int) prefH));

        f.pack();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);


        controllerController.displayString("Coucou Mourad !");
    }
}
