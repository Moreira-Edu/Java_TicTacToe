package controller.ticTacToe;

import controller.button.ButtonController;
import controller.score.ScoreController;
import view.Button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class TicTacToeController extends JFrame {
    ScoreController score = new ScoreController();
    ButtonController buttonController =  new ButtonController();



    public TicTacToeController(){

    }
    public void start(JButton[] buttons) {
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(250, 100, 700, 500);
        Arrays.stream(buttons).forEach(button -> {
            setAction(button, buttons);
            add(button);
        });
        setVisible(true);

    }


    private void setAction(JButton button, JButton[] buttons){
        button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
             buttonController.setTextAction(button);
             score.checkWinner(buttons);

            }
        });
    }




}
