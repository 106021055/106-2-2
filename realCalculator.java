package NEWTwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


class realCalculator extends JFrame{
    private JLabel label = new JLabel("0");
    private JPanel numpanel = new JPanel(new GridLayout(4, 5, 3, 3));
    private JButton buttons[] = new JButton[20];
    private double v1 = 0;
    private double v2 = 0;
    private int op = -1;


    realCalculator(){
        ha();
    }

    private void ha(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(600, 800);

        label.setFont(new Font(null, Font.BOLD, 50));
        label.setHorizontalAlignment(SwingConstants.RIGHT);//靠右


        add(numpanel, BorderLayout.CENTER);
        add(label, BorderLayout.NORTH);



        setButtons();
    }

    private void setButtons(){
        for (int i = 0; i < 20; i++){
            switch (i){
                case 0:
                    buttons[i] = new JButton("7");
                    numpanel.add(buttons[i]);
                    break;
                case 1:
                    buttons[i] = new JButton("8");
                    numpanel.add(buttons[i]);
                    break;
                case 2:
                    buttons[i] = new JButton("9");
                    numpanel.add(buttons[i]);
                    break;
                case 3:
                    buttons[i] = new JButton("/");
                    numpanel.add(buttons[i]);
                    break;
                case 4:
                    buttons[i] = new JButton("C");
                    numpanel.add(buttons[i]);
                    break;
                case 5:
                    buttons[i] = new JButton("4");
                    numpanel.add(buttons[i]);
                    break;
                case 6:
                    buttons[i] = new JButton("5");
                    numpanel.add(buttons[i]);
                    break;
                case 7:
                    buttons[i] = new JButton("6");
                    numpanel.add(buttons[i]);
                    break;
                case 8:
                    buttons[i] = new JButton("*");
                    numpanel.add(buttons[i]);
                    break;
                case 9:
                    buttons[i] = new JButton("sqrt");
                    numpanel.add(buttons[i]);
                    break;
                case 10:
                    buttons[i] = new JButton("1");
                    numpanel.add(buttons[i]);
                    break;
                case 11:
                    buttons[i] = new JButton("2");
                    numpanel.add(buttons[i]);
                    break;
                case 12:
                    buttons[i] = new JButton("3");
                    numpanel.add(buttons[i]);
                    break;
                case 13:
                    buttons[i] = new JButton("-");
                    numpanel.add(buttons[i]);
                    break;
                case 14:
                    buttons[i] = new JButton("PI");
                    numpanel.add(buttons[i]);
                    break;
                case 15:
                    buttons[i] = new JButton("0");
                    numpanel.add(buttons[i]);
                    break;
                case 16:
                    buttons[i] = new JButton(".");
                    numpanel.add(buttons[i]);
                    break;
                case 17:
                    buttons[i] = new JButton("=");
                    numpanel.add(buttons[i]);
                    break;
                case 18:
                    buttons[i] = new JButton("+");
                    numpanel.add(buttons[i]);
                    break;
                case 19:
                    buttons[i] = new JButton("Exit");
                    numpanel.add(buttons[i]);
                    break;
            }
        }
        for (int i = 0; i < 20; i ++){
            buttons[i].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tmp = (JButton)e.getSource();
                    switch (tmp.getText()){
                        case "C":
                            v1 = 0;
                            v2 = 0;
                            op = -1;
                            label.setText("0");
                            break;
                        case "sqrt":
                            label.setText(Double.toString(Math.sqrt(Double.parseDouble(label.getText()))));
                            break;
                        case "PI":
                            label.setText(Double.toString(Math.PI));
                            break;
                        case "Exit":
                            System.exit(0);
                            break;
                        case "+":
                            op = 0;
                            v1 = Double.parseDouble(label.getText());
                            break;
                        case "-":
                            op = 1;
                            v1 = Double.parseDouble(label.getText());
                            break;
                        case "*":
                            op = 2;
                            v1 = Double.parseDouble(label.getText());
                            break;
                        case "/":
                            op = 3;
                            v1 = Double.parseDouble(label.getText());
                            break;
                        case "=":
                            v2 = Double.parseDouble(label.getText());
                            double v3 = 0;
                            switch (op){
                                case 0:
                                    v3 = v1 + v2;
                                    break;
                                case 1:
                                    v3 = v1 - v2;
                                    break;
                                case 2:
                                    v3 = v1 * v2;
                                    break;
                                case 3:
                                    v3 = v1 / v2;
                            }
                            label.setText(Double.toString(v3));
                        case ".":
                            if (!label.getText().matches("-*\\d+\\.\\d*")){
                                label.setText(label.getText() + ".");
                            }
                            break;
                        default:
                            if (label.getText().equals("0") || op > -1 ){
                                label.setText(tmp.getText());
                            }else {
                                label.setText(label.getText() + tmp.getText());
                            }
                    }
                }
            });
        }
    }
}