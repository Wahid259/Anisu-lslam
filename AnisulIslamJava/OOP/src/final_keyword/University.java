
package final_keyword;

public class University {
    final String UNIVERSITY_NAME = "UIU";
    static final int fees;//blank final variable
    
    static
    {
        fees = 40000;
    }
    
    void display()
    {
        //name = "JU"; -> jabe na because final
        System.out.println(UNIVERSITY_NAME);
        System.out.println(fees);
    }
    
}
