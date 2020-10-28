
package array_demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size = "+number.size());
        
        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
        
        
        //iterator class
        for(int i : number){
            System.out.println(i+" ");
        }
        
        
        System.out.println();
        
        System.out.println("size = "+number.size());
    }
}
