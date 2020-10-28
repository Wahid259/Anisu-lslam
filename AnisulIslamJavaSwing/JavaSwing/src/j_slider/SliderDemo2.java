
package j_slider;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JSlider;

public class SliderDemo2 extends JFrame{
    
    private Container c;
    private JSlider slider;
    
    SliderDemo2()
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
        
        slider = new JSlider(JSlider.VERTICAL,0,20,0);//minimum , maximum, nob ta kon value ta thakbe prothom a
        slider.setBounds(100,50,300,50);
        slider.setMinorTickSpacing(1);
        slider.setMajorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        c.add(slider);
        
        
        
        
    }
    
    public static void main(String[] args) {
        SliderDemo2 frame = new SliderDemo2();
        frame.setVisible(true);
    }
}
