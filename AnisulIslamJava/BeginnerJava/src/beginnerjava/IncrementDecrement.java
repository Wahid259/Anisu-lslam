
package beginnerjava;

public class IncrementDecrement {
    
    public static void main(String[] args) {
        
        int x = 25;
        int y;
        
        y = --x; //pre decriment x = 24
        System.out.println("y = "+y);
        
        y = x--; // x = 24
        System.out.println("y = "+y);
        
        y = ++x; //x = 24
        System.out.println("y = "+y);
        
        y = x++;// x = 24
        System.out.println("y = "+y);
    }
    
}
