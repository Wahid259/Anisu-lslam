
package beginnerjava;

import java.util.Scanner;

public class FibonacciDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many fibonacci numbers : ");
        int n = input.nextInt();
        
        int first = 0;
        int second = 1;
        int fibo;
        
        System.out.print(first+" "+second);
        
        for (int i = 3; i <=n; i++) { //2 ta number agay print kkore deaci tai 3 thakay suru koreci
            fibo = first + second;
            System.out.print(" "+fibo);
            first = second;
            second = fibo;
            
            
        }
        System.out.println();
    }
    
}
