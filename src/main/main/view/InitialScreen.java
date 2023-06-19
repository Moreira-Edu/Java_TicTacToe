package view;

import javax.swing.*;
import java.awt.*;

public class InitialScreen extends JFrame {
    private JPanel InitialScreen;
    private JLabel icon;
    private JButton startButton;
    JLabel title;

    public InitialScreen(){

    setTitle("Program Name");
    setContentPane(InitialScreen);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(100, 100, (int) dim.getWidth(), (int) dim.getHeight());
        setLocationRelativeTo(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
