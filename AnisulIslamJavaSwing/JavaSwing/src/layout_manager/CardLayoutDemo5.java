/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout_manager;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author HP
 */
public class CardLayoutDemo5 extends JFrame implements ActionListener{
    
    private Container c;
    private CardLayout cl;
    private JButton btn1, btn2, btn3;
    
    
    CardLayoutDemo5()
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
        
        cl.last(c);
        //sact er ta dhakabe
    }
    
    public static void main(String[] args) {
        
        CardLayoutDemo5 frame = new CardLayoutDemo5();
        frame.setVisible(true);
        
    }
}
