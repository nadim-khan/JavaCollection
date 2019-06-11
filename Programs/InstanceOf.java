package MyPackage;
interface Printable{
	} 


class A implements Printable{  
	public void a(){
		System.out.println("Object is Instance of A method");
		}  
}  


class B implements Printable{  
	public void b(){
		System.out.println("Object is Instance of B method");
		}  
}  


class Call{  
	void invoke(Printable p){//upcasting  
		if(p instanceof A){  
			A a=(A)p;//Downcasting   
			a.a();  
		}  
		if(p instanceof B){  
			B b=(B)p;//Downcasting   
			b.b();  
		}  
		 

	}  
	void invoke1(Printable q){//upcasting  
		if(q instanceof A){  
			A a=(A)q;//Downcasting   
			a.a();  
		}  
		if(q instanceof B){  
			B b=(B)q;//Downcasting   
			b.b();  
		} 
		 

	}  
	
}//end of Call class  



class InstanceOf{  
	public static void main(String args[]){  
		Printable p=new B(); 
		Printable q=new A();
		Call c=new Call();  
		c.invoke(p); 
		c.invoke1(q);
	}  
}  