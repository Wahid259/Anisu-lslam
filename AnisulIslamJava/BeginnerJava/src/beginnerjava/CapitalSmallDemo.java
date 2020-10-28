package beginnerjava;

import java.util.Scanner;

public class CapitalSmallDemo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter any letter : ");
        ch = input.next().charAt(0);
        
        if(ch>='a' && ch<='z')//a-z er modhay ase
        {
            System.out.println("Small Letter");
        }
        else if(ch>='A' && ch<='Z')//A-Z er modhay ase
        {
            System.out.println("Capital Letter");
        }
        else{
            System.out.println("Not a Letter");
        }
    }
    
}
