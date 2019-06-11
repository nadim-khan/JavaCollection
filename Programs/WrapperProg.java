package MyPackage;
public class WrapperProg{    
	
public static void main(String args[]){    
//Converting Integer to int   
	
Integer a=new Integer(3); 

int i=a.intValue();//converting Integer to int  
int j=a;//unboxing, now compiler will write a.intValue() internally    
 System.out  .println("**********************\nObject to Integer\n**********************");
System.out.println(a+" (object, //Integer a=new Integer(3);),\n"+i+" (Convrted to int,//int i=a.intValue();),\n"+j+" (converted internally by compiler,//int j=a;) ");

//Converting int into Integer  
int x=20;  
Integer y=Integer.valueOf(x);//converting int into Integer  
Integer z=x;//autoboxing, now compiler will write Integer.valueOf(a) internally  
System.out  .println("\n\n\n**********************\nInteger to Object\n**********************");
System.out.println(a+" (Integer,//int x=20; ),\n"+y+" (Converted Value,//Integer y=Integer.valueOf(x);) \n"+z+" (Converted by compiler,//Integer z=x;)");  
}}    