package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.factory.LedDrawerFactory;
import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImageOp;

/**
 * @author morinb.
 */
public class LedLetterPanelTest {

    public static void main(String[] args) {
        JFrame f = new JFrame("LedTest");
        f.setLayout(new BorderLayout());

        final LedLetterControllerController controllerController = new LedLetterControllerController();
        controllerController.setForegroundColor(Color.RED);
        Color VINGT = new Color(1.0f, 0.0f, 0.0f, 0.2f);
        Color TRENTE = new Color(1.0f, 0.0f, 0.0f, 0.3f);
        Color CINQUANTE = new Color(1.0f, 0.0f, 0.0f, 0.5f);
        Color SOIXANTEDIX = new Color(1.0f, 0.0f, 0.0f, 0.7f);
        Color QUATREVINGTDIX = new Color(1.0f, 0.0f, 0.0f, 0.9f);
        Color CENT = new Color(1.0f, 0.0f, 0.0f, 1.0f);
        final Color[] colors = {
              VINGT,
              VINGT,
              TRENTE,
              TRENTE,
              CINQUANTE,
              CINQUANTE,
              SOIXANTEDIX,
              SOIXANTEDIX,
              QUATREVINGTDIX,
              QUATREVINGTDIX,
              CENT,
              CENT,
              CENT,
              CENT,
              CENT,
              CENT,
              CENT,
              QUATREVINGTDIX,
              QUATREVINGTDIX,
              SOIXANTEDIX,
              SOIXANTEDIX,
              CINQUANTE,
              CINQUANTE,
              TRENTE,
              TRENTE,
              VINGT,
              VINGT,
        };
        final LedLetter[] ledLetters = new LedLetter[27];


        BufferedImageOp[] e = new BufferedImageOp[]{

        };

        for (int i = 0; i < ledLetters.length; i++) {
            final LedLetterModel model = new DefaultLedLetterModel(LedLetterFont.LLF_5x7, 3, 3, 1, 1);
            ledLetters[i] = new LedLetter(model, LedDrawerFactory.getSquareLedDrawer());
            ledLetters[i].setEffects(e);
            LedLetterController controller = new LedLetterController(ledLetters[i]);
            controller.setForegroundColor(colors[i % colors.length]);
            controllerController.addController(controller);
        }
        controllerController.setSpeed(100);

        LedLetterPanel panel = new LedLetterPanel(controllerController);
        f.add(panel, BorderLayout.CENTER);
        f.pack();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);


        controllerController.displayString("/!\\ Warning /!\\ Application will restart in 5 minutes.");
        controllerController.setBlinking(true);
        controllerController.setBlinkEveryXFrames(10);


    }


}
