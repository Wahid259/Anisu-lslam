
package j_combo_box;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxDemo5 extends JFrame{
    private Container c;
    private JComboBox cb;
    private String[] proLanguage = {"C", "C++", "Java", "PHP", "Python"};
    
    ComboBoxDemo5() 
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
        cb.setSelectedIndex(3);//kon item ta select rakbo sei INDEX ta rakbo
        c.add(cb);
        
        
        
        System.out.println("Totla item = "+cb.getItemCount());
    }
    
    public static void main(String[] args) {
        
        ComboBoxDemo5 frame = new ComboBoxDemo5();
        frame.setVisible(true);
    }
}
