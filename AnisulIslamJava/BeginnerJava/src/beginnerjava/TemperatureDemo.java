
package beginnerjava;

import java.util.Scanner;


public class TemperatureDemo {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double cels, fran;
        
        System.out.print("Celsius = ");
        cels = input.nextDouble();
        
        fran = 1.8 * cels + 32;
        
        System.out.println("Farenhit : "+fran);
    }
    
}
