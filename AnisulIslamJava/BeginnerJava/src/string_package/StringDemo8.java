
package string_package;

public class StringDemo8 {
    
    public static void main(String[] args) {
        String s1 = " This is my country";
        System.out.println(s1);
        
        String s4 = " This_is_my_country";
        System.out.println(s4);
        
        String s2 = s1.replace('i','j');//i replase hoye jabe j dea
        System.out.println(s2);
        
        String[] s3 = s1.split(" ");//space palay caty debay
        for(String x : s3)
        {
            System.out.println(x);
        }
        
        String[] s5 = s4.split("_");//"_" palay caty debay
        for(String x : s5)
        {
            System.out.println(x);
        }
        
    }
    
}
