
package string_package;

public class StringDemo2 {
    public static void main(String[] args) {
        
        String s1 = "wahid Bin Mahbub";
        String s2 = new String("Wahid Bin Mahbub");
        
        char[] s3 = {'a', 'n', 'i', 's'};
        
        
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);
        
        int len = s1.length();
        System.out.println("Length of s1 = "+len);
        
        if(s1.equalsIgnoreCase(s2))//uppercase lowercase ignore korbe
        {
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
    
    
}
