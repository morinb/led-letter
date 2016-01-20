package com.bnpparibas.grp.ledletter.fonts;

import com.bnpparibas.grp.ledletter.HexUtils;

import java.util.BitSet;

/**
 * Adaptation of jfxtras MatrixPanel
 */
public enum FontFormat10x14 implements LetterDescription {


    FF10x14_32("00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 32) /* SPACE */,
    FF10x14_33("00 00 00 00 00 00 00 00 FF CC FF CC 00 00 00 00 00 00 00 00", 33) /* ! */,
    FF10x14_34("CC 00 CC 00 F8 00 F0 00 00 00 CC 00 CC 00 F8 00 F0 00 00 00", 34) /* " */,
    FF10x14_35("0C C0 0C C0 FF FC FF FC 0C C0 0C C0 FF FC FF FC 0C C0 0C C0", 35) /* # */,
    FF10x14_36("1E 30 3F 30 33 30 33 30 FF FC FF FC 33 30 33 30 33 F0 31 E0", 36) /* $ */,
    FF10x14_37("60 30 F0 70 F0 E0 61 C0 03 80 07 00 0E 18 1C 3C 38 3C 30 18", 37) /* % */,
    FF10x14_38("3C F0 7F F8 E7 9C C7 8C CF CC FC FC 78 78 00 78 00 FC 00 CC", 38) /* & */,
    FF10x14_40("00 00 00 00 1F E0 7F F8 E0 1C C0 0C 00 00 00 00 00 00 00 00", 40) /* ( */,
    FF10x14_41("00 00 00 00 00 00 C0 0C E0 1C 7F F8 1F E0 00 00 00 00 00 00", 41) /* ) */,
    FF10x14_42("03 00 1B 60 1F E0 0F C0 3F F0 3F F0 0F C0 1F E0 1B 60 03 00", 42) /* * */,
    FF10x14_43("03 00 03 00 03 00 03 00 3F F0 3F F0 03 00 03 00 03 00 03 00", 43) /* + */,
    FF10x14_44("00 00 00 00 00 CC 00 CC 00 F8 00 F0 00 00 00 00 00 00 00 00", 44) /* , */,
    FF10x14_45("03 00 03 00 03 00 03 00 03 00 03 00 03 00 03 00 03 00 00 00", 45) /* - */,
    FF10x14_46("00 00 00 00 00 18 00 3C 00 3C 00 18 00 00 00 00 00 00 00 00", 46) /* . */,
    FF10x14_47("00 30 00 70 00 E0 01 C0 03 80 07 00 0E 00 1C 00 38 00 30 00", 47) /*  / */,
    FF10x14_48("1F E0 7F F8 60 98 C1 0C C1 0C C2 0C C2 0C 64 18 7F F8 1F E0", 48) /* 0 */,
    FF10x14_49("00 00 00 00 30 0C 70 0C FF FC FF FC 00 0C 00 0C 00 00 00 00", 49) /* 1 */,
    FF10x14_50("30 3C 70 7C E0 EC C1 CC C3 8C C3 0C C3 0C E7 0C 7E 0C 3C 0C", 50) /* 2 */,
    FF10x14_51("30 30 70 38 E0 1C C0 0C C0 0C C3 0C C3 0C E7 9C 7C F8 3C F0", 51) /* 3 */,
    FF10x14_52("03 C0 07 C0 0E C0 1C C0 38 CC 70 CC FF FC FF FC 00 CC 00 CC", 52) /* 4 */,
    FF10x14_53("FE 30 FE 38 C6 1C C6 0C C6 0C C6 0C C6 0C C7 1C C3 F8 C1 F0", 53) /* 5 */,
    FF10x14_54("3F F0 7F F8 E3 1C C3 0C C3 0C C3 0C C3 0C C3 9C 01 F8 00 F0", 54) /* 6 */,
    FF10x14_55("C0 00 C0 00 C0 00 C0 00 C1 FC C7 FC CF 00 DC 00 F8 00 F0 00", 55) /* 7 */,
    FF10x14_56("3C F0 7F F8 E7 9C C3 0C C3 0C C3 0C C3 0C E7 9C 7F F8 3C F0", 56) /* 8 */,
    FF10x14_57("3C 00 7E 00 E7 0C C3 0C C3 0C C3 0C C3 0C E3 1C 7F F8 3F F0", 57) /* 9 */,
    FF10x14_58("00 00 00 00 00 00 0C 18 1E 3C 1E 3C 0C 18 00 00 00 00 00 00", 58) /* : */,
    FF10x14_59("00 00 00 00 00 CC 18 CC 3C F8 3C F0 18 00 00 00 00 00 00 00", 59) /* ; */,
    FF10x14_60("00 00 03 00 07 80 0F C0 1C E0 38 70 70 38 E0 1C C0 0C 00 00", 60) /* < */,
    FF10x14_61("0C C0 0C C0 0C C0 0C C0 0C C0 0C C0 0C C0 0C C0 0C C0 00 00", 61) /*  = */,
    FF10x14_62("00 00 C0 0C E0 1C 70 38 38 70 1C E0 0F C0 07 80 03 00 00 00", 62) /* > */,
    FF10x14_63("30 00 70 00 E0 00 C0 00 C1 CC C3 CC C7 00 EE 00 7C 00 38 00", 63) /* ? */,
    FF10x14_64("3F F0 7F F8 E0 1C C0 0C C7 8C CF CC CC CC EC CC 7F C0 3F 80", 64) /* @ */,
    FF10x14_65("1F FC 7F FC 61 80 C1 80 C1 80 C1 80 C1 80 61 80 7F FC 1F FC", 65) /* A */,
    FF10x14_66("FF FC FF FC C3 0C C3 0C C3 0C C3 0C C3 0C 67 98 7C F8 18 60", 66) /* B */,
    FF10x14_67("1F E0 7F F8 60 18 C0 0C C0 0C C0 0C C0 0C 60 18 70 38 10 20", 67) /* C */,
    FF10x14_68("FF FC FF FC C0 0C C0 0C C0 0C C0 0C C0 0C 60 18 7F F8 1F E0", 68) /* D */,
    FF10x14_69("FF FC FF FC C3 0C C3 0C C3 0C C3 0C C3 0C C0 0C C0 0C C0 0C", 69) /* E */,
    FF10x14_70("FF FC FF FC C3 00 C3 00 C3 00 C3 00 C3 00 C0 00 C0 00 C0 00", 70) /* F */,
    FF10x14_71("3F F0 7F F8 E0 1C C0 0C C3 0C C3 0C C3 0C E3 1C 73 F8 33 F0", 71) /* G */,
    FF10x14_72("FF FC FF FC 03 00 03 00 03 00 03 00 03 00 03 00 FF FC FF FC", 72) /* H */,
    FF10x14_73("00 00 00 00 C0 0C C0 0C FF FC FF FC C0 0C C0 0C 00 00 00 00", 73) /* I */,
    FF10x14_74("00 30 00 38 00 1C 00 0C 00 0C 00 0C 00 0C 00 1C FF F8 FF F0", 74) /* J */,
    FF10x14_75("FF FC FF FC 03 00 07 80 0F C0 1C E0 38 70 70 38 E0 1C C0 0C", 75) /* K */,
    FF10x14_76("FF FC FF FC 00 0C 00 0C 00 0C 00 0C 00 0C 00 0C 00 0C 00 0C", 76) /* L */,
    FF10x14_77("FF FC FF FC 70 00 38 00 1E 00 1E 00 38 00 70 00 FF FC FF FC", 77) /* M */,
    FF10x14_78("FF FC FF FC 70 00 38 00 1C 00 0E 00 07 00 03 80 FF FC FF FC", 78) /* N */,
    FF10x14_79("1F E0 7F F8 60 18 C0 0C C0 0C C0 0C C0 0C 60 18 7F F8 1F E0", 79) /* O */,
    FF10x14_80("FF FC FF FC C3 00 C3 00 C3 00 C3 00 C3 00 66 00 7E 00 18 00", 80) /* P */,
    FF10x14_81("1F E0 7F F8 60 18 C0 0C C0 0C C0 0C C0 28 60 18 7F FC 1F CC", 81) /* Q */,
    FF10x14_82("FF FC FF FC C3 00 C3 80 C3 C0 C3 E0 C3 70 66 38 7E 1C 18 0C", 82) /* R */,
    FF10x14_83("18 30 7E 38 66 18 C3 0C C3 0C C3 0C C3 0C 61 98 71 F8 10 60", 83) /* S */,
    FF10x14_84("C0 00 C0 00 C0 00 C0 00 FF FC FF FC C0 00 C0 00 C0 00 C0 00", 84) /* T */,
    FF10x14_85("FF E0 FF F8 00 18 00 0C 00 0C 00 0C 00 0C 00 18 FF F8 FF E0", 85) /* U */,
    FF10x14_86("F0 00 FE 00 1F C0 03 F0 00 3C 00 3C 03 F0 1F C0 FE 00 F0 00", 86) /* V */,
    FF10x14_87("FF E0 FF F8 00 1C 00 3C 03 F8 03 F8 00 3C 00 1C FF F8 FF E0", 87) /* W */,
    FF10x14_88("F0 3C F8 7C 1C E0 0F C0 07 80 07 80 0F C0 1C E0 F8 7C F0 3C", 88) /* X */,
    FF10x14_89("F0 00 FC 00 0E 00 07 80 01 FC 01 FC 07 80 0E 00 FC 00 F0 00", 89) /* Y */,
    FF10x14_90("C0 3C C0 7C C0 EC C1 CC C3 8C C7 0C CE 0C DC 0C F8 0C F0 0C", 90) /* Z */,
    FF10x14_91("00 00 00 00 FF FC FF FC C0 0C C0 0C 00 00 00 00 00 00 00 00", 91) /* [ */,
    FF10x14_92("30 00 38 00 1C 00 0E 00 07 00 03 80 01 C0 00 E0 00 70 00 30", 92) /* \ */,
    FF10x14_93("00 00 00 00 00 00 C0 0C C0 0C FF FC FF FC 00 00 00 00 00 00", 93) /* ] */,
    FF10x14_95("00 00 00 0C 00 0C 00 0C 00 0C 00 0C 00 0C 00 0C 00 00 00 00", 95) /* _ */,
    FF10x14_97("00 30 00 78 0C FC 0C CC 0C CC 0C CC 0C CC 0E CC 07 FC 03 FC", 97) /* a */,
    FF10x14_98("FF FC FF FC 03 0C 06 0C 0E 0C 0C 0C 0C 0C 0E 1C 07 F8 03 F0", 98) /* b */,
    FF10x14_99("03 F0 07 F8 0E 1C 0C 0C 0C 0C 0C 0C 0C 0C 0C 0C 0C 0C 0C 0C", 99) /* c */,
    FF10x14_100("03 F0 07 F8 0E 1C 0C 0C 0C 0C 0E 0C 07 0C 03 0C FF FC FF FC", 100) /* d */,
    FF10x14_101("03 F0 07 F8 0E DC 0C CC 0C CC 0C CC 0E CC 07 CC 03 C0 00 00", 101) /* e */,
    FF10x14_102("00 C0 00 C0 3F FC 7F FC E0 C0 C0 C0 C0 00 E0 00 70 00 30 00", 102) /* f */,
    FF10x14_103("03 00 07 80 0F CC 0C CC 0C CC 0C CC 0C CC 0E CC 07 FC 03 FC", 103) /* g */,
    FF10x14_104("FF FC FF FC 03 00 07 00 0E 00 0C 00 0C 00 0E 00 07 FC 03 FC", 104) /* h */,
    FF10x14_105("00 00 00 00 00 0C 0C 0C CF FC CF FC 00 0C 00 0C 00 00 00 00", 105) /* i */,
    FF10x14_106("00 00 00 30 00 38 00 1C 00 0C 00 0C 0C 1C CF F8 CF F0 00 00", 106) /* j */,
    FF10x14_107("00 00 FF FC FF FC 00 C0 01 E0 03 F0 07 38 0E 1C 0C 0C 00 00", 107) /* k */,
    FF10x14_108("00 00 00 00 00 0C C0 0C FF FC FF FC 00 0C 00 0C 00 00 00 00", 108) /* l */,
    FF10x14_109("0F FC 0F FC 0C 00 0E 00 07 C0 07 C0 0E 00 0C 00 07 FC 03 FC", 109) /* m */,
    FF10x14_110("0F FC 0F FC 03 80 07 00 0E 00 0C 00 0C 00 0E 00 07 FC 03 FC", 110) /* n */,
    FF10x14_111("03 F0 07 F8 0E 1C 0C 0C 0C 0C 0C 0C 0C 0C 0E 1C 07 F8 03 F0", 111) /* o */,
    FF10x14_112("0F FC 0F FC 03 C0 07 C0 0E C0 0C C0 0C C0 0F C0 07 80 03 00", 112) /* p */,
    FF10x14_113("03 00 07 80 0F C0 0C C0 0C C0 0E C0 07 C0 03 C0 0F FC 0F FC", 113) /* q */,
    FF10x14_114("0F FC 0F FC 03 00 07 00 0E 00 0C 00 0C 00 0E 00 07 00 03 00", 114) /* r */,
    FF10x14_115("03 0C 07 8C 0F CC 0C CC 0C CC 0C CC 0C CC 0C FC 00 78 00 30", 115) /* s */,
    FF10x14_116("0C 00 0C 00 FF F0 FF F8 0C 1C 0C 0C 00 0C 00 1C 00 38 00 30", 116) /* t */,
    FF10x14_117("0F F0 0F F8 00 1C 00 0C 00 0C 00 1C 00 38 00 70 0F FC 0F FC", 117) /* u */,
    FF10x14_118("0F C0 0F E0 00 70 00 38 00 1C 00 1C 00 38 00 70 0F E0 0F C0", 118) /* v */,
    FF10x14_119("0F F0 0F F8 00 1C 00 1C 00 F8 00 F8 00 1C 00 1C 0F F8 0F F0", 119) /* w */,
    FF10x14_120("0C 0C 0E 1C 07 38 03 F0 01 E0 01 E0 03 F0 07 38 0E 1C 0C 0C", 120) /* x */,
    FF10x14_121("0F 00 0F 80 01 CC 00 CC 00 CC 00 CC 00 CC 00 DC 0F F8 0F F0", 121) /* y */,
    FF10x14_122("0C 0C 0C 1C 0C 3C 0C 7C 0C EC 0D CC 0F 8C 0F 0C 0E 0C 0C 0C", 122) /* z */,
    FF10x14_123("00 00 03 00 1F E0 7C F8 E0 1C C0 0C 00 00 00 00 00 00 00 00", 123) /* { */,
    FF10x14_125("00 00 00 00 00 00 C0 0C E0 1C 7C F8 1F E0 03 00 00 00 00 00", 125) /* } */,
    FF10x14_161("00 00 00 00 00 00 00 00 CF FC CF FC 00 00 00 00 00 00 00 00", 161) /* &iexcl; */,
    FF10x14_186("00 00 30 00 78 00 CC 00 CC 00 78 00 30 00 00 00 00 00 00 00", 186) /* &ordm; */,
    FF10x14_191("00 F0 01 F8 03 9C 07 0C CE 0C CC 0C 00 0C 00 1C 00 38 00 30", 191) /* &iquest; */,
    FF10x14_209("0F FC 0F FC C7 00 C3 80 C1 C0 C0 E0 C0 70 C0 38 0F FC 0F FC", 209) /* &Ntilde; */,
    FF10x14_241("0F FC 0F FC C3 80 C7 00 CE 00 CC 00 CC 00 CE 00 07 FC 03 FC", 241) /* &ntilde; */;


    private final String hexLetter;
    private final int intLetter;

    FontFormat10x14(String hexLetter, int intLetter) {
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
        return 14;
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
