
package swing_j_frame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JFrameBackgroundColorChange extends JFrame{
    private ImageIcon icon;
    private Container c;
    
    JFrameBackgroundColorChange()
    {
        initComponents();
        
    }
    
    public void initComponents()
    {
        
        c = this.getContentPane();
        c.setBackground(Color.MAGENTA);
        
        icon = new ImageIcon(getClass().getResource("iron.jpg"));
        this.setIconImage(icon.getImage());
    }
    
    
    public static void main(String[] args) {
        
        JFrameBackgroundColorChange frame = new JFrameBackgroundColorChange();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Frame Demo");
        frame.setResizable(false);//frame k r resize kora jabe na
        
    }
    
    
}
