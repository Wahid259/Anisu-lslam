
package beginnerjava;

import java.util.Scanner;

public class Loop2Demo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int m,n;
        System.out.print("Enter initial number : ");
        m = input.nextInt();
        
        System.out.print("Enter final number : ");
        n = input.nextInt();
        
        /* user ja debay ta frothom thekay
            ses porjonto sum korbe
        */
        for (int i = m; i <= n; i++) {
            
            sum = sum + i;
            
        }
        System.out.println("The Sum is = "+sum);
        
    }
    
}
