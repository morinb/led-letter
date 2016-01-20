package com.bnpparibas.grp.ledletter.smooth;

import com.bnpparibas.grp.ledletter.DefaultLedLetterModel;
import com.bnpparibas.grp.ledletter.LedLetterModel;
import com.bnpparibas.grp.ledletter.LedLetterPanel;
import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Dimension;

/**
 * @author morinb.
 */
public class SmoothLedLetterPanelTest {

    public static void main(String[] args) {
        JFrame f = new JFrame("Smooth Led Test");
        f.setLayout(new BorderLayout());


        LedLetterFont font = LedLetterFont.LLF_7x9;
        Dimension ledDimension = new Dimension(4, 4);
        Dimension gap = new Dimension(1, 1);

        final LedLetterModel model = new DefaultLedLetterModel(font, ledDimension, gap);
        LedLetterPanel smooth = new LedLetterPanel(model, LedLetterPanel.getNumberOfCharsForSpecifiedWidth(1600, false, model), 30);
        System.out.println(LedLetterPanel.getNumberOfCharsForSpecifiedWidth(1600, true, model));
        System.out.println(LedLetterPanel.getNumberOfCharsForSpecifiedWidth(1600, false, model));

        f.add(smooth, BorderLayout.CENTER);
        f.pack();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);

        smooth.displayMessage("/!\\ Warning /!\\ Application will restart in 5 minutes.");


    }


}