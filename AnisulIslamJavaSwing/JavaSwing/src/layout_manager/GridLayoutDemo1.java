
package layout_manager;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo1 extends JFrame{
    
    private Container c;
    private GridLayout gl;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    
    GridLayoutDemo1()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,100,500,250);
        this.setTitle("GridLayout demo");
        
        c = this.getContentPane();
        gl = new GridLayout(2,2,5,5);
        //horizontal and vartical gap
        c.setLayout(gl);
        
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(btn6);
        c.add(btn7);
        c.add(btn8);
        c.add(btn9);
        
        
        
        
    }
    
    public static void main(String[] args) {
        
        GridLayoutDemo1 frame = new GridLayoutDemo1();
        frame.setVisible(true);
        
    }
}
