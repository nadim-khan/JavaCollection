package MyPackage.IOStreams;
import java.io.*;

public class BufferedOutputStream {
	public static void main(String[] s) throws Exception{
		FileOutputStream fout=new FileOutputStream("D:\\jaVaTextFileTest.cmd");
		BufferedOutputStream bout=new BufferedOutputStream();
		String k="Welcome to javaTpoint.";    
	     byte b[]=k.getBytes();   
	     fout.write(b);
	    /* bout.write(b); 
	     bout.flush();
	     bout.close();*/
	     fout.close();
	     System.out.println("success");   
	}

	

}
