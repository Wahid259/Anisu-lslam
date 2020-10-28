
package beginnerjava;

import java.util.Scanner;


public class InputDemo3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double num1;
        
        System.out.print("Enter any double value : ");
        num1 = input.nextDouble();
        
        System.out.println(num1);
    }
    
}
