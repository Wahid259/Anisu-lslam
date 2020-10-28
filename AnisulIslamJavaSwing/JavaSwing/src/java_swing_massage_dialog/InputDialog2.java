
package java_swing_massage_dialog;

import javax.swing.JOptionPane;

public class InputDialog2 {
    public static void main(String[] args) {
        
        String f_name = JOptionPane.showInputDialog(null, "Enter your first name : ", "This is title", JOptionPane.QUESTION_MESSAGE);
        String l_name = JOptionPane.showInputDialog(null, "Enter your lase name : ");
        
        String name = f_name + " " + l_name;
        
        JOptionPane.showMessageDialog(null, "your full name is : " +name);
        
        
        
    }
    
}
