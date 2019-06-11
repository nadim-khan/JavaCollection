package MyPackage;

public class CallByVal {
	static int data=50;  

	void change(int data){  
		data=data+100;//changes will be in the local variable only  
		System.out.println("On the class : "+data);
	}  

	public static void main(String[] args){  
		CallByVal obj =new CallByVal();  
		System.out.println("before change "+CallByVal.data);  
		obj.change(500);  
		System.out.println("after change "+CallByVal.data);  

	}  
}
