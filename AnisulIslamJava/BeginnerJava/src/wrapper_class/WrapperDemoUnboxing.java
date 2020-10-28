package wrapper_class;

public class WrapperDemoUnboxing {

    public static void main(String[] args) {

        //object -> primitive data type
        Double d = new Double(10.25);
        System.out.println("d = "+d);
        
        double e = d.doubleValue();
        System.out.println("e = "+e);
        

    }

}
