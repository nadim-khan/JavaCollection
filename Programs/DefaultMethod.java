package MyPackage;
//we can have method body in interface. But we need to make it default method
//we can have static method in interface.

interface Drawable{  	
	void draw();  	
	default void msg(){
		System.out.println("default method");
		}  
	static int cube(int x){
		return x*x*x;
		} ///Static method in interface
}

class Rectangle implements Drawable{  
	public void draw(){
		System.out.println("drawing rectangle");
		}  
}  

class DefaultMethod{  
	public static void main(String args[]){  
		Drawable d=new Rectangle();  
		d.draw();  
		d.msg();
		System.out.println("Cube of 3 is :"+Drawable.cube(3)+ " \n\t(calculated using Static method with default method in interface).");  
	}}  