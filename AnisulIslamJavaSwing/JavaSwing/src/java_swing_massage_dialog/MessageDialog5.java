
package java_swing_massage_dialog;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MessageDialog5 {
    public static void main(String[] args) {
        
        ImageIcon img = new ImageIcon("D:/AnisulIslamJavaSwing/smil.jpg");
        
        JOptionPane.showMessageDialog(null, "Enter Correct Password", "This is a Title", JOptionPane.PLAIN_MESSAGE, img);
        
    }
    
}
