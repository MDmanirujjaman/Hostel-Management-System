
package fileexample;

import java.util.*;
import java.io.*;
import java.io.IOException;
public class FileExample {
    

   
    public static void main(String[] args) throws FileNotFoundException  {
        
        Scanner input= new Scanner(System.in);
        String id,name,roll;
        int n;
        Formatter f = new Formatter("D:/Software Project -01/FileExample/monir.txt");
        System.out.println("Number of students :");
        n=input.nextInt();
        
        for(int i=0;i<n;i++){
            
        
        id=input.next();
        name=input.next();
        roll=input.next();
        f.format("%s %s %s\r\n",id,name,roll);}
        f.close();
        
       
         
                 
         
    
         
      
       
        

}
}
