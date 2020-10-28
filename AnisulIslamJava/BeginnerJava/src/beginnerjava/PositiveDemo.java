package beginnerjava;

import java.util.Scanner;

public class PositiveDemo {
    
    public static void main(String[] args) {
        
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer : ");
        num = input.nextInt();
        
        
        if(num > 0){
            System.out.println("Posetive");
        }
        else if (num < 0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Equal to Zero");
        }
        
    }
    
}
