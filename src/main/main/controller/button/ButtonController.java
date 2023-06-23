package controller.button;

import controller.score.ScoreController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class ButtonController {

    boolean xo = false;

    private void setText(JButton button) {
        if (xo) {
            button.setText("X");
            xo = false;
        } else {
            button.setText("O");
            xo = true;
        }
    }

    public void setTextAction(JButton button) {
        if(!button.getText().equals("O") && !button.getText().equals("X")){
            setText(button);
        }

    }


}
