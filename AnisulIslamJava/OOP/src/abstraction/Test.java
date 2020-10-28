
package abstraction;

public class Test {
    public static void main(String[] args) {
        /*abstract class er object create kora jai na
        refetance tori kkora jai
        */
        
        MobileUser mu; //referance variable
        mu = new Rahim();
        mu.sendMessage();
        
        mu = new Karim();
        mu.sendMessage();
    }
    
}
