
package average;
import java.nio.file.*;
import java.io.*;
import java.io.IOException;
import java.nio.file.attribute.*;
import static java.nio.file.AccessMode.*;
import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;
public class Average {

    public static void main(String[] args) {
        Path file = Paths.get("C:\\Users\\cp12b-ictb-13\\Desktop\\abby\\grades.txt");
        Path file2 = Paths.get("C:\\Users\\cp12b-ictb-13\\Desktop\\abby\\average.txt");
        InputStream input= null;
        
        String print = "";
        byte[] data = print.getBytes();
        OutputStream output = null;
        
        try{
            output = new BufferedOutputStream(Files.newOutputStream(file2, CREATE));
            
            output.write(data);
            output.flush();
            output.close();
        }catch(Exception e){
            System.out.println(e);
            
        }
        
        try{
            input = Files.newInputStream(file);
        BufferedReader br = new BufferedReader (new InputStreamReader (input));
        
        String s = null;
        int line = 0;
        String a = System.lineSeparator();
        
        while( (s = br.readLine()) != null){
            if(line == 3 || line == 4 || line == 5){
                String [] grades = s.split(",");
                
                String name = grades[0];
                int grade1 = Integer.parseInt(grades [1]);
                int grade2 = Integer.parseInt(grades [2]);
                int grade3 = Integer.parseInt(grades [3]);
                double average = (grade1 + grade2+ grade3) / 3;
                
                String print1 = name + " average " + average + ""+ a;
                
                byte[] dataa = print1.getBytes();
                OutputStream output1 = null;
                
                try{
                    
            output1 = new BufferedOutputStream(Files.newOutputStream(file2, APPEND));
            
            output1.write(dataa);
            output1.flush();
            output1.close();
           
        
        }catch(Exception e){
            System.out.println(e);
    }  
            }
                line += 1;
              }
              input.close();
        
               }catch(Exception e){
            System.out.println(e);
    
    }
}

}