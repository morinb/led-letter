package com.bnpparibas.grp.ledletter;

import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;

/**
 * @author morinb.
 */
public class LedLetterControllerController {
    List<LedLetterController> controllers;
    
    public LedLetterControllerController() {
        controllers = Lists.newArrayList();
    }

    public void addController(LedLetterController controller) {
        controllers.add(controller);
    }
    
    public void displayString(String message) {
        final int messageLength = message.length();

        final int maxChar = Math.min(messageLength, controllers.size());
        for(int i = 0 ; i < maxChar ; i++) {
            controllers.get(i).displayChar(message.charAt(i));
        }
    }
}
