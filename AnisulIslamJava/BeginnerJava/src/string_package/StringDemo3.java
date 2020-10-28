package string_package;

public class StringDemo3 {

    public static void main(String[] args) {

        String s1 = "wahid Bin Mahbub";
        String s2 = new String("Wahid Bin Mahbub");
        String s4 = new String();

        char[] s3 = {'a', 'n', 'i', 's'};

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        int len = s1.length();
        System.out.println("Length of s1 = " + len);

        boolean con = s1.contains("wahi");
        System.out.println(con);
        
        boolean b = s1.isEmpty();
        System.out.println("s1 = "+b);
        
        b = s4.isEmpty();
        System.out.println("s4 = "+b);
    }
}
