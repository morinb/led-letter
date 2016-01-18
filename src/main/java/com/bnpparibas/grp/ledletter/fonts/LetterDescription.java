package com.bnpparibas.grp.ledletter.fonts;

/**
 * @author morinb.
 */
public interface LetterDescription {
    String getHexLetter();

    int getIntLetter();
    
    int bytes();
    int width();
    int height();
}