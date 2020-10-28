
package hash_set;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        
        HashSet <String> fruitsName = new HashSet <String>();
        
        fruitsName.add("Apple");
        fruitsName.add("Orange");
        fruitsName.add("Bananna");
        fruitsName.add("Strwberry");
        fruitsName.add("Pineapple");
        
        System.out.println(fruitsName);
        System.out.println(fruitsName.size());
        
        fruitsName.remove("Apple");
        System.out.println(fruitsName);
        System.out.println(fruitsName.size());
        
        fruitsName.clear();
        System.out.println(fruitsName);
        
        boolean value = fruitsName.isEmpty();
        System.out.println(value);
    }
    
}
