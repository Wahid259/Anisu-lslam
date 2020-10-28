
package j_slider;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class SliderDemo1 extends JFrame{
    
    private Container c;
    private JSlider slider;
    
    SliderDemo1()
    {
        initComponents();
        
    }
    
    public void initComponents()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100,100,600,300);
        this.setTitle("ToggleButton");
        
        c = this.getContentPane();
        c.setLayout(null);
        
        slider = new JSlider(0,20,0);//minimum , maximum, nob ta kon value ta thakbe prothom a
        slider.setBounds(100,50,300,50);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        c.add(slider);
        
        
        
        
    }
    
    public static void main(String[] args) {
        SliderDemo1 frame = new SliderDemo1();
        frame.setVisible(true);
    }
}
