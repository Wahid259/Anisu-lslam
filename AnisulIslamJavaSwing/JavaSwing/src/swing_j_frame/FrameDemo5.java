
package swing_j_frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class FrameDemo5 extends JFrame{
    
    private ImageIcon icon;
    
    FrameDemo5()
    {
        initComponents();
        
    }
    
    public void initComponents()
    {
        icon = new ImageIcon(getClass().getResource("iron.jpg"));
        this.setIconImage(icon.getImage());
    }
    
    
    public static void main(String[] args) {
        
        FrameDemo5 frame = new FrameDemo5();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        frame.setBounds(200, 50, 400, 300);
        frame.setTitle("Frame Demo");
        frame.setResizable(false);//frame k r resize kora jabe na
        
    }
    
}
