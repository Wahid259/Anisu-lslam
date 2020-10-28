
package beginnerjava;

import java.util.Scanner;


public class ArithmeticDemo2 {
    
    public static void main(String[] args) {
        
        int num1, num2, result;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter First number : ");
        num1 = input.nextInt();
        
        System.out.print("Enter second number : ");
        num2 = input.nextInt();
        
        result = num1 + num2;
        System.out.println("Sum = "+result);
        
        result = num1 - num2;
        System.out.println("Sub = "+result);
        
        result = num1 * num2;
        System.out.println("Multiplication = "+result);
        
        double result2 = (double) num1 / num2;
        System.out.println("Divided = "+result2);
        
        result = num1 % num2;
        System.out.println("Rimender = "+result);
    }
    
}
