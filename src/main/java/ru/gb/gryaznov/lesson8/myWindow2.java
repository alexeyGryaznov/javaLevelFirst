package ru.gb.gryaznov.lesson8;

import javax.swing.*;
import java.awt.*;

public class myWindow2 extends JFrame {
    myWindow2(){
        setTitle("тестовое окно2");
        setBounds(600,200,400,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        for (int i=0; i<4;i++){
            add(new JButton("кнопка "+i));
        }
    setVisible(true);
    }

}
