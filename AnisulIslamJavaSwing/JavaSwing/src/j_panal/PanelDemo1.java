
package j_panal;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelDemo1 extends JFrame{
    
    private Container c;
    private JPanel panel1, panel2;
    private JButton btn1, btn2, btn3;
    private JLabel label;
    
    PanelDemo1()
    {
        initComponents();
    }
    
    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 670, 500);
        this.setTitle("Panel Demo");
        
        
        c = this.getContentPane();
        c.setLayout(null);
        
        label = new JLabel("Creating two JPanel ");
        label.setBounds(50,20,200,50);
        c.add(label);
        
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        
        panel1 = new JPanel();
        panel1.setBounds(100,100,250,300);
        panel1.setBackground(Color.red);
        c.add(panel1);
        
        panel2 = new JPanel();
        panel2.setBounds(355,100,250,300);
        panel2.setBackground(Color.GREEN);
        c.add(panel2);
        
        panel1.add(btn1);
        panel1.add(btn3);
        panel2.add(btn2);
        
    }
    
    public static void main(String[] args) {
        
        PanelDemo1 frame = new PanelDemo1();
        frame.setVisible(true);
    }
}
