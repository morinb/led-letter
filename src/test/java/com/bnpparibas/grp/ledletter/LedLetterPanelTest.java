package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.factory.LedDrawerFactory;
import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.*;

/**
 * @author morinb.
 */
public class LedLetterPanelTest {

    public static void main(String[] args) {
        JFrame f = new JFrame("LedTest");
        f.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

        final LedLetterControllerController controllerController = new LedLetterControllerController();
        //controllerController.setBackgroungColor(Color.black);
        Color VINGT = new Color(1.0f, 0.0f, 0.0f, 0.2f);
        Color TRENTE = new Color(1.0f, 0.0f, 0.0f, 0.3f);
        Color CINQUANTE = new Color(1.0f, 0.0f, 0.0f, 0.5f);
        Color SOIXANTEDIX = new Color(1.0f, 0.0f, 0.0f, 0.7f);
        Color QUATREVINGTDIX = new Color(1.0f, 0.0f, 0.0f, 0.9f);
        Color CENT = new Color(1.0f, 0.0f, 0.0f, 1.0f);
        final Color[] colors = {
                VINGT,
                TRENTE,
                CINQUANTE,
                SOIXANTEDIX,
                QUATREVINGTDIX,
                CENT,
                CENT,
                CENT,
                CENT,
                CENT,
                QUATREVINGTDIX,
                SOIXANTEDIX,
                CINQUANTE,
                TRENTE,
                VINGT,
        };
        final LedLetter[] ledLetters = new LedLetter[colors.length];


        for (int i = 0; i < ledLetters.length; i++) {
            final LedLetterModel model = new DefaultLedLetterModel(LedLetterFont.LLF_15x32, 5, 5);
            ledLetters[i] = new LedLetter(model, LedDrawerFactory.getDefaultDrawer());
            LedLetterController controller = new LedLetterController(ledLetters[i]);
            controller.setForegroundColor(colors[i % colors.length]);
            controllerController.addController(controller);
            controllerController.setSpeed(150);
            f.add(ledLetters[i]);
        }

        double prefW = 1200;

        double prefH = 300;

        f.setPreferredSize(new Dimension((int) prefW + 100, (int) prefH));

        f.pack();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);


        controllerController.displayString("ABCDEFGH 12345678");

    }


}
