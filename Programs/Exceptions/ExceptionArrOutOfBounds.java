package MyPackage.Exceptions;

public class ExceptionArrOutOfBounds {
	  
	  
    public static void main(String[] args) {  
        try  
        {
        	//String s= null;
        	//System.out.println(s.length());//may throw exception  
        	//int data=50/0;//may throw exception  
        int arr[]= {1,3,5,7};  
        System.out.println(arr[10]); //may throw exception   
        }  
            // handling the array exception  
        catch(Exception e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("rest of the code");  
    }  
      


}
