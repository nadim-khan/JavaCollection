package MyPackage;
class superrr{
	superrr(){
		System.out.println(" Parent Class Invoked ");
	}	
}

class aaa extends superrr{
	aaa(){
		super();
		System.out.println(" child Class Invoked ");
	}
	{
		System.out.println(" Initialization block Invoked ");
	}
void call_me(){
	System.out.println(" call me aaa ");
	}
}
class bbb extends aaa{
	void call_me(){
		System.out.println(" call me bbb ");
	}
}

public class Super_Constructor {
	public static void main(String[] args){		
		aaa obj=new aaa();
		obj.call_me();
	}
}
