package MyPackage.IOStreams;
import java.io.FileInputStream; 

public class InputStreamBasic {
	  
    public static void main(String args[]){    
         try{    
           FileInputStream fin=new FileInputStream("D:\\jaVaTextFileTest.cmd");    
           int i=0; 
           System.out.print("Estimated number of bytes/Charecters :  "+fin.available()+"\n");   
           while((i=fin.read())!=-1){    
            System.out.print((char)i);    
           }    
           fin.close();    
         }catch(Exception e){
        	 System.out.println(e);
        	 }    
        }    
       
}