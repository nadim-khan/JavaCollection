package MyPackage.Exceptions;

public class ThrowBlock{  
	void m(){  
		int data=50/0;  
	}  
	void n(){  
		m();  
	}  
	void p(){  
		try{  
			n();  
		}catch(Exception e){
			
			System.out.println(e+" ---- exception handled");
		}  
	}  
	public static void main(String args[]){  
		ThrowBlock obj=new ThrowBlock();  
		obj.p();  
		System.out.println("normal flow...");  
	}  
}