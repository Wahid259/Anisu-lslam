
package oop;

public class Teacher {
    
    String name , gender;
    int phone;
    
    Teacher()//default constructor
    {
        System.out.println("No value");
    }
    
    Teacher(String n, String g, int p)//parameterized constructor
    {
        name = n;
        gender = g;
        phone = p;
    }
    
    void displayInformation() //method type void kono kicu return korbe na
    {
        System.out.println("Name : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Phone : "+phone);
        System.out.println("\n\n");
    }
    
}
