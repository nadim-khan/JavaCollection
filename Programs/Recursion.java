package MyPackage;

public class Recursion { 
	static int count=0;
	static void p(){  
		count=count+1;	
		System.out.println("hello : "+count);  
		if(count<1000)
		p();  
		
	}  

	public static void main(String[] args) {  
		p();  
	}  
} 
