//1^2 + 2^2 + 3^2+.......+n^2
package beginnerjava;

import java.util.Scanner;

public class Series5 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        
        System.out.print("Enter the last number = ");
        n = input.nextInt();
        
        for (int i = 1; i <= n; i = i + 1) {
            System.out.print(i+"X"+i+" ");
            sum = sum + i*i;
            
        }
        System.out.println();
        System.out.println(sum);
    }
    
}
