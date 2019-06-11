package MyPackage.IOStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream; 

public class FileOutPutBasic {
	public static void main(String args[]){
		try{
			String path="D:\\jaVaTextFileTest.cmd";
			FileOutputStream opObj=new FileOutputStream(path);
			String data="Java FileOutputStream is an output strqqeam used for writing data to a file.If you have to write primitive values into a file, use FileOutputStream class. You can write byte-oriented as well as character-oriented data through FileOutputStream class. But, for character-oriented data, it is preferred to use FileWriter than FileOutputStream.";
			byte dataFinal[]=data.getBytes(); 			
			opObj.write(dataFinal);
			opObj.close();	
			
			FileInputStream fin=new FileInputStream("D:\\jaVaTextFileTest.cmd");    
	           int i=0; 
	           System.out.print("The file consist of :  "+fin.available()+" Charecters \n\n");   
	           while((i=fin.read())!=-1){    
	            System.out.print((char)i);    
	           }    
	           fin.close(); 	           
	           
		}catch (Exception e){
			System.out.println(e+"\n-- Exception Occured ");
		
		}
		System.out.println("Success .. ");
	}    

}
