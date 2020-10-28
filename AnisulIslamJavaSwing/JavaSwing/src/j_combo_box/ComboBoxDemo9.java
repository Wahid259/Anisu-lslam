
package j_combo_box;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxDemo9 extends JFrame{
    private Container c;
    private JComboBox cb;
    private String[] proLanguage = {"C", "C++", "Java", "PHP", "Python"};
    
    ComboBoxDemo9() 
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
        cb.removeAllItems();
        c.add(cb);
        
        
    }
    
    public static void main(String[] args) {
        
        ComboBoxDemo9 frame = new ComboBoxDemo9();
        frame.setVisible(true);
    }
}
