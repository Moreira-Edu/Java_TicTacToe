package useCase;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class TicTacToeUseCase {
    boolean xo = false;
    boolean[] click = new boolean[9];

    private void changeText(JButton button){
        if(xo){
            button.setText("X");
            xo = false;
        } else{
            button.setText("O");
            xo = true;
        }
    }
    public void setAction(JButton[] button){
        Arrays.fill(click, false);

        for(int i = 0; i < button.length; i++){
            int finalI = i;
            button[i].addActionListener(new java.awt.event.ActionListener(){
                @Override
                public void actionPerformed(ActionEvent ae){
                    if(!click[finalI]){
                        final JButton jButton = button[finalI];
                        click[finalI] = true;
                        changeText(jButton);
                    }
                }
            });
        }

    }


}
