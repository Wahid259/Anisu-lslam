package string_package;

public class StringDemo11 {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("Wahid");

        str.append(" Mahbub");

        System.out.println("str = " + str);

        //str.reverse();
        //System.out.println(str);
        str.delete(2, 5);
        System.out.println(str);

    }

}
