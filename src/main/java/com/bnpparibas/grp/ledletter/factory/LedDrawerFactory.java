package com.bnpparibas.grp.ledletter.factory;

import com.bnpparibas.grp.ledletter.drawer.ILedDrawer;
import com.bnpparibas.grp.ledletter.drawer.OvalLedDrawer;
import com.bnpparibas.grp.ledletter.drawer.SquareLedDrawer;

/**
 * Created by Baptiste on 18/01/2016.
 */
public class LedDrawerFactory {
   public static ILedDrawer getDefaultDrawer() {
      return getSquareLedDrawer();
   }

   public static ILedDrawer getOvalLedDrawer() {
      return new OvalLedDrawer(false);
   }

   public static ILedDrawer getOutlinedOvalLedDrawer() {
      return new OvalLedDrawer(true);
   }

   public static ILedDrawer getSquareLedDrawer() {
      return new SquareLedDrawer(false);
   }

   public static ILedDrawer getOutlinedSquareLedDrawer() {
      return new SquareLedDrawer(true);
   }

}
