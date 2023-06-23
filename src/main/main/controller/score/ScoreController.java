package controller.score;

import model.ScoreModel;

import javax.swing.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class ScoreController extends ScoreModel {
    private int[][] rows = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
    private int[][] cols = {{0, 3, 6}, {1, 4, 7}, {2, 5, 8}};
    private int[][] diagonals = {{0, 4, 8}, {2, 4, 6}};
    private AtomicReference<Character> winner = new AtomicReference<>((char) 0);
    int round = 0;


    public char checkWinner(JButton[] buttons) {
        round++;
        getWiner(buttons, winner, rows);

        getWiner(buttons, winner, cols);

        getWiner(buttons, winner, diagonals);


        if (winner.get() == 'X') JOptionPane.showMessageDialog(null, "X ganhou!");
        if (winner.get() == 'O') JOptionPane.showMessageDialog(null, "O ganhou!");
        if (round == 9 && winner.get() != 'X' && winner.get() != 'O')
            winner.set('E');

        return winner.get();
    }

    private void getWiner(JButton[] buttons, AtomicReference<Character> winner, int[][] steps) {

        if (winner.get() != 'X' && winner.get() != 'O') {
            Arrays.stream(steps).forEach(step -> {
                AtomicInteger x = new AtomicInteger();
                AtomicInteger o = new AtomicInteger();

                Arrays.stream(step).forEach(index -> {
                    if (buttons[index].getText().equals("X")) {
                        x.getAndIncrement();
                    } else if (buttons[index].getText().equals("O")) {
                        o.getAndIncrement();
                    }
                });
                if (x.get() == 3) {
                    winner.set('X');
                    this.setxScore(this.getxScore() + 1);
                }
                if (o.get() == 3) {
                    winner.set('O');
                    this.setoScore(this.getoScore() + 1);
                }

            });
        }
    }

    public void resetRound() {
        System.out.println(winner + " + " + round);
        winner = new AtomicReference<>((char) 0);
        round = 0;

        System.out.println(winner + " + " + round);
    }
}
