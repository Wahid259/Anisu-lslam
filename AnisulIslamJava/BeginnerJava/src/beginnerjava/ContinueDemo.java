
package beginnerjava;

public class ContinueDemo {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            
            if(i == 10){
                continue;
                /* 10 er sathe match hoyese tai 10 ta print kore ne
                    10 bad a 100 porjonto print korece
                */
                // sudu Loop er khetray use kora hoi
            }
            System.out.println(i);
            
        }
    }
    
}
