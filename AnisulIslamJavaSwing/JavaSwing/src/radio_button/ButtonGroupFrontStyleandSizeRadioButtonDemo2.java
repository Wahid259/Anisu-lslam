
package radio_button;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ButtonGroupFrontStyleandSizeRadioButtonDemo2 extends JFrame{
    private Container c;
    private JRadioButton male, female;
    private ButtonGroup grp;
    private Font f;
    
    
    ButtonGroupFrontStyleandSizeRadioButtonDemo2()
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
        
        f = new Font("Arial",Font.BOLD,18);
        
        grp = new ButtonGroup();
        
        male = new JRadioButton("Male");
        male.setBounds(50,50,100,50);
        male.setFont(f);
        male.setBackground(Color.orange);
        male.setSelected(true);
        //Mail ta selected thakbe.
        c.add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(160,50,100,50);
        female.setFont(f);
        female.setBackground(Color.orange);
        c.add(female);
        
        grp.add(male);
        grp.add(female);
    }
    
    public static void main(String[] args) {
        
        ButtonGroupFrontStyleandSizeRadioButtonDemo2 frame = new ButtonGroupFrontStyleandSizeRadioButtonDemo2();
        frame.setVisible(true);
    }
}
