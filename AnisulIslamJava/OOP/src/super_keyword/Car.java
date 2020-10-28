
package super_keyword;

public class Car extends Vehicle{
    //color, weight, attribute()
    int gear;
    
    Car(String c, double w, int g)
    {
        super(c, w);//alwase first line a call detay hobe
        /*
        calling the constructor of vehicle class
        */
        gear = g;
    }
    
    @Override
    void attribute()
    {
        super.attribute();
        System.out.println("Gear : "+gear);
    }
    
}
