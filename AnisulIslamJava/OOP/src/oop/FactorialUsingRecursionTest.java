package oop;

public class FactorialUsingRecursionTest {

    public static void main(String[] args) {

        FactorialUsingRecursion ob = new FactorialUsingRecursion();
        
        int result = ob.fact(5);
        System.out.println("Factorial of 5 = " + result);

        result = ob.fact(4);
        System.out.println("Factorial of 4 = " + result);
    }

}
