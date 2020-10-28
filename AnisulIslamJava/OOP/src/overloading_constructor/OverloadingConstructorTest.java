
package overloading_constructor;

public class OverloadingConstructorTest {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher();
        
        Teacher teacher2 = new Teacher("Wahid", "male");
        teacher2.displayInformation();
        
        Teacher teacher3 = new Teacher("Lisa", "female", 1670060508);
        teacher3.displayInformation();
    }
    
}
