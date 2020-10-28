
package string_package;

public class PalindromeDemo {
    public static void main(String[] args) {
        
        String s1 = "madam";
        
        StringBuffer sb = new StringBuffer(s1);
        
        String s2 = sb.reverse().toString();
        
        if(s1.equals(s2))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        
        
        
        String s7 = "mad";
        
        StringBuffer sb1 = new StringBuffer(s7);
        
        String s8 = sb1.reverse().toString();
        
        if(s7.equals(s8))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        
        
        
        String s10 = "121";
        
        StringBuffer sb2 = new StringBuffer(s10);
        
        String s11 = sb2.reverse().toString();
        
        if(s10.equals(s11))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        
        
    }
    
}
