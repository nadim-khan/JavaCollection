package MyPackage.Exceptions;
import java.io.IOException;

public class ThrowsKey {
	void m()throws IOException{  
		throw new IOException("device error");//checked exception  
	}  
	void n()throws IOException{  
		m();  
	}  
	void p(){  
		try{  
			n();  
		}catch(Exception e){
			System.out.println(e+"\nexception handled");
			
			}  
	}  
	public static void main(String args[]){  
		ThrowsKey obj=new ThrowsKey();  
		obj.p();  
		System.out.println("normal flow...");  
	}  

}

