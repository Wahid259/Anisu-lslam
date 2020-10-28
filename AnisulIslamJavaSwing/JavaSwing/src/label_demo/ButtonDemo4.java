
package label_demo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonDemo4 extends JFrame{
    private Container c;
    private JButton btn1, btn2;
    private Font f;
    private Cursor cursor;

    ButtonDemo4() {
        initComponents();
    }

    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f = new Font("Arial", Font.BOLD, 18);
        cursor = new Cursor(Cursor.HAND_CURSOR);

        btn1 = new JButton("Submit");
        btn1.setFont(f);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.MAGENTA);
        btn1.setBackground(Color.GREEN);
        btn1.setBounds(100, 50, 100, 50);
        c.add(btn1);

        btn2 = new JButton("Clear");
        btn2.setFont(f);
        btn2.setCursor(cursor);
        btn2.setForeground(Color.MAGENTA);
        btn2.setBackground(Color.GREEN);
        btn2.setBounds(210, 50, 100, 50);
        c.add(btn2);
    }

    public static void main(String[] args) {

        ButtonDemo4 frame = new ButtonDemo4();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("Button Demo");
    }
}
