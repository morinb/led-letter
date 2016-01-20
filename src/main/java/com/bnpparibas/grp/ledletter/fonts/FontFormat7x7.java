package com.bnpparibas.grp.ledletter.fonts;

import com.bnpparibas.grp.ledletter.HexUtils;

import java.util.BitSet;

/**
 * Adaptation of jfxtras MatrixPanel
 */
public enum FontFormat7x7 implements LetterDescription {

   FF7x7_32("00 00 00 00 00 00 00", 32) /* SPACE */,
   FF7x7_33("00 00 FA FA 00 00 00", 33) /* ! */,
   FF7x7_34("A0 E0 C0 00 A0 E0 C0", 34) /* " */,
   FF7x7_35("28 FE FE 28 FE FE 28", 35) /* # */,
   FF7x7_36("24 54 FE FE 54 5C 48", 36) /* $ */,
   FF7x7_37("C6 CC 18 30 60 C6 86", 37) /* % */,
   FF7x7_38("4C DE B2 F2 4A 04 0A", 38) /* & */,
   FF7x7_40("00 7C FE 82 00 00 00", 40) /* ( */,
   FF7x7_41("00 00 82 FE 7C 00 00", 41) /* ) */,
   FF7x7_42("54 38 7C 38 54 00 00", 42) /* * */,
   FF7x7_43("10 10 7C 7C 10 10 00", 43) /* + */,
   FF7x7_44("00 0A 0E 0C 00 00 00", 44) /* , */,
   FF7x7_45("10 10 10 10 10 10 10", 45) /* - */,
   FF7x7_46("00 06 06 06 00 00 00", 46) /* . */,
   FF7x7_47("06 0C 18 30 60 C0 80", 47) /*  / */,
   FF7x7_48("7C FE 8A 92 A2 FE 7C", 48) /* 0 */,
   FF7x7_49("00 42 FE FE 02 00 00", 49) /* 1 */,
   FF7x7_50("46 C6 8A 8A 92 F2 62", 50) /* 2 */,
   FF7x7_51("44 C6 82 92 92 FE 6C", 51) /* 3 */,
   FF7x7_52("18 38 68 CA FE FE 0A", 52) /* 4 */,
   FF7x7_53("E4 E6 A2 A2 A2 BE 9C", 53) /* 5 */,
   FF7x7_54("7C FE 92 92 92 1E 0C", 54) /* 6 */,
   FF7x7_55("80 80 8E 9E B0 E0 C0", 55) /* 7 */,
   FF7x7_56("6C FE 92 92 92 FE 6C", 56) /* 8 */,
   FF7x7_57("60 F2 92 92 92 FE 7C", 57) /* 9 */,
   FF7x7_58("00 66 66 66 00 00 00", 58) /* : */,
   FF7x7_59("00 6A 6C 6C 00 00 00", 59) /* ; */,
   FF7x7_60("10 38 6C C6 82 00 00", 60) /* < */,
   FF7x7_61("00 28 28 28 28 28 00", 61) /*  = */,
   FF7x7_62("00 00 82 C6 6C 38 10", 62) /* > */,
   FF7x7_63("40 C0 8A 9A 90 F0 60", 63) /* ? */,
   FF7x7_64("7C FE 82 BA AA FA 78", 64) /* @ */,
   FF7x7_65("7E FE 88 88 88 FE 7E", 65) /* A */,
   FF7x7_66("FE FE 92 92 92 EE 6C", 66) /* B */,
   FF7x7_67("7C FE 82 82 82 46 44", 67) /* C */,
   FF7x7_68("FE FE 82 82 82 FE 7C", 68) /* D */,
   FF7x7_69("FE FE 92 92 92 82 82", 69) /* E */,
   FF7x7_70("FE FE 90 90 90 80 80", 70) /* F */,
   FF7x7_71("7C FE 82 92 92 DE 5C", 71) /* G */,
   FF7x7_72("FE FE 10 10 10 FE FE", 72) /* H */,
   FF7x7_73("00 82 FE FE 82 00 00", 73) /* I */,
   FF7x7_74("04 06 02 02 02 FE FC", 74) /* J */,
   FF7x7_75("FE FE 10 38 6C C6 82", 75) /* K */,
   FF7x7_76("FE FE 02 02 02 02 02", 76) /* L */,
   FF7x7_77("FE FE 40 20 40 FE FE", 77) /* M */,
   FF7x7_78("FE FE 40 20 10 FE FE", 78) /* N */,
   FF7x7_79("7C FE 82 82 82 FE 7C", 79) /* O */,
   FF7x7_80("FE FE 90 90 90 F0 60", 80) /* P */,
   FF7x7_81("7C FE 82 9A 8C FE 7A", 81) /* Q */,
   FF7x7_82("FE FE 90 98 9C F6 62", 82) /* R */,
   FF7x7_83("64 F6 92 92 92 DE 4C", 83) /* S */,
   FF7x7_84("80 80 FE FE 80 80 00", 84) /* T */,
   FF7x7_85("FC FE 02 02 02 FE FC", 85) /* U */,
   FF7x7_86("C0 F0 38 06 38 F0 C0", 86) /* V */,
   FF7x7_87("FC FE 02 1C 02 FE FC", 87) /* W */,
   FF7x7_88("C6 C6 6C 10 6C C6 C6", 88) /* X */,
   FF7x7_89("E0 E0 30 0E 30 E0 E0", 89) /* Y */,
   FF7x7_90("86 8E 9A B2 E2 C2 82", 90) /* Z */,
   FF7x7_91("00 FE 82 82 00 00 00", 91) /* [ */,
   FF7x7_92("80 C0 60 30 18 0C 06", 92) /* \ */,
   FF7x7_93("00 00 82 82 FE 00 00", 93) /* ] */,
   FF7x7_95("00 02 02 02 02 02 00", 95) /* _ */,
   FF7x7_97("04 2A 2A 2A 2A 3E 1E", 97) /* a */,
   FF7x7_98("FE FE 12 22 22 3E 1E", 98) /* b */,
   FF7x7_99("1C 3E 22 22 22 22 22", 99) /* c */,
   FF7x7_100("1C 3E 22 22 12 FE FE", 100) /* d */,
   FF7x7_101("1C 3E 2A 2A 2A 3A 18", 101) /* e */,
   FF7x7_102("08 7E FE 88 C0 40 00", 102) /* f */,
   FF7x7_103("10 3A 2A 2A 2A 3E 1E", 103) /* g */,
   FF7x7_104("FE FE 10 20 20 3E 1E", 104) /* h */,
   FF7x7_105("00 22 BE BE 02 00 00", 105) /* i */,
   FF7x7_106("04 06 02 22 BE BC 00", 106) /* j */,
   FF7x7_107("FE FE 08 14 14 22 22", 107) /* k */,
   FF7x7_108("00 82 FE FE 02 00 00", 108) /* l */,
   FF7x7_109("3E 3E 20 18 20 3E 1E", 109) /* m */,
   FF7x7_110("3E 3E 10 20 20 3E 1E", 110) /* n */,
   FF7x7_111("1C 3E 22 22 22 3E 1C", 111) /* o */,
   FF7x7_112("3E 3E 18 28 28 38 10", 112) /* p */,
   FF7x7_113("10 38 28 28 18 3E 3E", 113) /* q */,
   FF7x7_114("3E 3E 10 20 20 30 10", 114) /* r */,
   FF7x7_115("12 3A 2A 2A 2A 2E 24", 115) /* s */,
   FF7x7_116("20 FC FE 22 02 06 04", 116) /* t */,
   FF7x7_117("3C 3E 02 02 04 3E 3E", 117) /* u */,
   FF7x7_118("38 38 04 02 04 38 38", 118) /* v */,
   FF7x7_119("3C 3E 02 04 02 3E 3C", 119) /* w */,
   FF7x7_120("22 36 14 08 14 36 22", 120) /* x */,
   FF7x7_121("30 3A 0A 0A 0A 3E 3C", 121) /* y */,
   FF7x7_122("22 26 26 2A 32 32 22", 122) /* z */,
   FF7x7_123("10 7C EE 82 00 00 00", 123) /* { */,
   FF7x7_125("00 00 82 EE 7C 10 00", 125) /* } */,
   FF7x7_161("00 00 BE BE 00 00 00", 161) /* &iexcl; */,
   FF7x7_186("40 E0 A0 E0 40 00 00", 186) /* &ordm; */,
   FF7x7_191("0C 1E B2 A2 02 06 04", 191) /* &iquest; */,
   FF7x7_209("3E BE 90 88 84 BE 3E", 209) /* &Ntilde; */,
   FF7x7_241("3E BE 90 A0 A0 BE 1E", 241) /* &ntilde; */;


   private final String hexLetter;
   private final int intLetter;

   FontFormat7x7(String hexLetter, int intLetter) {
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
      return 7;
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
