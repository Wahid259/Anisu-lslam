
package array_demo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size = "+number.size());
        
        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
        
        
        System.out.println(number);
        
        System.out.println("size = "+number.size());
    }
    
}
