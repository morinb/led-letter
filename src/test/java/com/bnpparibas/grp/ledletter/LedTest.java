package com.bnpparibas.grp.ledletter;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.WindowConstants;

import java.awt.event.ActionEvent;

import static org.junit.Assert.*;

/**
 * @author morinb.
 */
public class LedTest {

    public static void main(String[] args) {
        JFrame f = new JFrame("LedTest");

        final Led led = LedFactory.get(LedFactory.Type.SQUARE).getLed();
        
        f.add(led);

        final Timer timer = new Timer(2000, new AbstractAction("Led blink") {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        led.setOn(!led.isOn());
                    }
                });
            }
        });
        timer.start();
        
        
        f.setSize(200, 200);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }

}