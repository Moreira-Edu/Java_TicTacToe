package controller.ticTacToe;

import controller.button.ButtonController;
import controller.score.ScoreController;
import view.Button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class TicTacToeController extends JFrame {
    ScoreController score = new ScoreController();
    ButtonController buttonController = new ButtonController();
    private JButton[] buttons;
    private JLabel[] scoreLabel;
    private char winner;

    public TicTacToeController() {
    }

    public void setButtons(JButton[] buttons) {
        this.buttons = buttons;
    }

    public void setScoreLabel(JLabel[] scoreLabel) {
        this.scoreLabel = scoreLabel;
    }

    protected void start() {
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(250, 100, 700, 500);
        Arrays.stream(buttons).forEach(button -> {
            setAction(button);
            add(button);
        });
        Arrays.stream(scoreLabel).forEach(this::add);
        setVisible(true);
    }


    private void setAction(JButton button) {
        button.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (!button.getText().equals("O") && !button.getText().equals("X")) {
                    buttonController.setTextAction(button);
                    winner = score.checkWinner(buttons);
                    endGame();
                }
            }
        });
    }

    private void endGame() {

        if (winner == 'X' || winner == 'O' || winner == 'E') {
            if (winner == 'X') {
                scoreLabel[1].setText("X " + score.getxScore());
                JOptionPane.showMessageDialog(null, "X ganhou!");
            }
            if (winner == 'O') {
                scoreLabel[2].setText("O " + score.getoScore());
                JOptionPane.showMessageDialog(null, "O ganhou!");
            }
            if (winner == 'E') JOptionPane.showMessageDialog(null, "Empate!");

            score.resetRound();
            buttonController.clearText(buttons);
        }

    }


}
