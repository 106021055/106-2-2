package NEWTwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Calculator extends JFrame {
    public JButton bn1 = new JButton("7");
    public JButton bn2 = new JButton("8");
    public JButton bn3 = new JButton("9");
    public JButton bn4 = new JButton("/");
    public JButton bn5 = new JButton("4");
    public JButton bn6 = new JButton("5");
    public JButton bn7 = new JButton("6");
    public JButton bn8 = new JButton("*");
    public JButton bn9 = new JButton("1");
    public JButton bn10 = new JButton("2");
    public JButton bn11 = new JButton("3");
    public JButton bn12 = new JButton("-");
    public JButton bn13 = new JButton("0");
    public JButton bn14 = new JButton(".");
    public JButton bn15 = new JButton("=");
    public JButton bn16 = new JButton("+");

    public Container cp;
    public JPanel jpnC = new JPanel(new GridLayout(4, 4, 3, 3));
    public JLabel label = new JLabel(" ");


    public Calculator(){
        ha();
    }
    public void ha(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(10,10,400,600);

        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(4, 3));
        cp.setLayout(new BorderLayout(4,1));
        cp.add(jpnC, BorderLayout.CENTER);

        label.setHorizontalAlignment(SwingConstants.RIGHT); //靠右

        label.setFont(new Font(null,Font.BOLD,80));
        bn1.setFont(new Font(null,Font.BOLD,50));
        bn2.setFont(new Font(null,Font.BOLD,50));
        bn3.setFont(new Font(null,Font.BOLD,50));
        bn4.setFont(new Font(null,Font.BOLD,50));
        bn5.setFont(new Font(null,Font.BOLD,50));
        bn6.setFont(new Font(null,Font.BOLD,50));
        bn7.setFont(new Font(null,Font.BOLD,50));
        bn8.setFont(new Font(null,Font.BOLD,50));
        bn9.setFont(new Font(null,Font.BOLD,50));
        bn10.setFont(new Font(null,Font.BOLD,50));
        bn11.setFont(new Font(null,Font.BOLD,50));
        bn12.setFont(new Font(null,Font.BOLD,50));
        bn13.setFont(new Font(null,Font.BOLD,50));
        bn14.setFont(new Font(null,Font.BOLD,50));
        bn15.setFont(new Font(null,Font.BOLD,50));
        bn16.setFont(new Font(null,Font.BOLD,50));

        jpnC.add(bn1); jpnC.add(bn2); jpnC.add(bn3); jpnC.add(bn4); jpnC.add(bn5); jpnC.add(bn6);
        jpnC.add(bn7);jpnC.add(bn8);jpnC.add(bn9);jpnC.add(bn10);jpnC.add(bn11);jpnC.add(bn12);
        jpnC.add(bn13); jpnC.add(bn14); jpnC.add(bn15); jpnC.add(bn16);
        cp.add(label, BorderLayout.NORTH); //***

        bn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + Integer.toString(7));
            }
        });
        bn2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + Integer.toString(8));
            }
        });
        bn3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + Integer.toString(9));
            }
        });
        bn4.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "/");
            }
        });
        bn5.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + Integer.toString(4));
            }
        });
        bn6.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + Integer.toString(5));
            }
        });
        bn7.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + Integer.toString(6));
            }
        });
        bn8.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "*");
            }
        });
        bn9.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + Integer.toString(1));
            }
        });
        bn10.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + Integer.toString(2));
            }
        });
        bn11.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + Integer.toString(3));
            }
        });
        bn12.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "-");
            }
        });
        bn13.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + Integer.toString(0));
            }
        });
        bn14.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + ".");
            }
        });
        bn15.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "=");
            }
        });
        bn16.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(label.getText() + "+");
            }
        });

    }
}
