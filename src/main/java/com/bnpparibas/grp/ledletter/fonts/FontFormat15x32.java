package com.bnpparibas.grp.ledletter.fonts;

/**
 * Adaptation of jfxtras MatrixPanel
 */
public enum FontFormat15x32 implements LetterDescription {


    FF15x32_32("00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 32) /* SPACE */,
    FF15x32_33("00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 1E FF FF C0 3F FF FF FC 3F FF FF FC 3F FF FF C0 3F 00 00 00 1E 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 33) /* ! */,
    FF15x32_34("F0 F0 00 00 F0 F0 00 00 F1 C0 00 00 FF C0 00 00 FF 80 00 00 FE 00 00 00 00 00 00 00 00 00 00 00 F0 F0 00 00 F0 F0 00 00 F1 C0 00 00 FF C0 00 00 FF 80 00 00 FE 00 00 00 00 00 00 00 00 00 00 00", 34) /* " */,
    FF15x32_35("00 3C 78 00 00 3C 78 00 FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 3C 78 00 00 3C 78 00 00 3C 78 00 FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 3C 78 00 00 3C 78 00 00 00 00 00", 35) /* # */,
    FF15x32_36("00 FC 00 F0 03 FF 00 F0 07 FF 80 F0 07 FF 80 F0 0F 87 C0 F0 0F 87 C0 F0 FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 0F 03 E1 E0 0F 01 FF E0 0F 01 FF E0 0F 00 FF C0 0F 00 3F 00 00 00 00 00", 36) /* $ */,
    FF15x32_37("78 00 00 3F FC 00 00 FF FC 00 03 FC FC 00 0F F0 FC 00 3F C0 78 00 FF 00 00 03 FC 00 00 0F F0 00 00 3F C0 00 00 FF 00 1E 03 FC 00 3F 0F F0 00 3F 3F C0 00 3F FF 00 00 3F FC 00 00 1E 00 00 00 00", 37) /* % */,
    FF15x32_38("0F F0 FF F0 3F F9 FF FC 3F FF FF FE FE 7F E0 3E F8 3F C0 1F F8 7F C0 0F F0 7F E0 0F F9 F9 F0 1F FF F0 F8 3F 3F E0 7E 7E 3F C0 1F FC 0F 80 0F F8 06 00 1F FC 00 00 7E 7E 00 00 FC 3F 00 00 00 00", 38) /* & */,
    FF15x32_40("00 00 00 00 00 00 00 00 00 00 00 00 01 FF FF 80 07 FF FF E0 0F FF FF F0 3F FF FF FC 3F 00 00 FC FC 00 00 3F F0 00 00 0F 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 40) /* ( */,
    FF15x32_41("00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 F0 00 00 0F FC 00 00 3F 3F 00 00 FC 3F FF FF FC 0F FF FF F0 07 FF FF E0 01 FF FF 80 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 41) /* ) */,
    FF15x32_42("00 F3 CF 00 00 F3 CF 00 00 FF FF 00 00 FF FF 00 00 3F FC 00 03 FF FF C0 03 FF FF C0 03 FF FF C0 03 FF FF C0 00 3F FC 00 00 FF FF 00 00 FF FF 00 00 F3 CF 00 00 F3 CF 00 00 00 00 00 00 00 00 00", 42) /* * */,
    FF15x32_43("00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 03 FF FF C0 03 FF FF C0 03 FF FF C0 03 FF FF C0 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 00 00 00 00 00 00 00", 43) /* + */,
    FF15x32_44("00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 0F 0F 00 00 0F 0F 00 00 0F 1C 00 00 0F FC 00 00 0F F8 00 00 0F E0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 44) /* , */,
    FF15x32_45("00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 00 00 00", 45) /* - */,
    FF15x32_46("00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 1E 00 00 00 3F 00 00 00 3F 00 00 00 3F 00 00 00 3F 00 00 00 1E 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 46) /* . */,
    FF15x32_47("00 00 00 3F 00 00 00 FF 00 00 03 FC 00 00 0F F0 00 00 3F C0 00 00 FF 00 00 03 FC 00 00 0F F0 00 00 3F C0 00 00 FF 00 00 03 FC 00 00 0F F0 00 00 3F C0 00 00 FF 00 00 00 FC 00 00 00 00 00 00 00", 47) /*  / */,
    FF15x32_48("0F FF FF F0 3F FF FF FC 7F FF FF FE 7F FF FF FE FE 00 38 7F F8 00 70 1F F8 00 E0 1F F0 01 C0 0F F8 03 80 1F F8 07 00 1F FE 0E 00 7F 7F FF FF FE 7F FF FF FE 3F FF FF FC 0F FF FF F0 00 00 00 00", 48) /* 0 */,
    FF15x32_49("00 00 00 00 0F 00 00 0F 1F 00 00 0F 3F 00 00 0F 7F 00 00 0F FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 00 00 00 00 00", 49) /* 1 */,
    FF15x32_50("0F 00 00 0F 3F 00 00 3F 7F 00 00 FF 7F 00 03 FF FE 00 0F FF F8 00 3F FF F8 00 FF CF F0 03 FF 0F F8 0F FC 0F F8 3F F0 0F FE FF C0 0F 7F FF 00 0F 7F FC 00 0F 3F F0 00 0F 0F C0 00 0F 00 00 00 00", 50) /* 2 */,
    FF15x32_51("0F 00 00 F0 3F 00 00 FC 7F 00 00 FE 7F 00 00 FE FE 00 00 7F F8 03 C0 1F F8 03 C0 1F F0 03 C0 0F F8 07 E0 1F F8 07 E0 1F FE 1F F8 7F 7F FE 7F FE 7F FE 7F FE 3F FC 3F FC 0F F0 0F F0 00 00 00 00", 51) /* 3 */,
    FF15x32_52("00 00 3C 00 00 00 FC 00 00 03 FC 00 00 0F FC 00 00 3F FC 00 00 FF 3C 0F 03 FC 3C 0F 0F F0 3C 0F 3F FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 00 3C 0F 00 00 3C 0F 00 00 3C 0F 00 00 00 00", 52) /* 4 */,
    FF15x32_53("FF FE 00 F0 FF FE 00 FC FF FE 00 FE FF FE 00 FE F0 1E 00 7F F0 1E 00 1F F0 1E 00 1F F0 1E 00 0F F0 1F 00 1F F0 1F 00 1F F0 1F C0 7F F0 0F FF FE F0 0F FF FE F0 07 FF FC F0 01 FF F0 00 00 00 00", 53) /* 5 */,
    FF15x32_54("0F FF FF F0 3F FF FF FC 7F FF FF FE 7F FF FF FE FE 0F C0 7F F8 1F 00 1F F8 1F 00 1F F0 1E 00 0F F0 1F 00 1F F0 1F 00 1F F0 1F C0 7F F0 0F FF FE F0 0F FF FE 00 07 FF FC 00 01 FF F0 00 00 00 00", 54) /* 6 */,
    FF15x32_55("F0 00 00 00 F0 00 00 00 F0 00 00 00 F0 00 00 00 F0 00 00 00 F0 00 FF FF F0 07 FF FF F0 1F FF FF F0 7F FF FF F1 FF 80 00 F7 FC 00 00 FF F0 00 00 FF C0 00 00 FF 00 00 00 FC 00 00 00 00 00 00 00", 55) /* 7 */,
    FF15x32_56("0F F0 0F F0 3F FC 3F FC 7F FE 7F FE 7F FE 7F FE FE 1F F8 7F F8 07 E0 1F F8 07 E0 1F F0 03 C0 0F F8 07 E0 1F F8 07 E0 1F FE 1F F8 7F 7F FE 7F FE 7F FE 7F FE 3F FC 3F FC 0F F0 0F F0 00 00 00 00", 56) /* 8 */,
    FF15x32_57("0F FC 00 00 3F FF 00 00 7F FF 80 00 7F FF 80 1F FE 1F C0 1F F8 07 C0 1F F8 07 C0 1F F0 03 C0 0F F8 07 C0 1F F8 07 C0 1F FE 1F 80 7F 7F FF FF FE 7F FF FF FE 3F FF FF FC 0F FF FF F0 00 00 00 00", 57) /* 9 */,
    FF15x32_58("00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 78 03 C0 00 FC 07 E0 00 FC 07 E0 00 FC 07 E0 00 FC 07 E0 00 78 03 C0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 58) /* : */,
    FF15x32_59("00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 78 0F 0F 00 FC 0F 0F 00 FC 0F 1C 00 FC 0F FC 00 FC 0F F8 00 78 0F E0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 59) /* ; */,
    FF15x32_60("00 03 C0 00 00 0F F0 00 00 0F F0 00 00 3F FC 00 00 3E 7C 00 00 FC 3F 00 00 F0 0F 00 03 F0 0F C0 03 C0 03 C0 0F C0 03 F0 0F 00 00 F0 3F 00 00 FC 3C 00 00 3C 3C 00 00 3C 00 00 00 00 00 00 00 00", 60) /* < */,
    FF15x32_61("00 3C 3C 00 00 3C 3C 00 00 3C 3C 00 00 3C 3C 00 00 3C 3C 00 00 3C 3C 00 00 3C 3C 00 00 3C 3C 00 00 3C 3C 00 00 3C 3C 00 00 3C 3C 00 00 3C 3C 00 00 3C 3C 00 00 3C 3C 00 00 3C 3C 00 00 00 00 00", 61) /*  = */,
    FF15x32_62("00 00 00 00 3C 00 00 3C 3C 00 00 3C 3F 00 00 FC 0F 00 00 F0 0F C0 03 F0 03 C0 03 C0 03 F0 0F C0 00 F0 0F 00 00 FC 3F 00 00 3E 7C 00 00 3F FC 00 00 0F F0 00 00 0F F0 00 00 03 C0 00 00 00 00 00", 62) /* > */,
    FF15x32_63("0F 00 00 00 3F 00 00 00 7F 00 00 00 7F 00 00 00 FE 00 00 00 F8 00 00 00 F8 00 FF 0F F0 03 FF 0F F8 07 FF 0F F8 1F FF 0F FE 7F 80 00 7F FE 00 00 7F FC 00 00 3F F0 00 00 0F C0 00 00 00 00 00 00", 63) /* ? */,
    FF15x32_64("0F FF FF F0 3F FF FF FC 7F FF FF FE 7F FF FF FE FE 00 00 7F F8 00 00 1F F8 1F E0 1F F0 7F F8 0F F0 7F F8 0F F8 F0 3C 0F F8 F0 3C 0F 7E F0 3C 0F 7F FF F8 0F 3F FF F8 00 0F FF E0 00 00 00 00 00", 64) /* @ */,
    FF15x32_65("0F FF FF FF 3F FF FF FF 7F FF FF FF 7F FF FF FF FE 00 F0 00 F8 00 F0 00 F8 00 F0 00 F0 00 F0 00 F8 00 F0 00 F8 00 F0 00 FE 00 F0 00 7F FF FF FF 7F FF FF FF 3F FF FF FF 0F FF FF FF 00 00 00 00", 65) /* A */,
    FF15x32_66("FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF F0 03 C0 0F F0 03 C0 0F F0 03 C0 0F F0 03 C0 0F F8 07 E0 1F F8 07 E0 1F FE 1F F8 7F 7F FF FF FE 7F FE 7F FE 3F FC 3F FC 0F F0 0F F0 00 00 00 00", 66) /* B */,
    FF15x32_67("0F FF FF F0 3F FF FF FC 7F FF FF FE 7F FF FF FE FE 00 00 7F F8 00 00 1F F8 00 00 1F F0 00 00 0F F8 00 00 1F F8 00 00 1F FE 00 00 7F 7E 00 00 7E 7E 00 00 7E 3E 00 00 7C 0E 00 00 70 00 00 00 00", 67) /* C */,
    FF15x32_68("FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF F0 00 00 0F F0 00 00 0F F0 00 00 0F F0 00 00 0F F8 00 00 1F F8 00 00 1F FE 00 00 7F 7F FF FF FE 7F FF FF FE 3F FF FF FC 0F FF FF F0 00 00 00 00", 68) /* D */,
    FF15x32_69("FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF F0 03 C0 0F F0 03 C0 0F F0 03 C0 0F F0 03 C0 0F F0 03 C0 0F F0 03 C0 0F F0 03 C0 0F F0 00 00 0F F0 00 00 0F F0 00 00 0F F0 00 00 0F 00 00 00 00", 69) /* E */,
    FF15x32_70("FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF F0 03 C0 00 F0 03 C0 00 F0 03 C0 00 F0 03 C0 00 F0 03 C0 00 F0 03 C0 00 F0 03 C0 00 F0 00 00 00 F0 00 00 00 F0 00 00 00 F0 00 00 00 00 00 00 00", 70) /* F */,
    FF15x32_71("0F FF FF F0 3F FF FF FC 7F FF FF FE 7F FF FF FE FE 00 00 7F F8 00 00 1F F8 00 00 1F F0 03 C0 0F F8 03 C0 1F F8 03 C0 1F FE 03 C0 7F 7E 03 FF FE 7E 03 FF FE 3E 03 FF FC 0E 03 FF F0 00 00 00 00", 71) /* G */,
    FF15x32_72("FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 00 03 C0 00 FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 00 00 00", 72) /* H */,
    FF15x32_73("00 00 00 00 00 00 00 00 F0 00 00 0F F0 00 00 0F F0 00 00 0F FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF F0 00 00 0F F0 00 00 0F F0 00 00 0F 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 73) /* I */,
    FF15x32_74("00 00 00 E0 00 00 00 F8 00 00 00 FC 00 00 00 FE 00 00 00 7E 00 00 00 1F 00 00 00 1F 00 00 00 0F 00 00 00 1F 00 00 00 1F 00 00 00 7F FF FF FF FE FF FF FF FE FF FF FF FC FF FF FF F0 00 00 00 00", 74) /* J */,
    FF15x32_75("FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 3F FC 00 00 7E 7E 00 00 FC 3F 00 01 F8 1F 80 03 F0 0F C0 07 E0 07 E0 0F C0 03 F0 1F 80 01 F8 3F 00 00 FC 7E 00 00 7E FC 00 00 3F 00 00 00 00", 75) /* K */,
    FF15x32_76("FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 00", 76) /* L */,
    FF15x32_77("FF FF FF FF 7F FF FF FF 3F FF FF FF 1F FF FF FF 0F C0 00 00 07 E0 00 00 03 F0 00 00 01 F8 00 00 03 F0 00 00 07 E0 00 00 0F C0 00 00 1F FF FF FF 3F FF FF FF 7F FF FF FF FF FF FF FF 00 00 00 00", 77) /* M */,
    FF15x32_78("FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 7F 00 00 00 3F 80 00 00 1F C0 00 00 0F E0 00 00 07 F0 00 00 03 F8 00 00 01 FC 00 00 FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 00 00 00", 78) /* N */,
    FF15x32_79("0F FF FF F0 3F FF FF FC 7F FF FF FE 7F FF FF FE FE 00 00 7F F8 00 00 1F F8 00 00 1F F0 00 00 0F F8 00 00 1F F8 00 00 1F FE 00 00 7F 7F FF FF FE 7F FF FF FE 3F FF FF FC 0F FF FF F0 00 00 00 00", 79) /* O */,
    FF15x32_80("FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF F0 01 E0 00 F0 01 E0 00 F0 01 E0 00 F0 01 E0 00 F8 03 E0 00 F8 03 E0 00 FE 0F E0 00 7F FF C0 00 7F FF C0 00 3F FF 80 00 0F FE 00 00 00 00 00 00", 80) /* P */,
    FF15x32_81("0F FF FF F0 3F FF FF FC 7F FF FF FE 7F FF FF FE FE 00 00 7F F8 00 00 1F F8 00 00 0F F0 00 00 FF F8 00 00 FF F8 00 00 7E FE 00 00 3E 7F FF FF FF 7F FF FF FF 3F FF FF FF 0F FF FF F3 00 00 00 00", 81) /* Q */,
    FF15x32_82("FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF F0 01 FE 00 F0 01 FF 00 F0 01 FF 80 F0 01 EF C0 F8 03 E7 E0 F8 03 E3 F0 FE 0F E1 F8 7F FF C0 FC 7F FF C0 7E 3F FF 80 3F 0F FE 00 1F 00 00 00 00", 82) /* R */,
    FF15x32_83("0F FC 00 F0 3F FF 00 FC 7F FF 80 FE 7F FF 80 FE FE 1F C0 7F F8 07 C0 1F F8 07 C0 1F F0 03 C0 0F F8 03 E0 1F F8 03 E0 1F FE 03 F8 7F 7F 01 FF FE 7F 01 FF FE 3F 00 FF FC 0F 00 3F F0 00 00 00 00", 83) /* S */,
    FF15x32_84("F0 00 00 00 F0 00 00 00 F0 00 00 00 F0 00 00 00 F0 00 00 00 FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF F0 00 00 00 F0 00 00 00 F0 00 00 00 F0 00 00 00 F0 00 00 00 F0 00 00 00 00 00 00 00", 84) /* T */,
    FF15x32_85("FF FF FF F0 FF FF FF FC FF FF FF FE FF FF FF FE 00 00 00 7F 00 00 00 1F 00 00 00 1F 00 00 00 0F 00 00 00 1F 00 00 00 1F 00 00 00 7F FF FF FF FE FF FF FF FE FF FF FF FC FF FF FF F0 00 00 00 00", 85) /* U */,
    FF15x32_86("FE 00 00 00 FF F8 00 00 FF FF C0 00 FF FF FE 00 07 FF FF F0 00 7F FF F0 00 0F FF FF 00 00 1F FF 00 0F FF FF 00 7F FF F0 07 FF FF F0 FF FF FE 00 FF FF C0 00 FF F8 00 00 FE 00 00 00 00 00 00 00", 86) /* V */,
    FF15x32_87("FF FF FF F0 FF FF FF FC FF FF FF FE FF FF FF FF 00 00 00 7F 00 00 00 1F 00 00 FF FE 00 00 FF F8 00 00 FF FE 00 00 00 1F 00 00 00 7F FF FF FF FF FF FF FF FE FF FF FF FC FF FF FF F0 00 00 00 00", 87) /* W */,
    FF15x32_88("FE 00 00 7F FF 80 01 FF FF C0 07 FF FF F0 1F FF 1F FE 7F F8 01 FF FF 80 00 3F FC 00 00 0F F0 00 00 3F FC 00 01 FF FF 80 1F FE 7F F8 FF F8 1F FF FF E0 07 FF FF 80 01 FF FE 00 00 7F 00 00 00 00", 88) /* X */,
    FF15x32_89("FE 00 00 00 FF C0 00 00 FF F0 00 00 FF FC 00 00 07 FF 00 00 00 FF C0 00 00 3F FF FF 00 0F FF FF 00 3F FF FF 00 FF C0 00 07 FF 00 00 FF FC 00 00 FF F0 00 00 FF C0 00 00 FE 00 00 00 00 00 00 00", 89) /* Y */,
    FF15x32_90("F0 00 00 3F F0 00 00 FF F0 00 03 FF F0 00 0F FF F0 00 3F CF F0 00 FF 0F F0 03 FC 0F F0 0F F0 0F F0 3F C0 0F F0 FF 00 0F F3 FC 00 0F FF F0 00 0F FF C0 00 0F FF 00 00 0F FC 00 00 0F 00 00 00 00", 90) /* Z */,
    FF15x32_91("00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF F0 00 00 0F F0 00 00 0F F0 00 00 0F F0 00 00 0F 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 91) /* [ */,
    FF15x32_92("FC 00 00 00 FC 00 00 00 3F C0 00 00 0F F0 00 00 03 FC 00 00 00 FF 00 00 00 3F C0 00 00 0F F0 00 00 03 FC 00 00 00 FF 00 00 00 3F C0 00 00 0F F0 00 00 03 FC 00 00 00 FF 00 00 00 3F 00 00 00 00", 92) /* \ */,
    FF15x32_93("00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 F0 00 00 0F F0 00 00 0F F0 00 00 0F F0 00 00 0F FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 93) /* ] */,
    FF15x32_95("00 00 00 00 00 00 00 00 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 00 00 00 00 00", 95) /* _ */,
    FF15x32_97("00 00 07 F0 00 00 3F FC 00 00 7F FE 00 F0 7F FE 00 F0 FE 7F 00 F0 F8 1F 00 F0 F0 0F 00 F0 F0 0F 00 F8 F0 0F 00 F8 F0 0F 00 FE F0 0F 00 7F FF FF 00 7F FF FF 00 3F FF FF 00 07 FF FF 00 00 00 00", 97) /* a */,
    FF15x32_98("FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 00 F8 0F 00 03 F0 0F 00 07 E0 0F 00 07 C0 0F 00 0F 80 1F 00 0F 80 1F 00 0F E0 7F 00 07 FF FE 00 07 FF FE 00 03 FF FC 00 00 7F F0 00 00 00 00", 98) /* b */,
    FF15x32_99("00 0F FF F0 00 3F FF FC 00 7F FF FE 00 7F FF FE 00 FE 00 7F 00 F8 00 1F 00 F8 00 1F 00 F0 00 0F 00 F0 00 0F 00 F0 00 0F 00 F0 00 0F 00 F0 00 0F 00 F0 00 0F 00 F0 00 0F 00 F0 00 0F 00 00 00 00", 99) /* c */,
    FF15x32_100("00 00 FF F0 00 03 FF FC 00 07 FF FE 00 07 FF FE 00 0F E0 7F 00 0F 80 1F 00 0F 80 1F 00 07 C0 0F 00 07 E0 0F 00 03 F0 0F 00 00 F8 0F FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 00 00 00", 100) /* d */,
    FF15x32_101("00 0F FF F0 00 3F FF FC 00 7F FF FE 00 7F FF FE 00 FE 3C 7F 00 F8 3C 1F 00 F8 3C 1F 00 F0 3C 0F 00 F8 3C 0F 00 F8 3C 0F 00 FE 3C 0F 00 7F FC 0F 00 7F FC 0F 00 3F FC 00 00 0F FC 00 00 00 00 00", 101) /* e */,
    FF15x32_102("00 00 3C 00 00 00 3C 00 0F FF FF FF 3F FF FF FF 7F FF FF FF 7F FF FF FF FE 00 3C 00 F8 00 3C 00 F0 00 3C 00 F8 00 00 00 FE 00 00 00 7F 00 00 00 7F 00 00 00 3F 00 00 00 0F 00 00 00 00 00 00 00", 102) /* f */,
    FF15x32_103("00 0F C0 00 00 3F F0 00 00 7F F8 0F 00 7F F8 0F 00 FE FC 0F 00 F8 7C 0F 00 F8 7C 0F 00 F0 3C 0F 00 F8 3C 0F 00 F8 3C 0F 00 FE 3C 1F 00 7F FF FF 00 7F FF FF 00 3F FF FF 00 0F FF FF 00 00 00 00", 103) /* g */,
    FF15x32_104("FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 00 F8 00 00 03 F0 00 00 07 E0 00 00 07 C0 00 00 0F 80 00 00 0F 80 00 00 0F E0 00 00 07 FF FF 00 07 FF FF 00 03 FF FF 00 00 7F FF 00 00 00 00", 104) /* h */,
    FF15x32_105("00 00 00 00 00 00 00 00 00 00 00 0F 00 3C 00 0F 00 3C 00 0F 18 3F FF FF 3C 3F FF FF 3C 3F FF FF 18 3F FF FF 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 105) /* i */,
    FF15x32_106("00 00 00 F0 00 00 00 FC 00 00 00 FE 00 00 00 FE 00 00 00 7F 00 00 00 1F 00 00 00 1F 00 00 00 0F 00 00 00 1F 00 3C 00 1F 00 3C 00 7F 18 3F FF FE 3C 3F FF FE 3C 3F FF FC 18 3F FF F0 00 00 00 00", 106) /* j */,
    FF15x32_107("FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 00 7F 80 00 00 FF C0 00 01 FF E0 00 03 FF F0 00 07 F3 F8 00 0F E1 FC 00 1F C0 FE 00 3F 80 7F 00 3F 00 3F 00 3E 00 1F 00 3C 00 0F 00 00 00 00", 107) /* k */,
    FF15x32_108("00 00 00 00 00 00 00 00 00 00 00 0F F0 00 00 0F F0 00 00 0F FF FF FF FF FF FF FF FF FF FF FF FF 7F FF FF FF 00 00 00 0F 00 00 00 0F 00 00 00 0F 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 108) /* l */,
    FF15x32_109("00 3F FF FF 00 3F FF FF 00 3F FF FF 00 3F FF FF 00 1F 00 00 00 3E 00 00 00 1F F8 00 00 0F FC 00 00 1F F8 00 00 3E 00 00 00 1F 00 00 00 3F FF FF 00 1F FF FF 00 1F FF FF 00 07 FF FF 00 00 00 00", 109) /* m */,
    FF15x32_110("00 3F FF FF 00 3F FF FF 00 3F FF FF 00 3F FF FF 00 03 F8 00 00 0F E0 00 00 1F 80 00 00 1E 00 00 00 3F 00 00 00 3F 00 00 00 3F C0 00 00 1F FF FF 00 1F FF FF 00 0F FF FF 00 03 FF FF 00 00 00 00", 110) /* n */,
    FF15x32_111("00 0F FF F0 00 3F FF FC 00 7F FF FE 00 7F FF FE 00 FE 00 7F 00 F8 00 1F 00 F8 00 1F 00 F0 00 0F 00 F8 00 1F 00 F8 00 1F 00 FE 00 7F 00 7F FF FE 00 7F FF FE 00 3F FF FC 00 0F FF F0 00 00 00 00", 111) /* o */,
    FF15x32_112("00 FF FF FF 00 FF FF FF 00 FF FF FF 00 FF FF FF 00 0F F0 00 00 3F F8 00 00 7F FC 00 00 78 7C 00 00 F0 3C 00 00 F0 3C 00 00 F8 7C 00 00 7F F8 00 00 7F F8 00 00 3F F0 00 00 0F C0 00 00 00 00 00", 112) /* p */,
    FF15x32_113("00 0F C0 00 00 3F F0 00 00 7F F8 00 00 7F F8 00 00 F8 7C 00 00 F0 3C 00 00 F0 3C 00 00 78 7C 00 00 7F FC 00 00 3F F8 00 00 0F F0 00 00 FF FF FF 00 FF FF FF 00 FF FF FF 00 FF FF FF 00 00 00 00", 113) /* q */,
    FF15x32_114("00 FF FF FF 00 FF FF FF 00 FF FF FF 00 FF FF FF 00 0F 80 00 00 3E 00 00 00 7C 00 00 00 78 00 00 00 F0 00 00 00 F0 00 00 00 F8 00 00 00 7E 00 00 00 7E 00 00 00 3E 00 00 00 0E 00 00 00 00 00 00", 114) /* r */,
    FF15x32_115("00 0F C0 00 00 3F F0 00 00 7F F8 0F 00 7F F8 0F 00 F8 7C 0F 00 F8 7C 0F 00 F0 3C 0F 00 F0 3C 0F 00 F0 3C 0F 00 F0 3E 1F 00 F0 3E 1F 00 F0 1F FE 00 F0 1F FE 00 00 0F FC 00 00 03 F0 00 00 00 00", 115) /* s */,
    FF15x32_116("00 3C 00 00 00 3C 00 00 FF FF FF F0 FF FF FF FC FF FF FF FE FF FF FF FE 00 3C 00 7F 00 3C 00 1F 00 00 00 1F 00 00 00 0F 00 00 00 1F 00 00 00 3E 00 00 00 3E 00 00 00 3C 00 00 00 30 00 00 00 00", 116) /* t */,
    FF15x32_117("00 FF FF F0 00 FF FF FC 00 FF FF FE 00 FF FF FE 00 00 00 7F 00 00 00 1F 00 00 00 0F 00 00 00 1F 00 00 00 3F 00 00 00 7E 00 00 00 FC 00 FF FF FF 00 FF FF FF 00 FF FF FF 00 FF FF FF 00 00 00 00", 117) /* u */,
    FF15x32_118("00 FF FE 00 00 FF FF 80 00 FF FF E0 00 FF FF F0 00 00 03 F8 00 00 00 FC 00 00 00 3E 00 00 00 1F 00 00 00 3E 00 00 00 FC 00 00 03 F8 00 FF FF F0 00 FF FF E0 00 FF FF 80 00 FF FE 00 00 00 00 00", 118) /* v */,
    FF15x32_119("00 FF FF F0 00 FF FF FC 00 FF FF FE 00 FF FF FE 00 00 00 3F 00 00 00 3F 00 00 1F FE 00 00 1F F8 00 00 1F FE 00 00 00 3F 00 00 00 3F 00 FF FF FE 00 FF FF FE 00 FF FF FC 00 FF FF F0 00 00 00 00", 119) /* w */,
    FF15x32_120("00 FF 00 FF 00 7F 81 FE 00 3F C3 FC 00 1F E7 F8 00 0F FF F0 00 07 FF E0 00 03 FF C0 00 01 FF 80 00 03 FF C0 00 07 FF E0 00 0F FF F0 00 1F E7 F8 00 3F C3 FC 00 7F 81 FE 00 FF 00 FF 00 00 00 00", 120) /* x */,
    FF15x32_121("00 FF C0 00 00 FF F0 00 00 FF F8 0F 00 FF F8 0F 00 01 FC 0F 00 00 7C 0F 00 00 7C 0F 00 00 3C 0F 00 00 3C 0F 00 00 3E 1F 00 00 3E 1F 00 FF FF FE 00 FF FF FE 00 FF FF FC 00 FF FF F0 00 00 00 00", 121) /* y */,
    FF15x32_122("00 F0 00 7F 00 F0 00 FF 00 F0 01 FF 00 F0 03 FF 00 F0 07 CF 00 F0 0F 8F 00 F0 1F 0F 00 F0 3E 0F 00 F0 7C 0F 00 F0 F8 0F 00 F3 F0 0F 00 FF E0 0F 00 FF C0 0F 00 FF 80 0F 00 FE 00 0F 00 00 00 00", 122) /* z */,
    FF15x32_123("00 00 00 00 00 00 00 00 00 03 C0 00 00 07 E0 00 00 1F F8 00 03 FF FF 80 0F F8 1F E0 3F E0 07 FC 7C 00 00 3E F8 00 00 1F F0 00 00 0F 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 123) /* { */,
    FF15x32_125("00 00 00 00 00 00 00 00 00 00 00 00 F0 00 00 0F F8 00 00 1F 7C 00 00 3E 3F E0 07 FC 0F F8 1F E0 03 FF FF 80 00 1F F8 00 00 07 E0 00 00 03 C0 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 125) /* } */,
    FF15x32_161("00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 78 00 00 00 FC 03 FF FF FC 3F FF FF FC 3F FF FF FC 03 FF FF 78 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 161) /* &iexcl; */,
    FF15x32_186("00 00 00 00 00 00 00 00 07 00 00 00 1F C0 00 00 1F C0 00 00 38 E0 00 00 38 E0 00 00 38 E0 00 00 1F C0 00 00 1F C0 00 00 07 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00", 186) /* &ordm; */,
    FF15x32_191("00 00 03 F0 00 00 0F FC 00 00 1F FE 00 00 3F FE 00 01 FE 7F F0 FF F8 1F F0 FF E0 1F F0 FF C0 0F F0 FF 00 1F 00 00 00 1F 00 00 00 7F 00 00 00 FE 00 00 00 FE 00 00 00 FC 00 00 00 F0 00 00 00 00", 191) /* &iquest; */,
    FF15x32_209("00 FF FF FF 00 FF FF FF F0 FF FF FF F0 FF FF FF F0 7F 00 00 F0 3F 80 00 F0 1F C0 00 F0 0F E0 00 F0 07 F0 00 F0 03 F8 00 F0 01 FC 00 F0 FF FF FF F0 FF FF FF 00 FF FF FF 00 FF FF FF 00 00 00 00", 209) /* &Ntilde; */,
    FF15x32_241("00 3F FF FF 00 3F FF FF 00 3F FF FF 3C 3F FF FF 3C 03 F8 00 3C 0F E0 00 3C 1F 80 00 3C 1E 00 00 3C 3F 00 00 3C 3F 00 00 3C 3F C0 00 3C 1F FF FF 00 1F FF FF 00 0F FF FF 00 03 FF FF 00 00 00 00", 241) /* &ntilde; */;

    private final String hexLetter;
    private final int intLetter;

    FontFormat15x32(String hexLetter, int intLetter) {
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
        return 4;
    }

    @Override
    public int width() {
        return 15;
    }

    @Override
    public int height() {
        return 32;
    }
}
