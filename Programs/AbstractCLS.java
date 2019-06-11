package MyPackage;
abstract class Shape{
	abstract void looks();
}
 class Circle extends Shape{
	 void looks(){
		System.out.println("Mai Hu Circle");
	}		
};
class Cylinder extends Shape{
	 void looks(){
		 System.out.println("Mai Hu Cylinder");
	}		
};
class Triangle extends Shape{
	 void looks(){
		 System.out.println("Mai Hu Trianngle");
	}		
};
public class AbstractCLS {
	public static void main(String[] args){
		Shape Obj1=new Circle();
		Obj1.looks();
		Shape Obj2=new Cylinder();
		Obj2.looks();
		Shape Obj3=new Triangle();
		Obj3.looks();
	}

}
