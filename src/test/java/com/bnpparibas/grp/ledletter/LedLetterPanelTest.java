package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.factory.SquareLedFactory;

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

        final LedLetter[] ledLetters = new LedLetter[10];


        for (int i = 0; i < ledLetters.length; i++) {
            final LedLetterModel model = new DefaultLedLetterModel();
            ledLetters[i] = new LedLetter(model, new SquareLedFactory());
            final Timer timer = new Timer(2000, new AbstractAction("Led blink" + i) {
                @Override
                public void actionPerformed(ActionEvent e) {
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            for (int r = 0; r < model.getRowCount(); r++) {
                                for (int c = 0; c < model.getColumnCount(); c++) {
                                    model.setValueAt(Math.random() > 0.5, r, c);
                                }
                            }
                        }
                    });
                }
            });
            timer.start();
            f.add(ledLetters[i]);
        }

        double prefW = 0;
        for (LedLetter ledLetter : ledLetters) {
            prefW += 1 + ledLetter.getPreferredSize().getWidth();
        }
        double prefH = 100;

        f.setPreferredSize(new Dimension((int) prefW, (int) prefH));

        f.pack();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}