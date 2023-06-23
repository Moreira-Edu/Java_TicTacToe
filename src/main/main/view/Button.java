package view;

import javax.swing.*;
import java.awt.*;

public class Button {

    public JButton[] generateButton() {


        JButton[] button = new JButton[9];
        int count = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                button[count] = new JButton();
                button[count].setFont(new Font("Arial", Font.BOLD, 40));
                button[count].setBounds((100 * i) + 50, (100 * j) + 50, 95, 95);
                count++;
            }
        }

        return button;
    }
}
