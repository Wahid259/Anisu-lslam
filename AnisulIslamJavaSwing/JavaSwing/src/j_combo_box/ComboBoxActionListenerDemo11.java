
package j_combo_box;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxActionListenerDemo11 extends JFrame{
    private Container c;
    private JComboBox cb;
    private String[] proLanguage = {"C", "C++", "Java", "PHP", "Python"};
    private JLabel label;
    private JButton btn;
    
    ComboBoxActionListenerDemo11() 
    {
        initComponents();
    }
    
    public void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);
        this.setTitle("ComboBox Demo");

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        cb = new JComboBox(proLanguage);
        cb.setBounds(50,150,100,50);
        cb.setEditable(true);
        cb.addItem("Fortran");//comboBox er new Item add hoye galo
        cb.addItem("BASIC");//comboBox er new Item add hoye galo
        c.add(cb);
        
        btn = new JButton("Show");
        btn.setBounds(50,250,80,50);
        c.add(btn);
        
        label = new JLabel();
        label.setBounds(160,150,200,50);
        c.add(label);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                 
                String s = cb.getSelectedItem().toString();
                label.setText("You have selected : "+s);
            }
        
        });
        
        
    }
    
    public static void main(String[] args) {
        
        ComboBoxActionListenerDemo11 frame = new ComboBoxActionListenerDemo11();
        frame.setVisible(true);
    }
}
