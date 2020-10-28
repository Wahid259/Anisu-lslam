
package oop.method_overloading;

public class OverloadTest2 {
    public static void main(String[] args) {
        
        Overload2 ob = new Overload2();//type convert kore nebay
        ob.add();
        ob.add(5, 10);
        ob.add(6.5, 5.5);
        ob.add(5, 10, 20);
        /*
        integer k double kore felbay
        */
    }
    
}
