
package inheritance;

public class Test {
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.name = "Alak Kanti";
        t1.age = 30;
        t1.qualification = "MSc in CSE";
        t1.displayInformation2();
        
        Teacher t2 = new Teacher();
        t2.name = "Wahid Bin MAhbub";
        t2.age = 25;
        t2.qualification = "BSc in CSE";
        t2.displayInformation2();
    }
    
}
