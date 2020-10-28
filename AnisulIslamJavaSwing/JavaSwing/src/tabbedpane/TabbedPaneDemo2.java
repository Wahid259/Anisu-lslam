
package tabbedpane;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPaneDemo2 extends JFrame{
    
    private Container c;
    private JTabbedPane tp;
    private JPanel panel1, panel2, panel3;
    private JLabel label1, label2, label3;
    private ImageIcon homeIcon, helpIcon, editIcon;
    
    TabbedPaneDemo2()
    {
        initComponents();
        
    }
    
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,450,450);
        this.setTitle("Tabbed Demo");
        
        c = this.getContentPane();
        c.setLayout(null);
        
        tp = new JTabbedPane();
        //tp.setTabPlacement(JTabbedPane.BOTTOM);
        tp.setBounds(50,50,300,300);
        c.add(tp);
        
        homeIcon = new ImageIcon("src/icon/2.jpg");
        helpIcon = new ImageIcon("src/icon/3.jpg");
        editIcon = new ImageIcon("src/icon/4.jpg");
        
        label1 = new JLabel("This is label1");
        label2 = new JLabel("This is label2");
        label3 = new JLabel("This is label3");
        
        panel1 = new JPanel();
        panel1.add(label1);
        panel1.setBackground(Color.PINK);
        
        panel2 = new JPanel();
        panel2.add(label2);
        panel2.setBackground(Color.red);
        
        panel3 = new JPanel();
        panel3.add(label3);
        panel3.setBackground(Color.MAGENTA);
        
        
        tp.addTab("Home",homeIcon ,panel1, "Hello i am panel1 tab");
        tp.addTab("Help",helpIcon, panel2);
        tp.addTab("Edit",editIcon ,panel3);
        
        
    }
    
    public static void main(String[] args) {
        TabbedPaneDemo2 frame = new TabbedPaneDemo2();
        frame.setVisible(true);
    }
}
