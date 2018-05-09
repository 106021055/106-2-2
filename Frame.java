package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {
    public JButton big = new JButton("big");
    public JButton small = new JButton("small");
    public JButton EXIT = new JButton("EXIT");
    public JLabel label = new JLabel("哈");
    public int count = 22;


    public Frame(){
        ha();
    }
    public void ha(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(10,10,800,600);

        big.setBounds(10,10,140,40);
        small.setBounds(150,10,140,40);
        label.setBounds(150,80,500,400);
        EXIT.setBounds(290,10,140,40);
        label.setFont(new Font(null, Font.BOLD, count));

        this.add(big);
        this.add(small);
        this.add(label);
        this.add(EXIT);

        big.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count+=3;
                    label.setFont(new Font(null, Font.BOLD, count));
                }
        });
        small.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count-=3;
                label.setFont(new Font(null, Font.BOLD, count));
            }

        });
        EXIT.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
