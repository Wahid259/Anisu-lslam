
package color_chooser;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class ColorChooserDemo1 extends JFrame{
    
    private Container c;
    private JButton bt;
    
    
    ColorChooserDemo1()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,100,500,400);
        this.setTitle("ColorChooser Demo");
        
        c = this.getContentPane();
        c.setLayout(null);
        
        bt = new JButton("Choose a color");
        bt.setBounds(100,50,150,50);
        c.add(bt);
        
        bt.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                Color color = JColorChooser.showDialog(null, "Select a color", Color.yellow);
                c.setBackground(color);
                
            }
            
        
        
        });
        
    }
    
    public static void main(String[] args) {
        
        ColorChooserDemo1 frame = new ColorChooserDemo1();
        frame.setVisible(true);
    }
    
}
