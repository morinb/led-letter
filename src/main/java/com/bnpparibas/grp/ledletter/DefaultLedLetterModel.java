package com.bnpparibas.grp.ledletter;

import com.bnpparibas.grp.ledletter.drawer.ILedDrawer;
import com.bnpparibas.grp.ledletter.factory.LedDrawerFactory;
import com.bnpparibas.grp.ledletter.fonts.LedLetterFont;

import javax.swing.event.EventListenerList;
import java.awt.Color;
import java.awt.Dimension;

/**
 * @author morinb.
 */
public class DefaultLedLetterModel implements LedLetterModel {
   private final LedLetterFont ledLetterFont;
   private final Dimension ledDimension;
   private boolean[][] currentValues;
   private boolean[][] oldValues;
   private EventListenerList listenerList = new EventListenerList();
   private Color letterColor;
   private Color letterBackgroundColor;
   private boolean blinking;
   private ILedDrawer ledDrawer;
   private Dimension gap;

   public DefaultLedLetterModel(LedLetterFont ledLetterFont, Dimension ledDimension) {
      this(ledLetterFont, ledDimension, new Dimension(2 * ledDimension.width, 0));
   }

   public DefaultLedLetterModel(LedLetterFont ledLetterFont, Dimension ledDimension, Dimension gap) {
      this(ledLetterFont, ledDimension, gap, Color.RED, Color.BLACK, false, LedDrawerFactory.getDefaultDrawer());
   }

   public DefaultLedLetterModel(LedLetterFont ledLetterFont, Dimension ledDimension, Dimension gap, Color letterColor, Color letterBackgroundColor, boolean blinking, ILedDrawer drawer) {
      this.ledLetterFont = ledLetterFont;
      this.ledDimension = ledDimension;
      this.gap = gap;
      this.letterColor = letterColor;
      this.letterBackgroundColor = letterBackgroundColor;
      this.blinking = blinking;
      this.ledDrawer = drawer;

      int rowCount = ledLetterFont.rowCount();
      int columnCount = ledLetterFont.columnCount();
      currentValues = new boolean[rowCount][columnCount];
      oldValues = new boolean[rowCount][columnCount];
      for (int r = 0; r < rowCount; r++) {
         for (int c = 0; c < columnCount; c++) {
            currentValues[r][c] = false;
            oldValues[r][c] = false;
         }
      }
   }


   @Override
   public int getRowCount() {
      return currentValues.length;
   }

   @Override
   public int getColumnCount() {
      return currentValues[0].length;
   }

   @Override
   public Dimension getLedDimension() {
      return ledDimension;
   }

   @Override
   public void addLedLetterModelListener(LedLetterModelListener l) {
      listenerList.add(LedLetterModelListener.class, l);
   }

   @Override
   public void removeLedLetterModelListener(LedLetterModelListener l) {
      listenerList.remove(LedLetterModelListener.class, l);
   }

   protected void fireValueChanged(int c) {
      for (LedLetterModelListener listener : listenerList.getListeners(LedLetterModelListener.class)) {
         listener.ledLetterChanged(new LedLetterModelEvent(c, this));
      }
   }

   @Override
   public LedLetterFont getLedLetterFont() {
      return ledLetterFont;
   }

   @Override
   public Dimension getGap() {
      return gap;
   }


   public boolean[][] getCurrentValues() {
      return currentValues;
   }

   public void setCurrentValues(boolean[][] currentValues) {
      this.currentValues = currentValues;
   }

   @Override
   public boolean[][] getValues(char c) {
      return ledLetterFont.getLetterDescription(c).getValues();
   }

   public EventListenerList getListenerList() {
      return listenerList;
   }

   public void setListenerList(EventListenerList listenerList) {
      this.listenerList = listenerList;
   }

   @Override
   public Color getLetterColor() {
      return letterColor;
   }

   public void setLetterColor(Color letterColor) {
      this.letterColor = letterColor;
   }

   @Override
   public Color getLetterBackgroundColor() {
      return letterBackgroundColor;
   }

   public void setLetterBackgroundColor(Color letterBackgroundColor) {
      this.letterBackgroundColor = letterBackgroundColor;
   }

   @Override
   public boolean isBlinking() {
      return blinking;
   }

   public void setBlinking(boolean blinking) {
      this.blinking = blinking;
   }

   @Override
   public ILedDrawer getLedDrawer() {
      return ledDrawer;
   }

   public void setLedDrawer(ILedDrawer ledDrawer) {
      this.ledDrawer = ledDrawer;
   }

}
