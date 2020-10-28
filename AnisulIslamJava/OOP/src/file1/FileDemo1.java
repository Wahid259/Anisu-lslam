
package file1;

import java.io.File;

public class FileDemo1 {
    public static void main(String[] args) {
        
        File dir = new File("C:/Users/HP/Desktop/Person");
        dir.mkdir(); //girectory will be created
        String dirlocation = dir.getAbsolutePath();
        System.out.println(dirlocation);
        System.out.println(dir.getName());
        
        if(dir.delete())
        {
            System.out.println(dir.getName()+"folder has been deleted");
        }
        
    }
    
}
