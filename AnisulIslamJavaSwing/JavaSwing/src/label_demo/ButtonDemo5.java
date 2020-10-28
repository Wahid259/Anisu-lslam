
package label_demo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonDemo5 extends JFrame{
    private Container c;
    private JButton btn1, btn2;
    private Font f;
    private Cursor cursor;
    private ImageIcon img1, img2;

    ButtonDemo5() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f = new Font("Arial", Font.BOLD, 18);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        img1 = new ImageIcon(getClass().getResource("login.jpg"));
        img2 = new ImageIcon(getClass().getResource("clear.jpg"));

        btn1 = new JButton(img1);
        btn1.setFont(f);
        btn1.setCursor(cursor);
        btn1.setBounds(100, 50, 100, 50);
        c.add(btn1);

        btn2 = new JButton(img2);
        btn2.setFont(f);
        btn2.setCursor(cursor);
        btn2.setBounds(210, 50, 100, 50);
        c.add(btn2);
    }

    public static void main(String[] args) {

        ButtonDemo5 frame = new ButtonDemo5();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Button Demo");
    }
}
