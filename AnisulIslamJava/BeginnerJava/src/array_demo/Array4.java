
package array_demo;

import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] number = new double[5];
        double sum =0;
        
        System.out.print("Please Enter 5 number : ");
        
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
            
        }
        // number[0] = 1
        // number[1] = 2
        // number[2] = 3
        // number[3] = 4
        // number[4] = 5
        
        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];// sum 
        } 
        
        
        System.out.println("The sum is : "+sum);
        
        double avarage = sum/number.length;
        System.out.println("The avarage is : "+avarage);
    }
    
}
