package com.bnpparibas.grp.ledletter.fonts;

/**
 * Adaptation of jfxtras MatrixPanel
 */
public interface LetterDescription {
   String getHexLetter();

   int getIntLetter();

   int bytes();

   int width();

   int height();

   void invalidate();

   void initialize();

   boolean[][] getValues();
}