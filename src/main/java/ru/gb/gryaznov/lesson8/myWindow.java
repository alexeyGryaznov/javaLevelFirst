package ru.gb.gryaznov.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myWindow extends JFrame {
    public myWindow(){
        setTitle("тестовое окно");
        setBounds(200,200,400,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JButton button1= new JButton("кнопка 1");
        JButton button2= new JButton("кнопка 2");
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        JButton buttonAct = new JButton("Надави");
        add(buttonAct,BorderLayout.CENTER);
        buttonAct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonAct.setText("Готово");
            }
        });

        setVisible(true);
    }

}
