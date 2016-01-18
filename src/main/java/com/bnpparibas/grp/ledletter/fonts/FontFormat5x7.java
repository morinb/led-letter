package com.bnpparibas.grp.ledletter.fonts;

/**
 * @author morinb.
 */
public enum FontFormat5x7 implements LetterDescription {
    F57_32("00 00 00 00 00", 32) /* SPACE */,
    F57_33("00 00 FA 00 00", 33) /* ! */,
    F57_34("A0 C0 00 A0 C0", 34) /* " */,
    F57_35("28 FE 28 FE 28", 35) /* # */,
    F57_36("24 54 FE 54 48", 36) /* $ */,
    F57_37("C4 C8 10 26 46", 37) /* % */,
    F57_38("6C 92 AA 44 0A", 38) /* & */,
    F57_40("00 7C 82 00 00", 40) /* ( */,
    F57_41("00 00 82 7C 00", 41) /* ) */,
    F57_42("54 38 7C 38 54", 42) /* * */,
    F57_43("10 10 7C 10 10", 43) /* + */,
    F57_44("00 0A 0C 00 00", 44) /* , */,
    F57_45("10 10 10 10 10", 45) /* - */,
    F57_46("00 06 06 00 00", 46) /* . */,
    F57_47("04 08 10 20 40", 47) /*  / */,
    F57_48("7C 8A 92 A2 7C", 48) /* 0 */,
    F57_49("00 42 FE 02 00", 49) /* 1 */,
    F57_50("46 8A 92 92 62", 50) /* 2 */,
    F57_51("44 82 92 92 6C", 51) /* 3 */,
    F57_52("18 28 4A FE 0A", 52) /* 4 */,
    F57_53("E4 A2 A2 A2 9C", 53) /* 5 */,
    F57_54("7C 92 92 92 4C", 54) /* 6 */,
    F57_55("80 80 9E A0 C0", 55) /* 7 */,
    F57_56("6C 92 92 92 6C", 56) /* 8 */,
    F57_57("60 92 92 92 7C", 57) /* 9 */,
    F57_58("00 66 66 00 00", 58) /* : */,
    F57_59("00 6A 6C 00 00", 59) /* ; */,
    F57_60("10 28 44 82 00", 60) /* < */,
    F57_61("28 28 28 28 28", 61) /*  = */,
    F57_62("00 82 44 28 10", 62) /* > */,
    F57_63("40 80 8A 90 60", 63) /* ? */,
    F57_64("7C 82 BA AA 78", 64) /* @ */,
    F57_65("7E 88 88 88 7E", 65) /* A */,
    F57_66("FE 92 92 92 6C", 66) /* B */,
    F57_67("7C 82 82 82 44", 67) /* C */,
    F57_68("FE 82 82 82 7C", 68) /* D */,
    F57_69("FE 92 92 82 82", 69) /* E */,
    F57_70("FE 90 90 80 80", 70) /* F */,
    F57_71("7C 82 92 92 5C", 71) /* G */,
    F57_72("FE 10 10 10 FE", 72) /* H */,
    F57_73("00 82 FE 82 00", 73) /* I */,
    F57_74("04 02 02 02 FC", 74) /* J */,
    F57_75("FE 10 28 44 82", 75) /* K */,
    F57_76("FE 02 02 02 02", 76) /* L */,
    F57_77("FE 40 20 40 FE", 77) /* M */,
    F57_78("FE 40 20 10 FE", 78) /* N */,
    F57_79("7C 82 82 82 7C", 79) /* O */,
    F57_80("FE 90 90 90 60", 80) /* P */,
    F57_81("7C 82 82 84 7A", 81) /* Q */,
    F57_82("FE 90 98 94 62", 82) /* R */,
    F57_83("64 92 92 92 4C", 83) /* S */,
    F57_84("80 80 FE 80 80", 84) /* T */,
    F57_85("FC 02 02 02 FC", 85) /* U */,
    F57_86("E0 18 06 18 E0", 86) /* V */,
    F57_87("FC 02 1C 02 FC", 87) /* W */,
    F57_88("C6 28 10 28 C6", 88) /* X */,
    F57_89("E0 10 0E 10 E0", 89) /* Y */,
    F57_90("86 8A 92 A2 C2", 90) /* Z */,
    F57_91("00 FE 82 00 00", 91) /* [ */,
    F57_92("40 20 10 08 04", 92) /* \ */,
    F57_93("00 00 82 FE 00", 93) /* ] */,
    F57_95("02 02 02 02 02", 95) /* _ */,
    F57_97("04 2A 2A 2A 1E", 97) /* a */,
    F57_98("FC 12 22 22 1C", 98) /* b */,
    F57_99("1C 22 22 22 22", 99) /* c */,
    F57_100("1C 22 22 12 FE", 100) /* d */,
    F57_101("1C 2A 2A 2A 18", 101) /* e */,
    F57_102("08 7E 88 80 40", 102) /* f */,
    F57_103("10 2A 2A 2A 1E", 103) /* g */,
    F57_104("FE 10 20 20 1E", 104) /* h */,
    F57_105("00 22 BE 02 00", 105) /* i */,
    F57_106("04 02 22 BC 00", 106) /* j */,
    F57_107("FE 08 14 22 00", 107) /* k */,
    F57_108("00 82 FE 02 00", 108) /* l */,
    F57_109("3E 20 10 20 1E", 109) /* m */,
    F57_110("3E 10 20 20 1E", 110) /* n */,
    F57_111("1C 22 22 22 1C", 111) /* o */,
    F57_112("3E 18 28 28 10", 112) /* p */,
    F57_113("10 28 28 18 3E", 113) /* q */,
    F57_114("3E 10 20 20 10", 114) /* r */,
    F57_115("12 2A 2A 2A 04", 115) /* s */,
    F57_116("20 FC 22 02 04", 116) /* t */,
    F57_117("3C 02 02 04 3E", 117) /* u */,
    F57_118("38 04 02 04 38", 118) /* v */,
    F57_119("3C 02 0C 02 3C", 119) /* w */,
    F57_120("22 14 08 14 22", 120) /* x */,
    F57_121("30 0A 0A 0A 3C", 121) /* y */,
    F57_122("22 26 2A 32 22", 122) /* z */,
    F57_123("10 6C 82 00 00", 123) /* { */,
    F57_125("00 00 82 6C 10", 125) /* } */,
    F57_161("00 00 BE 00 00", 161) /* &iexcl; */,
    F57_186("40 A0 40 00 00", 186) /* &ordm; */,
    F57_191("0C 12 A2 02 04", 191) /* &iquest; */,
    F57_209("3E 90 88 84 3E", 209) /* &Ntilde; */,
    F57_241("3E 90 A0 A0 1E", 241) /* &ntilde; */;


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


}

