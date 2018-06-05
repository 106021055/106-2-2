import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class dragon extends JFrame {
    public JLabel jlb = new JLabel();
    public JLabel jlb2 = new JLabel();
    public ImageIcon imgdragonleft = new ImageIcon("right.png");
    public ImageIcon imgdragonright = new ImageIcon("left.png");
    public ImageIcon imgfire = new ImageIcon("fire.png");
    public Timer t1 ;
    Container cp;

    public dragon(){
        this.ha();
    }
    public void ha(){
        this.setBounds(1,1,1000,1000);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp = this.getContentPane();
        cp.setLayout(null);

        jlb.setBounds(500,700,200,200);

        Image img = imgdragonleft.getImage();
        Image img2 = img.getScaledInstance(200,200,Image.SCALE_SMOOTH);
        imgdragonleft.setImage(img2);
        jlb.setIcon(imgdragonleft);

        Image img3 = imgdragonright.getImage();
        Image img4 = img3.getScaledInstance(200,200,Image.SCALE_SMOOTH);
        imgdragonright.setImage(img4);
        jlb.setIcon(imgdragonright);

        img = imgfire.getImage();
        img2 = img.getScaledInstance(100,120,Image.SCALE_SMOOTH);
        imgfire.setImage(img2);
        jlb2.setIcon(imgfire);

        cp.add(jlb);

        t1 = new Timer(50, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                jlb2.setLocation(jlb2.getX(),jlb2.getY()-5);
                if (jlb2.getY() < 100){
                    t1.stop();
                }
            }
        });

        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()){
                    case 32:
                        jlb2.setBounds(jlb.getX()+50,jlb.getY(),100,120);
                        cp.add(jlb2);
                        t1.start();
                        break;
                    case 37:
                        jlb.setIcon(imgdragonright);
                        jlb.setLocation(jlb.getX()-100,jlb.getY());
                        break;
                    case 39:
                        jlb.setIcon(imgdragonleft);
                        jlb.setLocation(jlb.getX()+100,jlb.getY());
                        break;
                }
            }
        });
    }
}
