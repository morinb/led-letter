package com.bnpparibas.grp.ledletter;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Baptiste on 18/01/2016.
 */
public class LedLetterPanel extends JPanel {

    LedLetterPanel(LedLetterControllerController ledLetterControllerController) {
        super(new FlowLayout(FlowLayout.CENTER, 0, 0));

        for (LedLetterController controller : ledLetterControllerController.getControllers()) {
            this.add(controller.getLedLetter());
        }


    }
}
