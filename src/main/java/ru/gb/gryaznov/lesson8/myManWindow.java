package ru.gb.gryaznov.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myManWindow extends JFrame {
    myManWindow() {
        setTitle("окно с ручной настройкой");
        setBounds(200, 700, 1600, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);
        JTextField field1=new JTextField();
        JTextField field2=new JTextField();
        field1.setBounds(20,20,500,30);
        field2.setBounds(520,20,500,30);
        JButton button1= new JButton("кнопка 1");
        button1.setBounds(20,20,500,30);
        JButton button2= new JButton("кнопка 2");
        button2.setBounds(520,20,500,30);
        add(button1);
        add(button2);
        JTextField fieldCons=new JTextField();
        fieldCons.setBounds(20,60, 1000,30);
        add(fieldCons);
        fieldCons.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(fieldCons.getText());
            }
        });
        setVisible(true);
    }

}
