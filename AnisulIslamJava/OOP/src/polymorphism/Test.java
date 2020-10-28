
package polymorphism;

public class Test {
    public static void main(String[] args) {
        
        Person p = new Person();
        p.desplay();
        
        p = new Teacher();
        p.desplay();
        
        p = new Student();
        p.desplay();
       
    }
    
}
