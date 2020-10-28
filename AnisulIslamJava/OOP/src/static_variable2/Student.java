
package static_variable2;

public class Student {
    
    //int count = 0;// non static variable
    static int count = 0;// static variable
    /*
    1 ta class er sathe related
    alada alada na
    */
    
    Student()
    {
        count++;// count = 5
    }
    
    void totalStudent()
    {
        System.out.println("Total student = "+count);
        
    }
    
}
