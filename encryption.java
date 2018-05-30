import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class encryption extends JFrame {
    public JLabel jlb = new JLabel("PassWord");
    public JButton jbtnEncryption = new JButton("Encryption");
    public JButton jbtnDecryption = new JButton("Decryption");
    public JButton jbtnExit = new JButton("Exit");
    public JTextField jtf = new JTextField();
    public JTextArea jta1 = new JTextArea();
    public JTextArea jta2 = new JTextArea();
    public JPanel jpnl = new JPanel();
    public Container cp;

    public encryption(){
        ha();
    }
    public void ha(){
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(10,10,900,800);
        jlb.setBounds(420,40,100,100);
        jtf.setBounds(400,100,100,100);
        jbtnEncryption.setBounds(400,300,100,40);
        jbtnDecryption.setBounds(400,450,100,40);
        jbtnExit.setBounds(400,600,100,40);
        jta1.setBounds(1,1,380,780);
        jta2.setBounds(515,1,380,780);
        cp = this.getContentPane();
        cp.add(jpnl, BorderLayout.WEST);
        cp.add(jpnl, BorderLayout.CENTER);

        this.add(jlb);
        this.add(jtf);
        this.add(jbtnEncryption);
        this.add(jbtnDecryption);
        this.add(jbtnExit);
        this.add(jta1);
        this.add(jta2);

        jbtnExit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jtf.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jbtnEncryption.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jbtnDecryption.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
