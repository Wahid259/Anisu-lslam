package oop;

public class StaticBlock {

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
}
