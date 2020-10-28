
package array_demo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size = "+number.size());
        
        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
        
        
        for (int x : number) {
            System.out.print(" "+x);
            
        }
        System.out.println();
        
        System.out.println("size = "+number.size());
    }
    
}
