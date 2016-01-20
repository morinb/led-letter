package com.bnpparibas.grp.ledletter;

/**
 * @author morinb.
 */
public enum ScrollWay {
    LEFT_TO_RIGHT(1),
    RIGHT_TO_LEFT(-1),;


    private final int way;

    ScrollWay(int way) {
        this.way = way;
    }

    public int getWay() {
        return way;
    }
}
