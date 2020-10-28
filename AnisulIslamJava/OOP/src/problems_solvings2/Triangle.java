
package problems_solvings2;

public class Triangle extends Shape{
    //dimention1, dimention2
    
    Triangle(double dimention1, double dimention2)
    {
        super(dimention1, dimention2);
    }
    
    void area()
    {
        double result = 0.5 * dimention1 * dimention2;
        System.out.println("Triangle area : "+result);
    }
    
}
