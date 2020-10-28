
package radio_button;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonDemo1 extends JFrame{
    
    private Container c;
    private JRadioButton male, female;
    
    
    RadioButtonDemo1()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,50,400,400);
        this.setTitle("RadioButtonDemo");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.orange);
        
        male = new JRadioButton("Male");
        male.setBounds(50,50,100,50);
        male.setBackground(Color.orange);
        c.add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(160,50,100,50);
        female.setBackground(Color.orange);
        c.add(female);
    }
    
    public static void main(String[] args) {
        
        RadioButtonDemo1 frame = new RadioButtonDemo1();
        frame.setVisible(true);
    }
}
