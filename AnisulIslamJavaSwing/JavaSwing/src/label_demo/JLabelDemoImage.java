
package label_demo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemoImage extends JFrame{
    private Container c;
    private JLabel imgLable;
    private ImageIcon img;
    
    JLabelDemoImage()
    {
        initComponents();
    }
    
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        img = new ImageIcon(getClass().getResource("bruce_lee.jpg"));
        
        imgLable = new JLabel(img);
        imgLable.setBounds(50, 30, img.getIconWidth(), img.getIconHeight());
        c.add(imgLable);
        
    }
    
    public static void main(String[] args) {
        
        JLabelDemoImage frame = new JLabelDemoImage();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 1100, 800);
        
        frame.setTitle("Label demo");
        
        
    }
    
    
}
