
package j_scroll_pane;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaDemo4 extends JFrame{
    private Container c;
    private JTextArea ta;
    private Font f;
    private JScrollPane scroll;
    
    TextAreaDemo4()
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
        //ta.setBounds(50,50,300,200);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setFont(f);
        //c.add(ta);
        
        
        scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);//jScrollPane er sathe TextArea ta add kore debo
        scroll.setBounds(50,50,300,200);
        c.add(scroll);
    }
    public static void main(String[] args) {
        TextAreaDemo4 frame = new TextAreaDemo4();
        frame.setVisible(true);
        frame.setBounds(100,50,500,400);
        frame.setTitle("TextArea Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
