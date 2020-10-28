
package file3;

import java.io.File;
import java.util.Scanner;

public class FileDemo3 {
    public static void main(String[] args) {
        
        try{
            File file = new File("D:/AnisulIslamJava/OOP/Person/student.txt");
            Scanner scanner = new Scanner(file);
            
            while(scanner.hasNext()){
                //1 ta 1 ta kore word neci, space thakar por aro word
                String id = scanner.next();
                String name = scanner.next();
                System.out.println("ID : "+id +" Name : "+name);
            }
            scanner.close();
            
        }catch(Exception e){
            System.out.println(e);
            
        }
    }
    
}
