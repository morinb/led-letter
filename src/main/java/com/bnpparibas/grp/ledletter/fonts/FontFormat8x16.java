package com.bnpparibas.grp.ledletter.fonts;

import com.bnpparibas.grp.ledletter.HexUtils;

import java.util.BitSet;

/**
 * Adaptation of jfxtras MatrixPanel
 */
public enum FontFormat8x16 implements LetterDescription {

    FF8x16_32("00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 32) /* SPACE */,
    FF8x16_33("00 00 00 00 00 00 FF F3 FF F3 00 00 00 00 00 00", 33) /* ! */,
    FF8x16_34("CC 00 F8 00 F0 00 00 00 CC 00 F8 00 F0 00 00 00", 34) /* " */,
    FF8x16_35("06 30 7F FF 7F FF 06 30 06 30 7F FF 7F FF 06 30", 35) /* # */,
    FF8x16_36("1F 0C 3F 8C 31 8C FF FF FF FF 31 8C 31 FC 30 F8", 36) /* $ */,
    FF8x16_37("60 0F F0 3F F0 FC 63 F0 0F C6 3F 0F FC 0F F0 06", 37) /* % */,
    FF8x16_38("3C FC 7F FE E7 87 CF C3 FC F7 78 3E 00 FF 00 C3", 38) /* & */,
    FF8x16_40("00 00 1F F8 7F FE E0 07 C0 03 00 00 00 00 00 00", 40) /* ( */,
    FF8x16_41("00 00 00 00 00 00 C0 03 E0 07 7F FE 1F F8 00 00", 41) /* ) */,
    FF8x16_42("0D B0 0F F0 07 E0 1F F8 1F F8 07 E0 0F F0 0D B0", 42) /* * */,
    FF8x16_43("01 80 01 80 01 80 1F F8 1F F8 01 80 01 80 01 80", 43) /* + */,
    FF8x16_44("00 00 00 00 00 33 00 3E 00 3C 00 00 00 00 00 00", 44) /* , */,
    FF8x16_45("01 80 01 80 01 80 01 80 01 80 01 80 01 80 01 80", 45) /* - */,
    FF8x16_46("00 00 00 00 00 06 00 0F 00 0F 00 06 00 00 00 00", 46) /* . */,
    FF8x16_47("00 0F 00 3F 00 FC 03 F0 0F C0 3F 00 FC 00 F0 00", 47) /*  / */,
    FF8x16_48("1F F8 7F FE 60 46 C0 83 C1 03 62 06 7F FE 1F F8", 48) /* 0 */,
    FF8x16_49("00 00 30 03 70 03 FF FF FF FF 00 03 00 03 00 00", 49) /* 1 */,
    FF8x16_50("30 0F 70 1F E0 3B C0 73 C0 E3 E3 C3 7F 83 3E 03", 50) /* 2 */,
    FF8x16_51("30 0C 70 0E E0 07 C1 83 C1 83 E3 C7 7E 7E 3E 7C", 51) /* 3 */,
    FF8x16_52("07 E0 0E 60 1C 60 38 63 70 63 FF FF FF FF 00 63", 52) /* 4 */,
    FF8x16_53("FF 0C FF 0E C3 07 C3 03 C3 03 C3 87 C1 FE C0 FC", 53) /* 5 */,
    FF8x16_54("3F FC 7F FE E1 87 C3 03 C3 03 C3 87 01 FE 00 FC", 54) /* 6 */,
    FF8x16_55("C0 00 C0 00 C1 FF C7 FF CF 00 DC 00 F8 00 F0 00", 55) /* 7 */,
    FF8x16_56("3E 7C 7F FE E3 C7 C1 83 C1 83 E3 C7 7F FE 3E 7C", 56) /* 8 */,
    FF8x16_57("3E 00 7F 00 E3 83 C1 83 C1 83 E1 87 7F FE 3F FC", 57) /* 9 */,
    FF8x16_58("00 00 00 00 06 0C 0F 1E 0F 1E 06 0C 00 00 00 00", 58) /* : */,
    FF8x16_59("00 00 00 00 0C 66 1E 7C 1E 78 0C 00 00 00 00 00", 59) /* ; */,
    FF8x16_60("01 80 03 C0 07 E0 0E 70 1C 38 38 1C 70 0E 60 06", 60) /* < */,
    FF8x16_61("06 60 06 60 06 60 06 60 06 60 06 60 06 60 06 60", 61) /*  = */,
    FF8x16_62("60 06 70 0E 38 1C 1C 38 0E 70 07 E0 03 C0 01 80", 62) /* > */,
    FF8x16_63("70 00 E0 00 C0 F3 C1 F3 C3 80 E7 00 7E 00 3C 00", 63) /* ? */,
    FF8x16_64("3F FC 7F FE E0 07 C3 C3 C7 E3 E6 63 7F E0 3F C0", 64) /* @ */,
    FF8x16_65("1F FF 7F FF 60 C0 C0 C0 C0 C0 60 C0 7F FF 1F FF", 65) /* A */,
    FF8x16_66("FF FF FF FF C1 83 C1 83 C1 83 63 C6 7E 7E 1C 38", 66) /* B */,
    FF8x16_67("1F F8 7F FE 60 06 C0 03 C0 03 60 06 70 0E 10 08", 67) /* C */,
    FF8x16_68("FF FF FF FF C0 03 C0 03 C0 03 60 06 7F FE 1F F8", 68) /* D */,
    FF8x16_69("FF FF FF FF C1 83 C1 83 C1 83 C0 03 C0 03 C0 03", 69) /* E */,
    FF8x16_70("FF FF FF FF C1 80 C1 80 C1 80 C0 00 C0 00 C0 00", 70) /* F */,
    FF8x16_71("3F FC 7F FE E0 07 C0 03 C1 83 E1 87 71 FE 31 FC", 71) /* G */,
    FF8x16_72("FF FF FF FF 01 80 01 80 01 80 01 80 FF FF FF FF", 72) /* H */,
    FF8x16_73("00 00 C0 03 C0 03 FF FF FF FF C0 03 C0 03 00 00", 73) /* I */,
    FF8x16_74("00 0C 00 0E 00 07 00 03 00 03 00 07 FF FE FF FC", 74) /* J */,
    FF8x16_75("FF FF FF FF 07 E0 0E 70 1C 38 38 1C 70 0E E0 07", 75) /* K */,
    FF8x16_76("FF FF FF FF 00 03 00 03 00 03 00 03 00 03 00 03", 76) /* L */,
    FF8x16_77("FF FF FF FF 38 00 1E 00 1E 00 38 00 FF FF FF FF", 77) /* M */,
    FF8x16_78("FF FF FF FF 38 00 1C 00 0E 00 07 00 FF FF FF FF", 78) /* N */,
    FF8x16_79("1F F8 7F FE 60 06 C0 03 C0 03 60 06 7F FE 1F F8", 79) /* O */,
    FF8x16_80("FF FF FF FF C1 80 C1 80 C1 80 63 00 7F 00 1C 00", 80) /* P */,
    FF8x16_81("1F F8 7F FE 60 06 C0 03 C0 0A 60 06 7F FF 1F F3", 81) /* Q */,
    FF8x16_82("FF FF FF FF C1 C0 C1 E0 C1 B0 63 18 7F 0F 1C 07", 82) /* R */,
    FF8x16_83("1C 0C 7F 0E 63 06 C1 83 C1 83 60 C6 70 FE 10 38", 83) /* S */,
    FF8x16_84("C0 00 C0 00 C0 00 FF FF FF FF C0 00 C0 00 C0 00", 84) /* T */,
    FF8x16_85("FF F8 FF FE 00 06 00 03 00 03 00 06 FF FE FF F8", 85) /* U */,
    FF8x16_86("FE 00 FF C0 03 F8 00 3F 00 3F 03 F8 FF C0 FE 00", 86) /* V */,
    FF8x16_87("FF F8 FF FE 00 07 00 FE 00 FE 00 07 FF FE FF F8", 87) /* W */,
    FF8x16_88("F0 0F FC 3F 1E 78 07 E0 07 E0 1E 78 FC 3F F0 0F", 88) /* X */,
    FF8x16_89("FC 00 FE 00 07 80 01 FF 01 FF 07 80 FE 00 FC 00", 89) /* Y */,
    FF8x16_90("C0 1F C0 3F C0 F3 C1 C3 C3 83 CF 03 FC 03 F8 03", 90) /* Z */,
    FF8x16_91("00 00 FF FF FF FF C0 03 C0 03 00 00 00 00 00 00", 91) /* [ */,
    FF8x16_92("F0 00 FC 00 3F 00 0F C0 03 F0 00 FC 00 3F 00 0F", 92) /* \ */,
    FF8x16_93("00 00 00 00 00 00 C0 03 C0 03 FF FF FF FF 00 00", 93) /* ] */,
    FF8x16_95("00 00 00 03 00 03 00 03 00 03 00 03 00 03 00 00", 95) /* _ */,
    FF8x16_97("00 3C 00 7E 0C E7 0C C3 0C C3 0E C3 07 FF 03 FF", 97) /* a */,
    FF8x16_98("FF FF FF FF 00 C3 01 83 03 83 03 87 01 FE 00 FC", 98) /* b */,
    FF8x16_99("03 FC 07 FE 0E 07 0C 03 0C 03 0C 03 0C 03 0C 03", 99) /* c */,
    FF8x16_100("00 FC 01 FE 03 87 03 83 01 C3 00 C3 FF FF FF FF", 100) /* d */,
    FF8x16_101("03 FC 07 FE 0E 67 0C 63 0C 63 0E 63 07 E3 03 E0", 101) /* e */,
    FF8x16_102("00 60 3F FF 7F FF E0 60 C0 00 E0 00 70 00 30 00", 102) /* f */,
    FF8x16_103("03 80 07 C0 0E E3 0C 63 0C 63 0E 63 07 FF 03 FF", 103) /* g */,
    FF8x16_104("FF FF FF FF 01 80 03 80 07 00 07 00 03 FF 01 FF", 104) /* h */,
    FF8x16_105("00 00 00 03 0C 03 CF FF CF FF 00 03 00 03 00 00", 105) /* i */,
    FF8x16_106("00 0C 00 0E 00 07 00 03 00 03 0C 07 CF FE CF FC", 106) /* j */,
    FF8x16_107("FF FF FF FF 00 30 00 78 00 FC 01 CE 03 87 03 03", 107) /* k */,
    FF8x16_108("00 00 00 03 C0 03 FF FF FF FF 00 03 00 03 00 00", 108) /* l */,
    FF8x16_109("0F FF 0F FF 0E 00 07 F0 07 F0 0E 00 07 FF 03 FF", 109) /* m */,
    FF8x16_110("0F FF 0F FF 03 00 07 00 0E 00 0E 00 07 FF 03 FF", 110) /* n */,
    FF8x16_111("03 FC 07 FE 0E 07 0C 03 0C 03 0E 07 07 FE 03 FC", 111) /* o */,
    FF8x16_112("0F FF 0F FF 03 E0 06 E0 0C 60 0E C0 07 80 03 00", 112) /* p */,
    FF8x16_113("03 00 07 80 0E C0 0C 60 06 E0 03 E0 0F FF 0F FF", 113) /* q */,
    FF8x16_114("0F FF 0F FF 03 00 07 00 0E 00 0E 00 07 00 03 00", 114) /* r */,
    FF8x16_115("03 83 07 C3 0E E3 0C 63 0C 63 0C 77 0C 3E 0C 1C", 115) /* s */,
    FF8x16_116("0C 00 FF FC FF FE 0C 07 0C 03 00 07 00 0E 00 0C", 116) /* t */,
    FF8x16_117("0F FC 0F FE 00 07 00 07 00 0E 00 1C 0F FF 0F FF", 117) /* u */,
    FF8x16_118("0F C0 0F F0 00 3C 00 1F 00 1F 00 3C 0F F0 0F C0", 118) /* v */,
    FF8x16_119("0F FC 0F FE 00 07 00 7E 00 7E 00 07 0F FE 0F FC", 119) /* w */,
    FF8x16_120("0C 03 0F 0F 03 9C 01 F8 01 F8 03 9C 0F 0F 0C 03", 120) /* x */,
    FF8x16_121("0F 00 0F 80 01 C3 00 C3 00 C3 00 C7 0F FE 0F FC", 121) /* y */,
    FF8x16_122("0C 0F 0C 1F 0C 3B 0C 73 0C E3 0D C3 0F 83 0F 03", 122) /* z */,
    FF8x16_123("01 80 1F F8 7E 7E E0 07 C0 03 00 00 00 00 00 00", 123) /* { */,
    FF8x16_125("00 00 00 00 00 00 C0 03 E0 07 7E 7E 1F F8 01 80", 125) /* } */,
    FF8x16_161("00 00 00 00 00 00 CF FF CF FF 00 00 00 00 00 00", 161) /* &iexcl; */,
    FF8x16_186("30 00 78 00 CC 00 CC 00 78 00 30 00 00 00 00 00", 186) /* &ordm; */,
    FF8x16_191("00 7C 00 FE 01 C7 CF 03 CE 03 00 07 00 0F 00 0E", 191) /* &iquest; */,
    FF8x16_209("0F FF 0F FF C3 80 C1 C0 C0 E0 C0 70 0F FF 0F FF", 209) /* &Ntilde; */,
    FF8x16_241("0F FF CF FF C3 80 C7 00 CE 00 CE 00 C7 FF 03 FF", 241) /* &ntilde; */;


    private final String hexLetter;
    private final int intLetter;

    FontFormat8x16(String hexLetter, int intLetter) {
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
        return 2;
    }

    @Override
    public int width() {
        return 8;
    }

    @Override
    public int height() {
        return 16;
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
