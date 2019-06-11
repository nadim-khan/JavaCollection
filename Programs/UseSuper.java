package MyPackage;
class Animal{  
	
	Animal(){
		System.out.println("Mai Constructor hu !! Bhosdiwale....Sabse pehle aaunga");
	}
	String colr="white";  
	void xyz(){
		System.out.println("The Animal Class");
	}
} 
class Dog extends Animal{ 
	Dog(){
		super();
	}
	
	String colr="black";  
	
	void printColor(){ 		
		System.out.println(colr);
		System.out.println(super.colr);///Call parent class data member 		
		super.xyz();//to call parent class method
		
	}  
}  

public class UseSuper {
	public static void main(String args[]){  
		Dog d=new Dog();  
		//d.constru();
		d.printColor();  
	}
}
