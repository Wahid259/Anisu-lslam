//super class
package problems_solvings2;

public abstract class Shape {
    
    double dimention1, dimention2;
    
    Shape(double dimention1, double dimention2)
    {
        this.dimention1 = dimention1;
        this.dimention2 = dimention2;
    }
    
    
    abstract void area();
    
}
