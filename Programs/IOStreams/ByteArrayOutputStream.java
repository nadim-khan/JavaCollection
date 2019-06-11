package MyPackage.IOStreams;
import java.io.*; 
import java.io.FileInputStream.*;
import java.io.FileOutputStream.*;

public class ByteArrayOutputStream {
	  
	public static void main(String args[])throws Exception{    
		FileInputStream fin=new FileInputStream("D:\\jaVaTextFileTest");
	      FileOutputStream fout1=new FileOutputStream("D:\\ByteArrayOutputStream1.txt");    
	      FileOutputStream fout2=new FileOutputStream("D:\\ByteArrayOutputStream2.txt"); 	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream(); 
	    //  bout.write(fin);
	     /* bout.write(fin);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect    
*/	      System.out.println("Success...");    
	     }

	    
}
   