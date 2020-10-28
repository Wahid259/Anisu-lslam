//
package decimal_number_format_demo;

import java.text.DecimalFormat;

public class DecimalNumberFormatDemo {
    public static void main(String[] args) {
        
        DecimalFormat ob = new DecimalFormat("0.000");
        double x = 2.9875488;
        //System.out.printf("x = %.2f",x);
        System.out.println("x = "+ob.format(x));
    }
    
}
