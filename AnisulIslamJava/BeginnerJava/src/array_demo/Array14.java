
package array_demo;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        
        int[] number = {10, -3, 18, 5, 25};
        
        Arrays.sort(number);// array sort hoye jabe
        
        System.out.print("Ascending : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+number[i]);
            
        }
        System.out.println();
        System.out.print("Descending : ");
        
        for (int i = 4; i >= 0; i--) {
            System.out.print(" "+number[i]);
            
        }
    }
    
}
