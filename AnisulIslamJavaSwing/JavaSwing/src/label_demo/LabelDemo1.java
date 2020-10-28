
package label_demo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo1 extends JFrame{
    
    private Container c;
    private JLabel userLabel;
    
    LabelDemo1()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        userLabel = new JLabel();
        userLabel.setText("Enter your username : ");
        userLabel.setBounds(50, 20, 150, 50);
        c.add(userLabel);
        
    }
    
    public static void main(String[] args) {
        
        LabelDemo1 frame = new LabelDemo1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        
        frame.setTitle("Label demo");
        
        
    }
    
}
