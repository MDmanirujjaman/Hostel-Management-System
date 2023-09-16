
package file;

import java.io.File;
import java.io.IOException;

public class FileCreat {
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("amirjan");
        File f = new File("student.txt");
        f.createNewFile();
        System.out.println("File Exists :"+f.exists());
        
    }
}
