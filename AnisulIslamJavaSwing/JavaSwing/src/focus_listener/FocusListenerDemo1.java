
package focus_listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FocusListenerDemo1 extends JFrame{
    
    private Container c;
    private JButton btn;
    private JTextArea ta;
    
    FocusListenerDemo1()
    {
        initComponents();
    }
    
    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 400);
        this.setTitle("Mouse Motion Listener");
        
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);
        
        
        btn = new JButton("Button");
        btn.setBounds(10,50,80,50);
        c.add(btn);
        
        ta = new JTextArea();
        ta.setBounds(100,30,200,200);
        c.add(ta);
        
        btn.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent fe) {
                
                ta.setText("Focus Gain");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                
                ta.setText("Focus Lost");
            }
        
        });
        
    }
    
    public static void main(String[] args) {
        
        FocusListenerDemo1 frame = new FocusListenerDemo1();
        frame.setVisible(true);
    }
    
}
