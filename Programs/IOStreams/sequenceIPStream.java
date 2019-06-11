package MyPackage.IOStreams;
import java.io.*;

public class sequenceIPStream {
	public static void main(String[] args)throws Exception{
		FileInputStream ip1=new FileInputStream("D:\\jaVaTextFileTest.cmd");
		FileInputStream ip2=new FileInputStream("D:\\jaVaTextFileTest.cmd");
		SequenceInputStream seq1=new SequenceInputStream(ip1,ip2);
		FileOutputStream op=new FileOutputStream("D:\\SequenceInputStream.txt");
		 int i;
		 while((i=seq1.read())!=-1){
			 op.write(i);
			// System.out.println((char)i);
		 }
		 ip1.close();
		 ip2.close();
		 seq1.close();
		 op.flush();
		 op.close();
		 
	}
}
