package swing_j_frame;

import javax.swing.JFrame;

public class FrameDemo4 extends JFrame {

    FrameDemo4() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 100, 400, 500);
        setTitle("This is a title");
        
        
    }

    public static void main(String[] args) {

        FrameDemo4 frame = new FrameDemo4();
        frame.setVisible(true);

    }

}
