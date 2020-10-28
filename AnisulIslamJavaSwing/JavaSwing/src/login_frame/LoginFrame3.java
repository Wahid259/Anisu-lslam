
package login_frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class LoginFrame3 extends JFrame{
    
    private Container c;
    private JLabel label;
    
    LoginFrame3()
    {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        /*
        Dispose on close kore amra nootun frame close kore
        delao puraton frame ta thekay jabe.
        */
        this.setBounds(400,50,400,400);
        this.setTitle("New Frame");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        label = new JLabel("Hello everyone welcome to the new frame");
        label.setBounds(50, 50, 250, 50);
        c.add(label);
        
        
    }
    
    public static void main(String[] args) {
        
        LoginFrame3 frame = new LoginFrame3();
        frame.setVisible(true);
    }
}
