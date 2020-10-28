
package array_demo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo10 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> number = new ArrayList<Integer>();
        
        number.add(20);
        number.add(-3);
        number.add(18);
        number.add(92);
        number.add(0);
        number.add(2);
        
        System.out.println("before sorting : "+number);
        
        Collections.sort(number);//small to large sorted
        System.out.println("after sorting in ascending : "+number);
        
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("after sorting in descending : "+number);
    }
    
}
