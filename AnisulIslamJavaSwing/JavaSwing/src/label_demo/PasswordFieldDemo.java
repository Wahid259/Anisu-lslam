
package label_demo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class PasswordFieldDemo extends JFrame{
    
    private Container c;
    private JPasswordField pf;
    
    PasswordFieldDemo()
    {
        initComponents();
    }
    
    public void initComponents() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setBounds(50,20,150,50);
        c.add(pf);
        
    }
    public static void main(String[] args) {

        PasswordFieldDemo frame = new PasswordFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 50, 500, 400);
        frame.setTitle("ActionListener Demo");

    }
}
