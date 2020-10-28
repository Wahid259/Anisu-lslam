
package method_overriding;

public class Test {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.name = "Wahid";
        t1.age = 25;
        t1.qualification = "BSc in CSE";
        t1.displayInformation();
        
        
        Person p1 = new Person();
        p1.name = "Mahbub";
        p1.age = 27;
        //t1.qualification = "BSc in CSE";
        //qualification ni ai khan a
        p1.displayInformation();
    }
    
}
