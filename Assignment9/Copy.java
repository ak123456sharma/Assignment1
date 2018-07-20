
	package as8;





	import java.util.*;
	import java.io.*;

	public class Copy {

		public static void main(String[] args) throws IOException {
		
			//File Class
			
			File f = new File("C:\\Users\\akash hp\\Contacts\\Desktop\\Assignment1\\Assignment1\\abc.txt");
	        if(!f. exists())
	        f.createNewFile();
	        int n; 
	        FileInputStream fin=new FileInputStream("C:\\Users\\akash hp\\Contacts\\Desktop\\Assignment1\\Assignment1\\abc.txt");
	        FileOutputStream fout=new FileOutputStream("C:\\Users\\akash hp\\Contacts\\Desktop\\Assignment1\\Assignment1\\xyz.txt");
	        byte b[]=new byte[10];
	        n=fin.read(b);
	        System.out.println(n);
	        while(n!=-1)
	        {
	            fout.write(b,0,n); //write(String str,int off,int len)
	            n=fin.read(b);
	            }
	        fin.close();
	        fout.close();
	        
	        
	        

	        
		File f1 = new File("C:\\Users\\akash hp\\Contacts\\Desktop\\Assignment1\\Assignment1\\xyz.txt");
		BufferedReader br = new BufferedReader(new FileReader(f1));
	    
	    String st1;
	    while ((st1 = br.readLine()) != null)
	      System.out.println(st1);
		}
	}

