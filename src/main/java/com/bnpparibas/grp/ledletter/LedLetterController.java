package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.fonts.FontFormat5x7;
import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;
import com.bnpparibas.grp.ledletter.fonts.LetterDescription;

/**
 * @author morinb.
 */
public class LedLetterController {
    private LetterDescription[] values = null;
    private LedLetter ledLetter;


    public LedLetterController(LedLetter ledLetter, LedLetterFont ledLetterFont) {
        this.ledLetter = ledLetter;
        switch (ledLetterFont) {
            case LLF_5x7:
                this.values = FontFormat5x7.values();
            default:
                this.values = FontFormat5x7.values();
        }
    }

    public void displayChar(int c) {
        for (LetterDescription ff : values) {
            if (ff.getIntLetter() == c) {
                String[] hexa = ff.getHexLetter().split(" ");
                for (int j = 0; j < ff.bytes() * ff.width(); j += ff.bytes()) {
                    for (int b = 0; b < ff.bytes(); b++) {
                        String bin = HexUtils.hex2bin(hexa[j + b]);
                        for (int k = 8 * b; k < Math.min(8 * (b + 1), ff.height()); k++) {
                            final int colIndex = (j / ff.bytes());
                            ledLetter.getModel().setValueAt((bin.charAt(k - 8 * b) == '1'), k, colIndex);
                        }
                    }
                }
            }
        }

    }


}
