package com.bnpparibas.grp.ledletter;

import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.TextLayout;

/**
 * @author morinb.
 */
public class LedLetterController {
    private LedLetter ledLetter;
    private Font font;


    public LedLetterController(LedLetter ledLetter, Font font) {
        this.ledLetter = ledLetter;
        this.font = font;
    }

    public void displayChar(char c) {

        Graphics2D g2 = (Graphics2D) ledLetter.getGraphics();
        TextLayout textLayout = new TextLayout("" + c, font, g2.getFontRenderContext());

        System.out.println(textLayout);


    }


}
