package ru.gb.gryaznov.lesson8;

import javax.swing.*;
import java.awt.*;

public class myWindow4 extends JFrame {
    myWindow4() {
        setTitle("тестовое окно4");
        setBounds(1400, 200, 400, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,3));
        for (int i=0; i<9;i++){
            add(new JButton("кнопка "+i));
        }

        setVisible(true);

    }

}
