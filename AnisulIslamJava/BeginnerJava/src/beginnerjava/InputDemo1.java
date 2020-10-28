
package beginnerjava;

import java.util.Scanner;


public class InputDemo1 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int number;
        
        System.out.print("Enter any number : ");
        number = input.nextInt();
        
        System.out.println("Number = "+number);
    }
    
}
