
package j_check_box;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxDemo2 extends JFrame{
    private Container c;
    private JCheckBox javaCheckBox, cCheckBox, mysqlCheckBox;
    private ButtonGroup grp;
    
    CheckBoxDemo2()
    {
        initComponents();
    }
    
    public void initComponents() 
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 100, 500, 400);
        this.setTitle("CheckBox Demo");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        grp = new ButtonGroup();
        
        javaCheckBox = new JCheckBox("Java");
        javaCheckBox.setBounds(50,100,100,30);
        javaCheckBox.setBackground(Color.PINK);
        c.add(javaCheckBox);
        
        cCheckBox = new JCheckBox("C");
        cCheckBox.setBounds(50,130,100,30);
        cCheckBox.setBackground(Color.PINK);
        c.add(cCheckBox);
        
        mysqlCheckBox = new JCheckBox("Mysql");
        mysqlCheckBox.setBounds(50,160,100,30);
        mysqlCheckBox.setBackground(Color.PINK);
        c.add(mysqlCheckBox);
        
        grp.add(javaCheckBox);
        grp.add(cCheckBox);
        grp.add(mysqlCheckBox);
        
    }
    public static void main(String[] args) {
        
        CheckBoxDemo2 frame = new CheckBoxDemo2();
        frame.setVisible(true);
    }
}
