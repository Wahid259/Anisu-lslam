//1^2  x  2^2  x  3^2  x.......x  n^2
package beginnerjava;

import java.util.Scanner;

public class Series9 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        int result = 1;
        System.out.print("Enter the last number : ");
        n = input.nextInt();
        
        for (int i = 1; i <=n; i++) {
            System.out.print(i+"x"+i+" ");
            result = result * (i*i);
        }
        System.out.println();
        System.out.println(result);
        
    }
    
    
}
