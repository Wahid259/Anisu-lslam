
package varargs;

public class AddDemo {
    
    void add(int ... num)// ... j kono lendth er argument receive korte parbe
    {
        
        int sum = 0;
        for (int x : num) // j kono argument number er modhay thakbe
        {
            sum = sum + x;
            
        }
        System.out.println(sum);
    }
    
    
}
