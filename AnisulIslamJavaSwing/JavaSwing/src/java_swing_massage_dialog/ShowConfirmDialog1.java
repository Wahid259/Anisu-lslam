
package java_swing_massage_dialog;

import javax.swing.JOptionPane;

public class ShowConfirmDialog1 {
    public static void main(String[] args) {
        
        int choice = JOptionPane.showConfirmDialog(null, "Do want to quit this program? ", "Title", JOptionPane.YES_NO_OPTION);
        
        if(choice == JOptionPane.YES_OPTION)
        {
            System.exit(0);
            
        }
        else
        {
             System.out.println("You have quit no option");
             
             
        }
    }
    
}
