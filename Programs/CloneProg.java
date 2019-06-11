package MyPackage;
class CloneProg implements Cloneable{  
	int rollno;  
	String name; 
	CloneProg(int rollno,String name){  
		this.rollno=rollno;  
		this.name=name;  
		System.out.println("Inside Parent Class Block ");
	}  
	{System.out.println("Inside Initialization Block ");}

	public Object clone()throws CloneNotSupportedException{ 
		System.out.println("Inside clone ");
		return super.clone();  		
	}  

	public static void main(String[] args){  
		try{  
			System.out.println("************************\nSequence of invocation\n************************ ");
			CloneProg s1=new CloneProg(101,"amit");  
			CloneProg s2=(CloneProg)s1.clone();  
			System.out.println("----------------------Cloning the objects... ");
			System.out.println(s1.rollno+" "+s1.name);  
			System.out.println(s2.rollno+" "+s2.name);  

		}catch(CloneNotSupportedException c){
			System.out.println("Inside catch Block ");
		}  

	}  
}  
