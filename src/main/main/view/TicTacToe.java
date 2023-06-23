package view;


import controller.ticTacToe.TicTacToeController;

import javax.swing.*;
import java.util.Arrays;


public class TicTacToe extends TicTacToeController {
    Button buttons = new Button();
    Score score = new Score();


    public TicTacToe() {
        super();
        this.setButtons(buttons.generateButton());
        this.setScoreLabel(score.generateScore());
        this.start();

    }

}
