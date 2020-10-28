
package string_comparision;

public class StringComparision {
    public static void main(String[] args) {
        
        String password1 = "wahid123";
        String password2 = "wahid123";
        String password3 = new String("wahid123");
        String password4 = new String("wahid123");
        
        /*  
            System.out.println(password1==password2);
            System.out.println(password1==password3);
            System.out.println(password3==password4);
        */
        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));
        
        System.out.println(password3.equalsIgnoreCase(password2));//case ignote korbo ai ignore case dea
        
    }
    
}
