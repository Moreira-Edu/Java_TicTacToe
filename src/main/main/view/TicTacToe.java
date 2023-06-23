package view;


import controller.ticTacToe.TicTacToeController;

import javax.swing.*;
import java.util.Arrays;


public class TicTacToe extends TicTacToeController {
    Button buttons = new Button();


    public TicTacToe() {
        super();

        this.start(buttons.generateButton());
    }

}
