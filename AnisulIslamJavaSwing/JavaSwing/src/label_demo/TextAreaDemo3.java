
package label_demo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaDemo3 extends JFrame{
    private Container c;
    private JTextArea ta;
    private Font f;
    
    TextAreaDemo3()
    {
        initComponents();
                
    }
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        f = new Font("Arial", Font.BOLD, 18);
        
        ta = new JTextArea();
        ta.setBounds(50,50,300,200);
        ta.setForeground(Color.yellow);
        ta.setBackground(Color.PINK);
        ta.setFont(f);
        c.add(ta);
    }
    public static void main(String[] args) {
        TextAreaDemo3 frame = new TextAreaDemo3();
        frame.setVisible(true);
        frame.setBounds(100,50,500,400);
        frame.setTitle("TextArea Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
