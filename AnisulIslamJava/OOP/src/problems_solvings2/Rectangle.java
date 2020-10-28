
package problems_solvings2;

public class Rectangle extends Shape{
    //dimention1, dimention2
    
    Rectangle(double dimention1, double dimention2)
    {
        super(dimention1, dimention2);
    }
    
    void area()
    {
        double result = dimention1 * dimention2;
        System.out.println("Rectangle area : "+result);
    }
    
}
