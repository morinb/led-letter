package com.bnpparibas.grp.ledletter.fonts;

import com.bnpparibas.grp.ledletter.HexUtils;

import java.util.BitSet;

/**
 * Adaptation of jfxtras MatrixPanel
 */
public enum FontFormat5x7 implements LetterDescription {
   FF5x7_32("00 00 00 00 00", 32) /* SPACE */,
   FF5x7_33("00 00 FA 00 00", 33) /* ! */,
   FF5x7_34("A0 C0 00 A0 C0", 34) /* " */,
   FF5x7_35("28 FE 28 FE 28", 35) /* # */,
   FF5x7_36("24 54 FE 54 48", 36) /* $ */,
   FF5x7_37("C4 C8 10 26 46", 37) /* % */,
   FF5x7_38("6C 92 AA 44 0A", 38) /* & */,
   FF5x7_40("00 7C 82 00 00", 40) /* ( */,
   FF5x7_41("00 00 82 7C 00", 41) /* ) */,
   FF5x7_42("54 38 7C 38 54", 42) /* * */,
   FF5x7_43("10 10 7C 10 10", 43) /* + */,
   FF5x7_44("00 0A 0C 00 00", 44) /* , */,
   FF5x7_45("00 10 10 10 00", 45) /* - */,
   FF5x7_46("00 06 06 00 00", 46) /* . */,
   FF5x7_47("04 08 10 20 40", 47) /*  / */,
   FF5x7_48("7C 8A 92 A2 7C", 48) /* 0 */,
   FF5x7_49("00 42 FE 02 00", 49) /* 1 */,
   FF5x7_50("46 8A 92 92 62", 50) /* 2 */,
   FF5x7_51("44 82 92 92 6C", 51) /* 3 */,
   FF5x7_52("18 28 4A FE 0A", 52) /* 4 */,
   FF5x7_53("E4 A2 A2 A2 9C", 53) /* 5 */,
   FF5x7_54("7C 92 92 92 4C", 54) /* 6 */,
   FF5x7_55("80 80 9E A0 C0", 55) /* 7 */,
   FF5x7_56("6C 92 92 92 6C", 56) /* 8 */,
   FF5x7_57("60 92 92 92 7C", 57) /* 9 */,
   FF5x7_58("00 66 66 00 00", 58) /* : */,
   FF5x7_59("00 6A 6C 00 00", 59) /* ; */,
   FF5x7_60("10 28 44 82 00", 60) /* < */,
   FF5x7_61("00 28 28 28 00", 61) /*  = */,
   FF5x7_62("00 82 44 28 10", 62) /* > */,
   FF5x7_63("40 80 8A 90 60", 63) /* ? */,
   FF5x7_64("7C 82 BA AA 78", 64) /* @ */,
   FF5x7_65("7E 88 88 88 7E", 65) /* A */,
   FF5x7_66("FE 92 92 92 6C", 66) /* B */,
   FF5x7_67("7C 82 82 82 44", 67) /* C */,
   FF5x7_68("FE 82 82 82 7C", 68) /* D */,
   FF5x7_69("FE 92 92 82 82", 69) /* E */,
   FF5x7_70("FE 90 90 80 80", 70) /* F */,
   FF5x7_71("7C 82 92 92 5C", 71) /* G */,
   FF5x7_72("FE 10 10 10 FE", 72) /* H */,
   FF5x7_73("00 82 FE 82 00", 73) /* I */,
   FF5x7_74("04 02 02 02 FC", 74) /* J */,
   FF5x7_75("FE 10 28 44 82", 75) /* K */,
   FF5x7_76("FE 02 02 02 02", 76) /* L */,
   FF5x7_77("FE 40 20 40 FE", 77) /* M */,
   FF5x7_78("FE 40 20 10 FE", 78) /* N */,
   FF5x7_79("7C 82 82 82 7C", 79) /* O */,
   FF5x7_80("FE 90 90 90 60", 80) /* P */,
   FF5x7_81("7C 82 82 84 7A", 81) /* Q */,
   FF5x7_82("FE 90 98 94 62", 82) /* R */,
   FF5x7_83("64 92 92 92 4C", 83) /* S */,
   FF5x7_84("80 80 FE 80 80", 84) /* T */,
   FF5x7_85("FC 02 02 02 FC", 85) /* U */,
   FF5x7_86("E0 18 06 18 E0", 86) /* V */,
   FF5x7_87("FC 02 1C 02 FC", 87) /* W */,
   FF5x7_88("C6 28 10 28 C6", 88) /* X */,
   FF5x7_89("E0 10 0E 10 E0", 89) /* Y */,
   FF5x7_90("86 8A 92 A2 C2", 90) /* Z */,
   FF5x7_91("00 FE 82 00 00", 91) /* [ */,
   FF5x7_92("40 20 10 08 04", 92) /* \ */,
   FF5x7_93("00 00 82 FE 00", 93) /* ] */,
   FF5x7_95("02 02 02 02 02", 95) /* _ */,
   FF5x7_97("04 2A 2A 2A 1E", 97) /* a */,
   FF5x7_98("FC 12 22 22 1C", 98) /* b */,
   FF5x7_99("1C 22 22 22 22", 99) /* c */,
   FF5x7_100("1C 22 22 12 FE", 100) /* d */,
   FF5x7_101("1C 2A 2A 2A 18", 101) /* e */,
   FF5x7_102("08 7E 88 80 40", 102) /* f */,
   FF5x7_103("10 2A 2A 2A 1E", 103) /* g */,
   FF5x7_104("FE 10 20 20 1E", 104) /* h */,
   FF5x7_105("00 22 BE 02 00", 105) /* i */,
   FF5x7_106("04 02 22 BC 00", 106) /* j */,
   FF5x7_107("FE 08 14 22 00", 107) /* k */,
   FF5x7_108("00 82 FE 02 00", 108) /* l */,
   FF5x7_109("3E 20 10 20 1E", 109) /* m */,
   FF5x7_110("3E 10 20 20 1E", 110) /* n */,
   FF5x7_111("1C 22 22 22 1C", 111) /* o */,
   FF5x7_112("3E 18 28 28 10", 112) /* p */,
   FF5x7_113("10 28 28 18 3E", 113) /* q */,
   FF5x7_114("3E 10 20 20 10", 114) /* r */,
   FF5x7_115("12 2A 2A 2A 04", 115) /* s */,
   FF5x7_116("20 FC 22 02 04", 116) /* t */,
   FF5x7_117("3C 02 02 04 3E", 117) /* u */,
   FF5x7_118("38 04 02 04 38", 118) /* v */,
   FF5x7_119("3C 02 0C 02 3C", 119) /* w */,
   FF5x7_120("22 14 08 14 22", 120) /* x */,
   FF5x7_121("30 0A 0A 0A 3C", 121) /* y */,
   FF5x7_122("22 26 2A 32 22", 122) /* z */,
   FF5x7_123("10 6C 82 00 00", 123) /* { */,
   FF5x7_125("00 00 82 6C 10", 125) /* } */,
   FF5x7_161("00 00 BE 00 00", 161) /* &iexcl; */,
   FF5x7_186("40 A0 40 00 00", 186) /* &ordm; */,
   FF5x7_191("0C 12 A2 02 04", 191) /* &iquest; */,
   FF5x7_209("3E 90 88 84 3E", 209) /* &Ntilde; */,
   FF5x7_241("3E 90 A0 A0 1E", 241) /* &ntilde; */;


   private final String hexLetter;
   private final int intLetter;

   FontFormat5x7(String hexLetter, int intLetter) {
      this.hexLetter = hexLetter;
      this.intLetter = intLetter;
   }

   @Override
   public String getHexLetter() {
      return hexLetter;
   }

   @Override
   public int getIntLetter() {
      return intLetter;
   }

   @Override
   public int bytes() {
      return 1;
   }

   @Override
   public int width() {
      return 5;
   }

   @Override
   public int height() {
      return 7;
   }

   private boolean[][] values = null;

   public void invalidate() {
      values = null;
   }

   public void initialize() {
      values = getValues();
   }

   public boolean[][] getValues() {
      if (values != null) {
         return values;
      }

      boolean[][] v = new boolean[height()][width()];
      for (int j = 0; j < bytes() * width(); j += bytes()) {
         for (int b = 0; b < bytes(); b++) {
            BitSet bs = BitSet.valueOf(HexUtils.toBytes(getHexLetter().split(" ")[j + b]));
            for (int k = 8 * b; k < Math.min(8 * (b + 1), height()); k++) {
               final int colIndex = (j / bytes());
               v[k][colIndex] = bs.get(7 - k + 8 * b);
            }
         }
      }
      return v;
   }


}

