
package static_keyword;

public class Student {
    
    String name;
    int id;
    static String universityName = "UIU";
    
    Student(String n, int i)
    {
        name = n;
        id = i;
    }
    
    void displayInformation()
    {
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("University Name : "+universityName);
        System.out.println();
    }
}
