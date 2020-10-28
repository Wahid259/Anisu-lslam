
package java_swing_massage_dialog;

import javax.swing.JOptionPane;

public class InputDialog1 {
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter your name : ");
        JOptionPane.showMessageDialog(null, name + " Welcome to swing");
    }
    
}
