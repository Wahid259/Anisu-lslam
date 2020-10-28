
package swing_j_frame;

import javax.swing.JFrame;

public class FrameDemo3 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(50, 100, 400, 500);
        frame.setTitle("This is a title");
    }
    
}
