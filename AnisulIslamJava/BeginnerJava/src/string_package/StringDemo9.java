
package string_package;

public class StringDemo9 {
    public static void main(String[] args) {
        
        String s1 = "Wahid";
        StringBuffer sb = new StringBuffer(s1);
        
        System.out.println(sb);
        
        sb.append(" Mahbub ");
        sb.append(25);
        
        System.out.println(sb);
        
        //sb.reverse();
        //System.out.println(sb);
        
        sb.delete(0, 5);//0-5 porjonto sob delete kore deci
        System.out.println(sb);
        
        sb.setLength(5);
        System.out.println(sb);
    }
    
}
