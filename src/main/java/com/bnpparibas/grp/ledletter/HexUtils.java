package com.bnpparibas.grp.ledletter;

public class HexUtils {
    public static int hex2Decimal(String s) {
        int decimal = Integer.parseInt(s, 16);
        return decimal;
    }

    public static String String2Binary(String s) {
        return Integer.toBinaryString(hex2Decimal(s));
    }

    public static String hex2bin(String s) {
        String s1 = String2Binary(s);
        String ss1 = ("00000000".substring(0, 8 - s1.length())).concat(s1);
        return ss1;
    }
}
