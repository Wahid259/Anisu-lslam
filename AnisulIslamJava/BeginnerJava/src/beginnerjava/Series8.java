// 1.5  X  2.5  X  3.5 ....... X  n
package beginnerjava;

import java.util.Scanner;

public class Series8 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double n;
        double result = 1;
        System.out.print("Enter the last number : ");
        n = input.nextDouble();
        
        for (double i = 1.5; i <=n; i++) {
            System.out.print(i+" x ");
            result = result * i;
        }
        System.out.println();
        System.out.println(result);
        
    }
    
}
