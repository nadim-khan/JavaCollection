package MyPackage;

public class MultyCatchBlock {
	  
	  
    public static void main(String[] args) {  
          
           try{    
        	   /*String s=null;  
               System.out.println(s.length()); //Parent Exception occurs  */
        	   
        	/*   int c[]={1,2,3,4,5};
        	   System.out.println(c[10]); //ArrayIndexOutOfBounds Exception occurs */
        	   
                int a[]=new int[5];    
                a[5]=30/0;    //Arithmetic Exception occurs 
               }    
               catch(ArithmeticException e)  
                  {  
                   System.out.println("Arithmetic Exception occurs");  
                  }    
               catch(ArrayIndexOutOfBoundsException e)  
                  {  
                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
                  }    
               catch(Exception e)  
                  {  
                   System.out.println("Parent Exception occurs");  
                  }             
               System.out.println("rest of the code");    
    }  


}
