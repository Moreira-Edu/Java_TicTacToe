package view;


import javax.swing.*;
import java.util.Arrays;


public class TicTacToe extends JFrame {

    Buttons buttons = new Buttons();
    public TicTacToe(){
        setDefaultCloseOperation(3);
        setLayout(null);
        setBounds(250,100,700,500);
        Arrays.stream(buttons.generateButton()).forEach(this::add);
        setVisible(true);
    }
}
