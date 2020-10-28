
package layout_manager;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutDemo1 extends JFrame{
    
    private Container c;
    private JButton buttons[];
    private FlowLayout fLayout;
    
    FlowLayoutDemo1(){
        initComponents();
    }
    
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,350,300);
        this.setTitle("FlowLayout demo");
        
        c = this.getContentPane();
        fLayout = new FlowLayout(FlowLayout.LEFT);//Left thekay start hobe
        fLayout.setHgap(10);
        fLayout.setVgap(20);
        c.setLayout(fLayout);
        c.setBackground(Color.YELLOW);
        
        buttons = new JButton[9];
        
        for(int i = 0; i < 9; i++)
        {//button touti hobe r continer a add hobe
            buttons[i] = new JButton(""+(i+1));
            c.add(buttons[i]);
        }
    }
    
    
    public static void main(String[] args) {
        
        FlowLayoutDemo1 frame = new FlowLayoutDemo1();
        frame.setVisible(true);
        
    }
}
