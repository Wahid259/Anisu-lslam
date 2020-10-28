
package j_check_box;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxDemo3 extends JFrame{
    private Container c;
    private JCheckBox javaCheckBox, cCheckBox, mysqlCheckBox;
    private Font f;
    private ButtonGroup grp;
    
    CheckBoxDemo3()
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
        
        f = new Font("Arial", Font.ITALIC + Font.BOLD, 18);
        
        javaCheckBox = new JCheckBox("Java");
        javaCheckBox.setBounds(50,100,100,30);
        javaCheckBox.setBackground(Color.PINK);
        javaCheckBox.setFont(f);
        c.add(javaCheckBox);
        
        cCheckBox = new JCheckBox("C");
        cCheckBox.setBounds(50,130,100,30);
        cCheckBox.setBackground(Color.PINK);
        cCheckBox.setFont(f);
        c.add(cCheckBox);
        
        mysqlCheckBox = new JCheckBox("Mysql");
        mysqlCheckBox.setBounds(50,160,100,30);
        mysqlCheckBox.setBackground(Color.PINK);
        mysqlCheckBox.setFont(f);
        c.add(mysqlCheckBox);
        
        grp.add(javaCheckBox);
        grp.add(cCheckBox);
        grp.add(mysqlCheckBox);
        
    }
    public static void main(String[] args) {
        
        CheckBoxDemo3 frame = new CheckBoxDemo3();
        frame.setVisible(true);
    }
}
