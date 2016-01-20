package com.bnpparibas.grp.ledletter.fonts;

import com.bnpparibas.grp.ledletter.HexUtils;

import java.util.BitSet;

/**
 * Adaptation of jfxtras MatrixPanel
 */
public enum FontFormat10x16 implements LetterDescription {


    FF10x16_32("00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 32) /* SPACE */,
    FF10x16_33("00 00 00 00 00 00 00 00 FF F3 FF F3 00 00 00 00 00 00 00 00", 33) /* ! */,
    FF10x16_34("CC 00 CC 00 F8 00 F0 00 00 00 CC 00 CC 00 F8 00 F0 00 00 00", 34) /* " */,
    FF10x16_35("06 60 06 60 7F FE 7F FE 06 60 06 60 7F FE 7F FE 06 60 06 60", 35) /* # */,
    FF10x16_36("1F 0C 3F 8C 31 8C 31 8C FF FF FF FF 31 8C 31 8C 31 FC 30 F8", 36) /* $ */,
    FF10x16_37("60 07 F0 1F F0 3E 60 78 01 E0 07 80 1E 06 7C 0F F8 0F E0 06", 37) /* % */,
    FF10x16_38("3C FC 7F FE E7 87 C7 83 CF C3 FC E7 78 3E 00 7E 00 E7 00 C3", 38) /* & */,
    FF10x16_40("00 00 00 00 1F F8 7F FE E0 07 C0 03 00 00 00 00 00 00 00 00", 40) /* ( */,
    FF10x16_41("00 00 00 00 00 00 C0 03 E0 07 7F FE 1F F8 00 00 00 00 00 00", 41) /* ) */,
    FF10x16_42("01 80 0D B0 0F F0 07 E0 1F F8 1F F8 07 E0 0F F0 0D B0 01 80", 42) /* * */,
    FF10x16_43("01 80 01 80 01 80 01 80 1F F8 1F F8 01 80 01 80 01 80 01 80", 43) /* + */,
    FF10x16_44("00 00 00 00 00 33 00 33 00 3E 00 3C 00 00 00 00 00 00 00 00", 44) /* , */,
    FF10x16_45("01 80 01 80 01 80 01 80 01 80 01 80 01 80 01 80 01 80 00 00", 45) /* - */,
    FF10x16_46("00 00 00 00 00 06 00 0F 00 0F 00 06 00 00 00 00 00 00 00 00", 46) /* . */,
    FF10x16_47("00 07 00 1F 00 3E 00 78 01 E0 07 80 1E 00 7C 00 F8 00 E0 00", 47) /*  / */,
    FF10x16_48("1F F8 7F FE 60 46 C0 83 C0 83 C1 03 C1 03 62 06 7F FE 1F F8", 48) /* 0 */,
    FF10x16_49("00 00 00 00 30 03 70 03 FF FF FF FF 00 03 00 03 00 00 00 00", 49) /* 1 */,
    FF10x16_50("30 0F 70 1F E0 3B C0 73 C0 E3 C1 C3 C3 83 E7 03 7E 03 3C 03", 50) /* 2 */,
    FF10x16_51("30 0C 70 0E E0 07 C0 03 C0 03 C1 83 C1 83 E3 C7 7E 7E 3E 7C", 51) /* 3 */,
    FF10x16_52("01 E0 03 E0 07 60 0E 60 1C 63 38 63 7F FF FF FF 00 63 00 63", 52) /* 4 */,
    FF10x16_53("FF 0C FF 0E C3 07 C3 03 C3 03 C3 03 C3 03 C3 87 C1 FE C0 FC", 53) /* 5 */,
    FF10x16_54("3F FC 7F FE E3 07 C3 03 C3 03 C3 03 C3 03 C3 87 01 FE 00 FC", 54) /* 6 */,
    FF10x16_55("C0 00 C0 00 C0 00 C0 00 C1 FF C7 FF CF 00 DC 00 F8 00 F0 00", 55) /* 7 */,
    FF10x16_56("3E 7C 7F FE E3 C7 C1 83 C1 83 C1 83 C1 83 E3 C7 7F FE 3E 7C", 56) /* 8 */,
    FF10x16_57("3E 00 7F 00 E3 83 C1 83 C1 83 C1 83 C1 83 E1 87 7F FE 3F FC", 57) /* 9 */,
    FF10x16_58("00 00 00 00 00 00 06 0C 0F 1E 0F 1E 06 0C 00 00 00 00 00 00", 58) /* : */,
    FF10x16_59("00 00 00 00 00 33 06 33 0F 3E 0F 3C 06 00 00 00 00 00 00 00", 59) /* ; */,
    FF10x16_60("00 00 01 80 03 C0 07 E0 0E 70 1C 38 38 1C 70 0E 60 06 00 00", 60) /* < */,
    FF10x16_61("06 60 06 60 06 60 06 60 06 60 06 60 06 60 06 60 06 60 00 00", 61) /*  = */,
    FF10x16_62("00 00 60 06 70 0E 38 1C 1C 38 0E 70 07 E0 03 C0 01 80 00 00", 62) /* > */,
    FF10x16_63("30 00 70 00 E0 00 C0 00 C1 F3 C3 F3 C7 00 EE 00 7C 00 38 00", 63) /* ? */,
    FF10x16_64("3F FC 7F FE E0 07 C0 03 C7 C3 CF E3 CC 63 EC 63 7F E0 3F C0", 64) /* @ */,
    FF10x16_65("1F FF 7F FF 60 C0 C0 C0 C0 C0 C0 C0 C0 C0 60 C0 7F FF 1F FF", 65) /* A */,
    FF10x16_66("FF FF FF FF C1 83 C1 83 C1 83 C1 83 C1 83 63 C6 7E 7E 1C 38", 66) /* B */,
    FF10x16_67("1F F8 7F FE 60 06 C0 03 C0 03 C0 03 C0 03 60 06 70 0E 10 08", 67) /* C */,
    FF10x16_68("FF FF FF FF C0 03 C0 03 C0 03 C0 03 C0 03 60 06 7F FE 1F F8", 68) /* D */,
    FF10x16_69("FF FF FF FF C1 83 C1 83 C1 83 C1 83 C1 83 C0 03 C0 03 C0 03", 69) /* E */,
    FF10x16_70("FF FF FF FF C1 80 C1 80 C1 80 C1 80 C1 80 C0 00 C0 00 C0 00", 70) /* F */,
    FF10x16_71("3F FC 7F FE E0 07 C0 03 C1 83 C1 83 C1 83 E1 87 71 FE 31 FC", 71) /* G */,
    FF10x16_72("FF FF FF FF 01 80 01 80 01 80 01 80 01 80 01 80 FF FF FF FF", 72) /* H */,
    FF10x16_73("00 00 00 00 C0 03 C0 03 FF FF FF FF C0 03 C0 03 00 00 00 00", 73) /* I */,
    FF10x16_74("00 0C 00 0E 00 07 00 03 00 03 00 03 00 03 00 07 FF FE FF FC", 74) /* J */,
    FF10x16_75("FF FF FF FF 01 80 03 C0 07 E0 0E 70 1C 38 38 1C F0 0F E0 07", 75) /* K */,
    FF10x16_76("FF FF FF FF 00 03 00 03 00 03 00 03 00 03 00 03 00 03 00 03", 76) /* L */,
    FF10x16_77("FF FF FF FF 70 00 38 00 1E 00 1E 00 38 00 70 00 FF FF FF FF", 77) /* M */,
    FF10x16_78("FF FF FF FF 70 00 38 00 1C 00 0E 00 07 00 03 80 FF FF FF FF", 78) /* N */,
    FF10x16_79("1F F8 7F FE 60 06 C0 03 C0 03 C0 03 C0 03 60 06 7F FE 1F F8", 79) /* O */,
    FF10x16_80("FF FF FF FF C1 80 C1 80 C1 80 C1 80 C1 80 63 00 7F 00 1C 00", 80) /* P */,
    FF10x16_81("1F F8 7F FE 60 06 C0 03 C0 03 C0 03 C0 0A 60 06 7F FF 1F F3", 81) /* Q */,
    FF10x16_82("FF FF FF FF C1 C0 C1 E0 C1 F0 C1 B8 C1 9C 63 0E 7F 07 1C 03", 82) /* R */,
    FF10x16_83("1C 0C 7F 0E 63 06 C1 83 C1 83 C1 83 C1 83 60 C6 70 FE 10 38", 83) /* S */,
    FF10x16_84("C0 00 C0 00 C0 00 C0 00 FF FF FF FF C0 00 C0 00 C0 00 C0 00", 84) /* T */,
    FF10x16_85("FF F8 FF FE 00 06 00 03 00 03 00 03 00 03 00 06 FF FE FF F8", 85) /* U */,
    FF10x16_86("F0 00 FE 00 1F C0 03 F8 00 7F 00 7F 03 F8 1F C0 FE 00 F0 00", 86) /* V */,
    FF10x16_87("FF F8 FF FE 00 07 00 0F 01 FE 01 FE 00 0F 00 07 FF FE FF F8", 87) /* W */,
    FF10x16_88("F8 1F FC 3F 0E 70 07 E0 03 C0 03 C0 07 E0 0E 70 FC 3F F8 1F", 88) /* X */,
    FF10x16_89("F0 00 FC 00 0E 00 07 80 01 FF 01 FF 07 80 0E 00 FC 00 F0 00", 89) /* Y */,
    FF10x16_90("C0 1F C0 3F C0 73 C0 E3 C1 C3 C3 83 C7 03 CE 03 FC 03 F8 03", 90) /* Z */,
    FF10x16_91("00 00 00 00 FF FF FF FF C0 03 C0 03 00 00 00 00 00 00 00 00", 91) /* [ */,
    FF10x16_92("E0 00 F8 00 7C 00 1E 00 07 80 01 E0 00 78 00 3E 00 1F 00 07", 92) /* \ */,
    FF10x16_93("00 00 00 00 00 00 C0 03 C0 03 FF FF FF FF 00 00 00 00 00 00", 93) /* ] */,
    FF10x16_95("00 00 00 03 00 03 00 03 00 03 00 03 00 03 00 03 00 00 00 00", 95) /* _ */,
    FF10x16_97("00 3C 00 7E 0C E7 0C C3 0C C3 0C C3 0C C3 0E C3 07 FF 03 FF", 97) /* a */,
    FF10x16_98("FF FF FF FF 00 C3 01 83 03 83 03 03 03 03 03 87 01 FE 00 FC", 98) /* b */,
    FF10x16_99("03 FC 07 FE 0E 07 0C 03 0C 03 0C 03 0C 03 0C 03 0C 03 0C 03", 99) /* c */,
    FF10x16_100("00 FC 01 FE 03 87 03 03 03 03 03 83 01 C3 00 C3 FF FF FF FF", 100) /* d */,
    FF10x16_101("03 FC 07 FE 0E 67 0C 63 0C 63 0C 63 0E 63 07 E3 03 E0 00 00", 101) /* e */,
    FF10x16_102("00 60 00 60 3F FF 7F FF E0 60 C0 60 C0 00 E0 00 70 00 30 00", 102) /* f */,
    FF10x16_103("03 80 07 C0 0E E3 0C 63 0C 63 0C 63 0C 63 0E 63 07 FF 03 FF", 103) /* g */,
    FF10x16_104("FF FF FF FF 00 C0 01 C0 03 80 03 00 03 00 03 80 01 FF 00 FF", 104) /* h */,
    FF10x16_105("00 00 00 00 00 03 0C 03 CF FF CF FF 00 03 00 03 00 00 00 00", 105) /* i */,
    FF10x16_106("00 00 00 0C 00 0E 00 07 00 03 00 03 0C 07 CF FE CF FC 00 00", 106) /* j */,
    FF10x16_107("00 00 FF FF FF FF 00 30 00 78 00 FC 01 CE 03 87 03 03 00 00", 107) /* k */,
    FF10x16_108("00 00 00 00 00 03 C0 03 FF FF FF FF 00 03 00 03 00 00 00 00", 108) /* l */,
    FF10x16_109("0F FF 0F FF 0C 00 0E 00 07 C0 07 C0 0E 00 0C 00 07 FF 03 FF", 109) /* m */,
    FF10x16_110("0F FF 0F FF 03 80 07 00 0E 00 0C 00 0C 00 0E 00 07 FF 03 FF", 110) /* n */,
    FF10x16_111("03 FC 07 FE 0E 07 0C 03 0C 03 0C 03 0C 03 0E 07 07 FE 03 FC", 111) /* o */,
    FF10x16_112("0F FF 0F FF 03 E0 06 E0 0C 60 0C 60 0C 60 0E E0 07 C0 03 80", 112) /* p */,
    FF10x16_113("03 80 07 C0 0E E0 0C 60 0C 60 0C 60 06 E0 03 E0 0F FF 0F FF", 113) /* q */,
    FF10x16_114("0F FF 0F FF 03 00 07 00 0E 00 0C 00 0C 00 0E 00 07 00 03 00", 114) /* r */,
    FF10x16_115("03 83 07 C3 0E E3 0C 63 0C 63 0C 63 0C 63 0C 77 00 3E 00 1C", 115) /* s */,
    FF10x16_116("0C 00 0C 00 FF FC FF FE 0C 07 0C 03 00 03 00 07 00 0E 00 0C", 116) /* t */,
    FF10x16_117("0F FC 0F FE 00 07 00 03 00 03 00 07 00 0E 00 1C 0F FF 0F FF", 117) /* u */,
    FF10x16_118("0F F0 0F F8 00 1C 00 0E 00 07 00 07 00 0E 00 1C 0F F8 0F F0", 118) /* v */,
    FF10x16_119("0F FC 0F FE 00 07 00 07 00 3E 00 3E 00 07 00 07 0F FE 0F FC", 119) /* w */,
    FF10x16_120("0E 07 0F 0F 03 9C 01 F8 00 F0 00 F0 01 F8 03 9C 0F 0F 0E 07", 120) /* x */,
    FF10x16_121("0F 80 0F C0 00 E3 00 63 00 63 00 63 00 63 00 67 0F FE 0F FC", 121) /* y */,
    FF10x16_122("0C 07 0C 0F 0C 1F 0C 3B 0C 73 0C E3 0D C3 0F 83 0F 03 0E 03", 122) /* z */,
    FF10x16_123("00 00 01 80 1F F8 7E 7E E0 07 C0 03 00 00 00 00 00 00 00 00", 123) /* { */,
    FF10x16_125("00 00 00 00 00 00 C0 03 E0 07 7E 7E 1F F8 01 80 00 00 00 00", 125) /* } */,
    FF10x16_161("00 00 00 00 00 00 00 00 CF FF CF FF 00 00 00 00 00 00 00 00", 161) /* &iexcl; */,
    FF10x16_186("00 00 30 00 78 00 CC 00 CC 00 78 00 30 00 00 00 00 00 00 00", 186) /* &ordm; */,
    FF10x16_191("00 3C 00 7E 00 E7 01 C3 CF 83 CF 03 00 03 00 07 00 0E 00 0C", 191) /* &iquest; */,
    FF10x16_209("0F FF 0F FF C7 00 C3 80 C1 C0 C0 E0 C0 70 C0 38 0F FF 0F FF", 209) /* &Ntilde; */,
    FF10x16_241("0F FF 0F FF C3 80 C7 00 CE 00 CC 00 CC 00 CE 00 07 FF 03 FF", 241) /* &ntilde; */;


    private final String hexLetter;
    private final int intLetter;

    FontFormat10x16(String hexLetter, int intLetter) {
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
        return 10;
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
