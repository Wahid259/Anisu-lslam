
package spinner;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class SpinnerDemo1 extends JFrame{
    
    private Container c;
    private JSpinner spinner;
    
    SpinnerDemo1()
    {
        initComponents();
        
    }
    
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,450,450);
        this.setTitle("Spinner Demo");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        SpinnerNumberModel value = new SpinnerNumberModel(10,0,30,1);
        //enitially, minimun, maximum, difference
        
        spinner = new JSpinner(value);
        spinner.setBounds(100,100,70,50);
        c.add(spinner);
        
        
        
    }
    public static void main(String[] args) {
        SpinnerDemo1 frame = new SpinnerDemo1();
        frame.setVisible(true);
    }
}
