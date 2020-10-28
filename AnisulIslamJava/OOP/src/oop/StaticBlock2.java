
package oop;

public class StaticBlock2 {
    static int id;
    static String name;

    static//static block
    {
        id = 011143052;
        name = "Wahid";

    }

    static void display() {
        System.out.println("id : " + id);
        System.out.println("Name : " + name);
    }
    
    public static void main(String[] args) {
        StaticBlock2.display();
    }
    
}
