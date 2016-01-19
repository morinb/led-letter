package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.effects.Blur;
import com.bnpparibas.grp.ledletter.effects.Effect;
import com.bnpparibas.grp.ledletter.factory.LedDrawerFactory;
import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;

import javax.swing.*;
import java.awt.*;

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
        final LedLetter[] ledLetters = new LedLetter[40];

        final Effect[] effects = {
                new Blur(),
                /*new ContourEffect(),
                new GaussianBlur(),
                new Invert(),
                new Sharpen(),*/
                // new GrayscaleEffect(),
                /*new KernelFilter(new Kernel(3, 3, new float[]{
                        -1f, -1f, -1f,
                        -1f, 5f, -1f,
                        -1f, -1f, -1f}))*/
        };

        for (int i = 0; i < ledLetters.length; i++) {
            final LedLetterModel model = new DefaultLedLetterModel(LedLetterFont.LLF_7x9, 4, 4);
            ledLetters[i] = new LedLetter(model, LedDrawerFactory.getOvalLedDrawer());
            //ledLetters[i].setEffect(effects[i % effects.length]);
            LedLetterController controller = new LedLetterController(ledLetters[i]);
            //controller.setForegroundColor(colors[i % colors.length]);
            controllerController.addController(controller);
        }
        controllerController.setSpeed(100);

        LedLetterPanel panel = new LedLetterPanel(controllerController);
        f.add(panel, BorderLayout.CENTER);
        f.pack();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);


        controllerController.displayString("/!\\ Warning /!\\ Application will restart in 5 minutes.");

    }


}
