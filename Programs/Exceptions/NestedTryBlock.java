package MyPackage.Exceptions;

public class NestedTryBlock {

	public static void main(String args[]){  
		try{  
			
			try{
				System.out.println("going to divide");  
				int b =39/0;  
			}catch(ArithmeticException e){
				System.out.println(e);
				}  

			try{  
				int a[]=new int[5];  
				a[5]=4;  
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("\n"+e+"\n\n");
				} throw new ArrayIndexOutOfBoundsException("----------Error bc [Throw Keyword]");

			/*System.out.println("\nother statement\n");
			String s=null;
			System.out.println(s.length());*/
			
		}catch(Exception e){
			System.out.println(e);
			System.out.println("\nhandeled\n");
			}
		finally{
			System.out.println("normal flow..Finally Block");  
		}

	}  


}
