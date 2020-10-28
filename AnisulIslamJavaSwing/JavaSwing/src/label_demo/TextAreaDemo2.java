
package label_demo;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaDemo2 extends JFrame{
    private Container c;
    private JTextArea ta;
    private Font f;
    
    TextAreaDemo2()
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
        ta.setFont(f);
        c.add(ta);
    }
    public static void main(String[] args) {
        TextAreaDemo2 frame = new TextAreaDemo2();
        frame.setVisible(true);
        frame.setBounds(100,50,500,400);
        frame.setTitle("TextArea Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
