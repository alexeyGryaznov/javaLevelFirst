package ru.gb.gryaznov.lesson8;

import javax.swing.*;
import java.awt.*;

public class myWindow3 extends JFrame {
    myWindow3() {
        setTitle("тестовое окно3");
        setBounds(1000, 200, 400, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        for (int i=0; i<9;i++){
            add(new JButton("кнопка "+i));
        }

        setVisible(true);

    }
}
