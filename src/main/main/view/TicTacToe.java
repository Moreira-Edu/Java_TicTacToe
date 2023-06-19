package view;

import useCase.TicTacToeUseCase;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class TicTacToe extends JFrame {

    public TicTacToe(){
        setVisible(true);;
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(250,100,700,500);

        generateButton();
    }

    private void generateButton(){
        TicTacToeUseCase ticTacToeuseCase = new TicTacToeUseCase();

        JButton[] button = new JButton[9];
        int count = 0;

        for(int i=0; i <3; i++){
            for(int j=0;j<3; j++){
                button[count] = new JButton();
                add(button[count]);
                button[count].setBounds((100*i) +50,(100*j)+50,95,95);
                count++;
            }
        }
        ticTacToeuseCase.setAction(button);
    }
}
