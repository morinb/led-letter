package com.bnpparibas.grp.ledletter.fonts;

/**
 * Adaptation of jfxtras MatrixPanel
 */
public enum LedLetterFont {
    LLF_5x7(FontFormat5x7.values()),
    LLF_7x7(FontFormat7x7.values()),
    LLF_7x9(FontFormat7x9.values()),
    LLF_8x14(FontFormat8x14.values()),
    LLF_10x14(FontFormat10x14.values()),
    LLF_8x16(FontFormat8x16.values()),
    LLF_10x16(FontFormat10x16.values()),
    LLF_15x32(FontFormat15x32.values()),;

    private LetterDescription[] letterDescription;

    LedLetterFont(LetterDescription[] letterDescription) {
        this.letterDescription = letterDescription;
    }

    public LetterDescription[] getLetterDescriptions() {
        return this.letterDescription;
    }

    public LetterDescription getLetterDescription(char c) {
        for (LetterDescription ld : getLetterDescriptions()) {
            if (ld.getIntLetter() == c) {
                return ld;
            }
        }
        return getLetterDescriptions()[0];
    }

    public int rowCount() {
        return getLetterDescriptions()[0].height();
    }

    public int columnCount() {
        return getLetterDescriptions()[0].width();
    }

}
