
package file1;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {

        File dir = new File("Person");
        dir.mkdir(); //girectory will be created
        String path = dir.getAbsolutePath();

        File file1 = new File(path+"/student.txt");
        File file2 = new File(path+"/teacher.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
    }
    
}
