
package array_demo;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size = "+number.size());
        
        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
        
        System.out.println("ArrayList contains : "+number);
        System.out.println();
        System.out.println("size = "+number.size());
        
        //romoving elements
        number.remove(2);
        
        System.out.println("after removing ArrayList contains : "+number);
        
        number.removeAll(number);
        System.out.println("After removing all : "+number);//sob kicu remove kore debay
    }
}
