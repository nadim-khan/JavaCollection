package MyPackage;
class Animal1{  
 void eat(){
	 System.out.println("animal is eating...");
	 }  
}  
  
class Binding extends Animal1{  
	//Binding c=(Binding)new Animal1();/*///Type casting of parent class....*/
 void eat(){
	 
	 System.out.println("dog is eating...");
	 }  
  
 public static void main(String args[]){  
  Animal1 a=new Binding();  //Upcasting - Object of dog class is also of type Animal(Parent class)...
  Binding b=new Binding();
  System.out.println("Downcasting applied : "+(a instanceof Binding));//Instance of  operator
  System.out.println("Downcasting applied : "+(b instanceof Animal1));
  a.eat();  
  // Subclass type refers to the object of Parent class, it is known as downcasting.
  

 }  
} 