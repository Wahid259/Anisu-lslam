//1.5 + 2.5 + 3.5 ......... + n
package beginnerjava;

import java.util.Scanner;

public class Series4 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double n, sum = 0;
        
        System.out.print("Enter the last number = ");
        n = input.nextDouble();
        
        for (double i = 1.5; i <= n; i = i + 1) {
            System.out.print(i+" ");
            sum = sum + i;
            
        }
        System.out.println();
        System.out.println(sum);
    }
    
}
