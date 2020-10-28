
package oop.method_overloading;

public class CallByValueTest {
    public static void main(String[] args) {
        
        CallByValue ob = new CallByValue();
        int x= 0;//primitive data
        System.out.println("x before call : "+x);
        
        ob.change(x);
        System.out.println("x after call : "+x);
    }
    
}
