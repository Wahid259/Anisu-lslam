
package label_demo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TextFieldDemo2 extends JFrame{
    private Container c;
    private JTextField tf1, tf2;
    private Font f;
    
    
    TextFieldDemo2()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        f = new Font("Arial", Font.ITALIC + Font.BOLD, 18);
        
        tf1 = new JTextField();
        tf1.setBounds(50,50,200,50);
        tf1.setFont(f);
        c.add(tf1);
        
        tf2 = new JTextField();
        tf2.setText("wahid");
        tf2.setFont(f);
        tf2.setBounds(50,110,200,50);
        c.add(tf2);
        
    }
    
    public static void main(String[] args) {
        
        TextFieldDemo2 frame = new TextFieldDemo2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,50,500,400);
        frame.setTitle("JTextField Demo");
        
    }
    
}
