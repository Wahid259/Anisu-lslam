//153 = 1^3 + 5^3 + 3^3 = 153
//Armstrong
package beginnerjava;

import java.util.Scanner;

public class ArmstrongDemo {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int sum = 0, r, temp, num;
        System.out.print("Enter any number = ");
        num = input.nextInt();
        
        temp = num;
        
        while(temp!=0){
            
            r = temp % 10;
            sum = sum + r*r*r;
            temp = temp / 10;
        }
        if(num == sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
        
    
    }
    
}
