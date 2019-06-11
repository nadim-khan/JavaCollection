package MyPackage;
//The interface in Java is a mechanism to achieve abstraction.
//There can be only abstract methods in the Java interface, not method body.
/*It is used to achieve abstraction.
By interface, we can support the functionality of multiple inheritance.
It can be used to achieve loose coupling.*/

interface chaman{
	abstract void WhereAreYou();
}
interface basicInterface1 /*extends chaman*/ {	
	abstract void WhoAreYou();
}

/*class Kutta implements basicInterface1{*/
class Kutta implements basicInterface1 ,chaman{
	public void WhoAreYou(){
		System.out.println("I am Kutta");
	}
	public void WhereAreYou(){
		System.out.println("I am @Kothrud");
	}
}
 class basicInterface {
	 public static void main(String[] args){
		/* basicInterface1 obj=new Kutta();*/
		 Kutta obj1=new Kutta();
		 obj1.WhoAreYou();
		 obj1.WhereAreYou();
	 }
 }