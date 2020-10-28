
package beginnerjava;

import java.util.Scanner;

public class Loop3Demo {
    
    public static void main(String[] args) {
        
        // even number gula SUM hobe
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
            
            if(i%2==0){//even number gular SUM hobe
                sum = sum + i;
                System.out.print(" "+i);
            }
            
        }
        System.out.println();
        System.out.println("The Sum is = "+sum);
        
    }
    
}
