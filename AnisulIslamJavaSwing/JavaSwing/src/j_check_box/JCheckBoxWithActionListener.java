
package j_check_box;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JCheckBoxWithActionListener extends JFrame{
    
    private Container c;
    private JCheckBox javaCheckBox, cCheckBox, mysqlCheckBox;
    private Font f;
    private ButtonGroup grp;
    private JLabel label;
    
    JCheckBoxWithActionListener()
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
        
        label =new JLabel("You haven't selected anything");
        label.setBounds(50,200,300,30);
        label.setFont(f);
        c.add(label);
        
        
        Handler handler = new Handler();
        javaCheckBox.addActionListener(handler);
        cCheckBox.addActionListener(handler);
        mysqlCheckBox.addActionListener(handler);
    }
    
    class Handler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
             
            if(javaCheckBox.isSelected())//(e.getSource() == javaCheckBox)
            {
                label.setText("You hava selected Java");
            }
            else if(cCheckBox.isSelected())//(e.getSource() == cCheckBox)
            {
                label.setText("You hava selected C");
            }
            else
            {
                label.setText("You hava selected Mysql");
            }
                    
            
        }
        
    }
    
    
    
    public static void main(String[] args) {
        
        JCheckBoxWithActionListener frame = new JCheckBoxWithActionListener();
        frame.setVisible(true);
    }
}
