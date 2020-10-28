
package modifier1;

public class A {
    
    private void display1()
    {
        System.out.println("Hi, I am private");
    }
    public void display2()
    {
        System.out.println("Hi, I am public");
    }
    
    protected void display3()
    {
        System.out.println("Hi, I am protected");
    }
    
    void display4()//default member
            //onno kono package thekay use kora jabe na
    {
        System.out.println("Hi, I am default");
    }
}
