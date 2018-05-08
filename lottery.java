package NEWTwo;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class lottery extends JFrame{
    public JButton Generate = new JButton("Generate");
    public JButton Exit = new JButton("Exit");
    public Container cp;
    public JLabel label[] = new JLabel[6];
    public JPanel jpnC = new JPanel(new GridLayout(1,6,3,3));
    public JPanel jpnS = new JPanel(new GridLayout(1,2,3,3));
    public Random random = new Random();

    public lottery(){
        hi();
    }
    public void hi(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(10,10,600,150);

        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(1,6));
        cp.add(jpnC, BorderLayout.CENTER);
        cp.add(jpnS, BorderLayout.SOUTH);

        for (int i = 0 ; i<6 ; i++){
            label[i] = new JLabel();
            label[i].setBackground(new Color(0,255,0));
            label[i].setFont(new Font(null,Font.BOLD,50));
            label[i].setHorizontalAlignment(SwingConstants.CENTER); //置中
            label[i].setOpaque(true);
            jpnC.add(label[i]);
        }

        jpnS.add(Generate);
        jpnS.add(Exit);

        Exit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        Generate.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int abc[] = new int[6];
                int i = 0;
                boolean different;
                while (i < 6){
                    different = true;
                    abc[i] = random.nextInt(49) + 1;//如果沒有+1 那就是0~盒子數-1 +1了 就是1~盒子的數
                    for (int j = 0 ; j<i ; j++){
                        if (abc[i] == abc[j]){
                            different = false;
                        }
                    }
                    if (different){
                        i++;
                    }
                }
                for (int j = 0 ; j<6 ; j++){
                    label[j].setText(Integer.toString(abc[j]));//Integer.toString 數字轉字串
                }
            }
        });
    }

}
