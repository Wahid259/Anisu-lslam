
package layout_manager;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutDemo3 extends JFrame implements ActionListener{
    
    private Container c;
    private CardLayout cl;
    private JButton btn1, btn2, btn3;
    
    
    CardLayoutDemo3()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,300,300);
        this.setTitle("CardLayout demo");
        
        c = this.getContentPane();
        cl = new CardLayout(10,10);
        c.setLayout(cl);
        
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        
        
        c.add(btn1,"first");
        c.add(btn2,"second");
        c.add(btn3,"third");
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        cl.show(c, "third");
        //prothon a 1 thakbe tar pore sobsomoy Third thakbe
        
    }
    
    public static void main(String[] args) {
        
        CardLayoutDemo3 frame = new CardLayoutDemo3();
        frame.setVisible(true);
        
    }
}
