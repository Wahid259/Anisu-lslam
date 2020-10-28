
package j_combo_box;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxDemo6 extends JFrame{
    private Container c;
    private JComboBox cb;
    private String[] proLanguage = {"C", "C++", "Java", "PHP", "Python"};
    
    ComboBoxDemo6() 
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
        cb.setSelectedItem("Java");//bole deci j JAVA selected thakbe
        c.add(cb);
        
        
        
        System.out.println("Totla item = "+cb.getItemCount());
    }
    
    public static void main(String[] args) {
        
        ComboBoxDemo6 frame = new ComboBoxDemo6();
        frame.setVisible(true);
    }
}
