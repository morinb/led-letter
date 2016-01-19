package com.bnpparibas.grp.ledletter;

import com.google.common.collect.Lists;
import org.apache.commons.lang.StringUtils;

import javax.swing.AbstractAction;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.List;

/**
 * @author morinb.
 */
public class LedLetterControllerController {
    private List<LedLetterController> controllers;
    private Timer scrollTimer;
    private int speed = 100;
    private Color backgroundColor;
    private Color foregroundColor;

    public LedLetterControllerController() {
        controllers = Lists.newArrayList();
    }

    public void addController(LedLetterController controller) {
        if (!controller.isForegroundColorSet()) {
            controller.setForegroundColor(foregroundColor);
        }
        if (!controller.isBackgroundColorSet()) {
            controller.setBackgroundColor(backgroundColor);
        }
        controllers.add(controller);
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        if (scrollTimer != null) {
            scrollTimer.setDelay(speed);
        }
    }

    public void setForegroundColor(Color color) {
        this.foregroundColor = color;
        for (LedLetterController llc : controllers) {
            llc.setForegroundColor(color);
        }
    }

    public void setBackgroungColor(Color color) {
        this.backgroundColor = color;
        for (LedLetterController llc : controllers) {
            llc.setBackgroundColor(color);
        }
    }


    public void displayString(final String message) {
        final int messageLength = message.length();


        if (messageLength > controllers.size()) {
            // Make the text scroll from right to left.
            final String spaces = spaces(controllers.size());
            final String paddedMessage = spaces + message + spaces; // pad the text to make it scroll smoothly.
            final int[] index = {0};
            scrollTimer = new Timer(getSpeed(), new AbstractAction("Scroll") {
                @Override
                public void actionPerformed(ActionEvent e) {
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            // Get controllers.size() chars from message.
                            String displayedMessage = paddedMessage.substring(index[0], index[0] + controllers.size());
                            index[0] = (index[0] + 1) % (message.length() + spaces.length());
                            displayString(displayedMessage);
                        }
                    });
                }
            });
            scrollTimer.start();
        } else {
            // We have enough space, just display the message.
            int spaceLeft = controllers.size() - messageLength;
            int padding = spaceLeft / 2 - 1;
            final String centeredMessage = StringUtils.rightPad(StringUtils.leftPad(message, message.length() + padding), controllers.size());
            // Center the message by adding spaces to the left.

            for (int i = 0; i < controllers.size(); i++) {
                controllers.get(i).displayChar(centeredMessage.charAt(i));
            }
        }
    }

    private String spaces(int size) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(' ');
        }
        return sb.toString();
    }

    public List<LedLetterController> getControllers() {
        return controllers;
    }
}
