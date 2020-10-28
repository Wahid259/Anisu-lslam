
package exception_handling;

public class ExceptionDemo {
    public static void main(String[] args) {
        
        try
        {
            int x = 10;
            int y = 0;
            int result = x / y;
            System.out.println("Result : "+result);
        }
        catch(ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Exception : "+e1);
        }
        catch(ArithmeticException e2)
        {
            System.out.println("Exception : "+e2);
        }
        catch(Exception e3)
        {
            System.out.println("Exception : "+e3);
        }
        finally{
            System.out.println("Lase line of the program");
        }
        
        
        
    }
    
}
