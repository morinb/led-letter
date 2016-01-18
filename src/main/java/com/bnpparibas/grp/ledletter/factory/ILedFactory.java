package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.Led;

import java.awt.Color;

/**
 * @author morinb.
 */
public interface ILedFactory {
    Led getLed();

    Led getLed(int w, int h);

    Led getLed(int w, int h, Color f);

    Led getLed(int w, int h, Color f, Color b);
}
