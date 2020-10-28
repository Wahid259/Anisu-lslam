
package exception_handling;

public class exceptionDemo2 {
    public static void main(String[] args) {
        
        try
        {
            int[] a = new int[4];
            a[4] = 10;
        }
        catch(ArithmeticException e1)
        {
            System.out.println("Exception : "+e1);
        }
        catch(ArrayIndexOutOfBoundsException e2)
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
