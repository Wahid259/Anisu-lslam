
package label_demo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class PasswordFieldDemo2 extends JFrame{
    private Container c;
    private JPasswordField pf;
    private Font f;
    
    PasswordFieldDemo2()
    {
        initComponents();
    }
    
    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        f = new Font("Arial", Font.BOLD, 22);
        
        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setFont(f);
        pf.setBounds(50,20,150,50);
        c.add(pf);
        
    }
    public static void main(String[] args) {

        PasswordFieldDemo2 frame = new PasswordFieldDemo2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("JPasswordField Demo");

    }
}
