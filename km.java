import javax.swing.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {
    public JTextField jtf = new JTextField();
    public JButton jbtn = new JButton("GO");
    public JButton jbtn1 = new JButton("Exit");
    public JLabel label = new JLabel();

    public Frame(){
        this.ha();
    }
    public void ha(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        this.setBounds(1,1,400,400);
        jtf.setBounds(10,10,100,100);
        jbtn.setBounds(110,10,100,100);
        jbtn1.setBounds(250,250,100,100);
        label.setBounds(250,50,100,100);

        this.add(jtf);
        this.add(jbtn);
        this.add(jbtn1);
        this.add(label);

        jbtn.addActionListener(new AbstractAction() {
            @Override
                public void actionPerformed (ActionEvent actionEvent) {
                int data[] = new int[5];
                try {
                    label.setText(Float.parseFloat(jtf.getText()) * 0.6214 + "英里");
                    data[6] = 5;
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(Frame.this, "87");
                }catch (IndexOutOfBoundsException e2){
                    JOptionPane.showMessageDialog(Frame.this, "successful");
                }
            }
        });
        jbtn1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}
