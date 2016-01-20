package com.bnpparibas.grp.ledletter.smooth;

import com.bnpparibas.grp.ledletter.DefaultLedLetterModel;
import com.bnpparibas.grp.ledletter.LedLetterModel;
import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.image.BufferedImageOp;

/**
 * @author morinb.
 */
public class SmoothLedLetterPanelTest {

    public static void main(String[] args) {
        JFrame f = new JFrame("Smooth Led Test");
        f.setLayout(new BorderLayout());

        final LedLetterModel model = new DefaultLedLetterModel(LedLetterFont.LLF_7x9, 4, 4, 1, 1);
        LedLetterPanel smooth = new LedLetterPanel(model, 60, 30);
        smooth.setEffects(new BufferedImageOp[]{
        });

        f.add(smooth, BorderLayout.CENTER);
        f.pack();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

        smooth.displayMessage("/!\\ Warning /!\\ Application will restart in 5 minutes.");


    }

}