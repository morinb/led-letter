package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.fonts.*;

import java.awt.*;
import java.util.BitSet;

/**
 * @author morinb.
 */
public class LedLetterController {
    private LetterDescription[] values = null;
    private LedLetter ledLetter;


    public LedLetterController(LedLetter ledLetter) {
        this.ledLetter = ledLetter;
        switch (ledLetter.getModel().getLedLetterFont()) {
            case LLF_5x7:
                this.values = FontFormat5x7.values();
                break;
            case LLF_7x7:
                this.values = FontFormat7x7.values();
                break;
            case LLF_7x9:
                this.values = FontFormat7x9.values();
                break;
            case LLF_8x14:
                this.values = FontFormat8x14.values();
                break;
            case LLF_10x14:
                this.values = FontFormat10x14.values();
                break;
            case LLF_8x16:
                this.values = FontFormat8x16.values();
                break;
            case LLF_10x16:
                this.values = FontFormat10x16.values();
                break;
            case LLF_15x32:
                this.values = FontFormat15x32.values();
                break;
        }
        initializeFont(this.values);
    }

    // Adaptation of jfxtras MatrixPanel
    private boolean[][][] matrix = null;

    private void initializeFont(LetterDescription[] values) {
        matrix = new boolean[256][values[0].height()][values[0].width()];
        for (LetterDescription ff : values) {

            String[] hexa = ff.getHexLetter().split(" ");
            for (int j = 0; j < ff.bytes() * ff.width(); j += ff.bytes()) {
                for (int b = 0; b < ff.bytes(); b++) {
                    BitSet bs = BitSet.valueOf(HexUtils.toBytes(hexa[j + b]));
                    for (int k = 8 * b; k < Math.min(8 * (b + 1), ff.height()); k++) {
                        final int colIndex = (j / ff.bytes());
                        matrix[ff.getIntLetter()][k][colIndex] = bs.get(7 - k + 8 * b);
                    }
                }
            }

        }
    }

    public void setForegroundColor(Color color) {
        ledLetter.setForeground(color);
    }

    public void setBackgroundColor(Color color) {
        ledLetter.setBackground(color);
    }

    public void displayChar(int c) {
        if (matrix == null) {
            return;
        }
        ledLetter.getModel().setValues(matrix[c]);

    }


    public boolean isForegroundColorSet() {
        return ledLetter.isForegroundColorSet();
    }

    public boolean isBackgroundColorSet() {
        return ledLetter.isBackgroundColorSet();
    }
}
