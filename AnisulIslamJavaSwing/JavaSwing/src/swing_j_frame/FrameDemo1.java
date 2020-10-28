
package swing_j_frame;

import javax.swing.JFrame;

public class FrameDemo1 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //frame.setSize(400, 300);//width & hight
        //frame.setLocationRelativeTo(null);
        //frame.setLocation(200, 50);
        
        frame.setBounds(200, 50, 400, 300);
        
        frame.setTitle("Frame Demo");
        
        frame.setResizable(false);//frame k r resize kora jabe na
        
    }
    
}
