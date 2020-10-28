
package label_demo;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelDemoImageandText extends JFrame{
    
    private Container c;
    private JLabel label;
    private ImageIcon image;
    
    JLabelDemoImageandText()
    {
        initComponents();
    }
    public void initComponents()
    {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        image = new ImageIcon(getClass().getResource("bruce_lee.jpg"));
        
        label = new JLabel("He is BRUCE LEE", image, JLabel.RIGHT);
        label.setBounds(50,50,500,200);
        c.add(label);
        
        
    }
    
    public static void main(String[] args) {
        
        JLabelDemoImageandText frame = new JLabelDemoImageandText();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 800, 500);
        
        frame.setTitle("Label demo");
    }
    
}
