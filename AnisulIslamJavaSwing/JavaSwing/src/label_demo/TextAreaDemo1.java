
package label_demo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextAreaDemo1 extends JFrame{
    
    private Container c;
    private JTextArea ta;
    
    TextAreaDemo1()
    {
        initComponents();
                
    }
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        ta = new JTextArea();
        ta.setBounds(50,50,300,200);
        c.add(ta);
    }
    public static void main(String[] args) {
        TextAreaDemo1 frame = new TextAreaDemo1();
        frame.setVisible(true);
        frame.setBounds(100,50,500,400);
        frame.setTitle("TextArea Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
