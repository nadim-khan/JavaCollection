package MyPackage;
class OneClass{
	void runThis(){		
		System.out.println("Paren Class called ");		
	}
	float getRateOfInterest(){
		return 0;
		}  
}
class SecondClass extends OneClass{
	@Override
	void runThis(){
		System.out.println("Child Class called ");		
	}
}

class SBI extends OneClass{ 
	@Override
	float getRateOfInterest(){
		return 8.4f;
		}  
}  
class ICICI extends OneClass{ 
	@Override
	float getRateOfInterest(){
		return 7.3f;
		}  
}  
class AXIS extends OneClass{  
	@Override
	float getRateOfInterest(){
		return 9.7f;
		}  
}  


public class RuntimePolyMorph {
	public static void main(String[] args){
		OneClass obj1=new SecondClass(); // reference object of class OneClass declared as Object of class SecondClass
		obj1.runThis();
		/*SecondClass obj2=(SecondClass) new OneClass();
		obj2.runThis();*/
		System.out.println("******************************\n Banking Example(Runtime Polymorphism) \n******************************  ");
		OneClass b;  
		b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest()); 
	}
}
