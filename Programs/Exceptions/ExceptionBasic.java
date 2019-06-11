package MyPackage.Exceptions;

public class ExceptionBasic {  
	  public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int data=100/0;  
		      System.out.println("rest of the code...");  
		   }catch(Exception e){
			   System.out.println(e);
			   System.out.println("rest of the code...");}  
		   //rest code of the program   
		     
		  }
	  
		}
 