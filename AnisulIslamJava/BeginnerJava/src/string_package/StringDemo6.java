
package string_package;


public class StringDemo6 {
    public static void main(String[] args) {
        
        String firstName = "Wahid";
        String lastName = " Mahbub";
        
        String fullName = firstName.concat(lastName);
        
        System.out.println("Full Name = "+fullName);
        
        String upperName = fullName.toUpperCase();
        System.out.println("upperName = "+upperName);
        
        String lowerName = fullName.toLowerCase();
        System.out.println("lowerName = "+lowerName);
        
        boolean b = firstName.startsWith("W");
        System.out.println("b = "+b);
        
        b = firstName.startsWith("w");
        System.out.println("b = "+b);
        
        boolean last = lastName.endsWith("b");
        System.out.println("last = "+last);
        
        last = lastName.endsWith("ub");
        System.out.println("last = "+last);
        
        last = lastName.endsWith("u");
        System.out.println("last = "+last);
        
        String[] names = {"wahid", "niloy", "soboj"};
        for(String x : names){
            System.out.println(x);
        }
        String[] names1 = {"wahid", "niloy", "soboj"};
        for (int i = 0; i < 3; i++) {
            System.out.println(names[i]);
            
        }
    }
    
}
