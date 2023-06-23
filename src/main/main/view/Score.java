package view;

import javax.swing.*;

public class Score extends JFrame {

    public JLabel[] generateScore(){
        JLabel score = new JLabel("Placar");
        JLabel scoreX = new JLabel("X 0");
        JLabel scoreO = new JLabel("O 0");

        score.setBounds(425, 50, 100, 30);
        scoreX.setBounds(400, 75, 100, 30);
        scoreO.setBounds(450, 75, 100, 30);

        return new JLabel[]{score, scoreX, scoreO};
    }
}
