
package number_system_conversion;

public class NumberConversionDemo2 {
    public static void main(String[] args) {
        
        String binary = "101011";
        Integer decimal1 = Integer.parseInt(binary, 2);
        System.out.println(decimal1);
        
        String octal = "101011";
        Integer decimal2 = Integer.parseInt(octal, 8);
        System.out.println(decimal2);
        
        String hexadecimal = "A";
        Integer decimal3 = Integer.parseInt(hexadecimal, 16);
        System.out.println(decimal3);
    }
    
}
