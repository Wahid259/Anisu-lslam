// 1  X  2  X  3  X........ X  n
package beginnerjava;

import java.util.Scanner;


public class Series6 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        int result = 1;
        System.out.print("Enter the last number : ");
        n = input.nextInt();
        
        for (int i = 1; i <=n; i++) {
            System.out.print(i+" ");
            result = result * i;
        }
        System.out.println();
        System.out.println(result);
        
    }
    
    
    
}
