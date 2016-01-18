package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.drawer.DefaultLedDrawer;
import com.bnpparibas.grp.ledletter.drawer.ILedDrawer;

/**
 * Created by Baptiste on 18/01/2016.
 */
public class LedDrawerFactory {
    private static final ILedDrawer DEFAULT = new DefaultLedDrawer();
    public static ILedDrawer getDefaultDrawer() {
        return DEFAULT;
    }
}
