
package type_casting3;

public class Test {
    
    public static void main(String[] args) {
        
        Person p = new Teacher();//upcasting
        p.display();
        
        /*Teacher t = (Teacher) new Person();
        t.display();
        */    
    }
    
}
