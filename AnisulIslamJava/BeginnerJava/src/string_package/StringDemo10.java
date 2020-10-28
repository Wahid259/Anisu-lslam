
package string_package;

public class StringDemo10 {
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("Wahid");
        
        System.out.println("str = "+str);
        
        str.append(" Mahbub");
        str.append(23);
        str.append(12.5);
        
        System.out.println("str = "+str);
        
        
    }
    
}
