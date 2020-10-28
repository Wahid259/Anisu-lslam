
package array_demo;


public class Array1 {
    public static void main(String[] args) {
        
        /*int[] number; //array declear
        number = new int[5];
        */
        int[] number = new int[5];
        //int[] number2 = new int[15];
        
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;
        
        int sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("Sum = "+sum);
        
        int len = number.length;// number array er length ta bole debay 
        System.out.println("Array size = "+len);
    }
    
}
