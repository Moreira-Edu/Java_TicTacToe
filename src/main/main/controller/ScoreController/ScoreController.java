package controller.ScoreController;

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


    public void checkWinner(JButton[] buttons) {

        test(buttons, winner, rows);

        test(buttons, winner, cols);

        test(buttons, winner, diagonals);
    }

    private void test(JButton[] buttons, AtomicReference<Character> winner, int[][] steps) {
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
                if (x.get() == 3){
                    winner.set('X');
                    this.setxScore(this.getxScore()+1);
                }
                if (o.get() == 3){
                    winner.set('O');
                    this.setoScore(this.getoScore()+1);
                }

            });
        }
    }
}
