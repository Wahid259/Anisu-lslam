package beginnerjava;

public class MathDemo {
    
    public static void main(String[] args) {
        
        int x = 2;
        int y = 3;
        
        int max = Math.max(x, y);
        System.out.println("Maximum = "+max);
        
        int min = Math.min(x, y);
        System.out.println("Minimum = "+min);
        
        int absoulte = Math.abs(y);
        System.out.println("Absoulte of y = "+absoulte);
        
        double power = Math.pow(x, y);
        System.out.println("x to the power y = "+power);
        
        int round = Math.round(8.8f);
        System.out.println("Round of 8.8 = "+round);
        
        double pi = Math.PI;
        System.out.println("pi = "+pi);
        
        
    }
    
}
