
package problems_solvings2;

public class Circle extends Shape{
    //dimention1, dimention2
    //area = 3.1416 * r * r (r = radius)
    
    Circle(double r)
    {
        super(r, r);
    }
    void area()
    {
        double result = Math.PI * dimention1 * dimention2;
        System.out.println("Circle area : "+result);
    }
    
}
