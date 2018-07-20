package as8;





import java.util.*;
import java.io.*;

public class WriteFile {

	public static void main(String[] args) throws IOException {
	
		//File Class
		
		File f = new File("C:\\Users\\akash hp\\Contacts\\Desktop\\Assignment1\\Assignment1\\abc.txt");
        if(!f. exists())
        f.createNewFile();
       
        
        System.out.println("Length="+f.length()+" bytes");
        System.out.println("Name="+f.getName());
        System .out. println("Parent="+f .getParent() );
        System .out. println("Path=" +f. getPath() );
        System.out.println("Absolute Path="+f.getAbsolutePath());
        
        
       
        BufferedReader br = new BufferedReader(new FileReader(f));
       
        String st;
        while ((st = br.readLine()) != null)
          System.out.println(st);
        }

	}


