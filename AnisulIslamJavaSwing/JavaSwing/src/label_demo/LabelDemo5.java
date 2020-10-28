
package label_demo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo5 extends JFrame{
    private Container c;
    private JLabel userLabel, passLabel;
    private Font f;
    
    LabelDemo5()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        f = new Font("Arial", Font.BOLD, 14);// font create
        
        userLabel = new JLabel();
        userLabel.setText("Enter your username : ");
        userLabel.setBounds(50, 20, 200, 50);
        userLabel.setFont(f);
        userLabel.setForeground(Color.RED);
        userLabel.setOpaque(true);
        userLabel.setBackground(Color.yellow);
        userLabel.setToolTipText("this is a tooltip text");
        c.add(userLabel);
        
        //System.out.println(" "+userLabel.getText());
        String s = userLabel.getToolTipText();
        //System.out.println(" "+s);
        //passLabel = new JLabel(s);
        
        
        passLabel = new JLabel("Enter your password : ");
        passLabel.setBounds(50, 70, 200, 50);
        passLabel.setFont(f);
        c.add(passLabel);
        
    }
    
    public static void main(String[] args) {
        
        LabelDemo5 frame = new LabelDemo5();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        
        frame.setTitle("Label demo");
        
        
    }
    
}
