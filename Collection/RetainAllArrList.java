package collection;
import java.util.*;  

public class RetainAllArrList {
	  
	 public static void main(String args[]){  
	  ArrayList<String> al=new ArrayList<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ajay");  
	  System.out.println("Array List 1 : "+al);
	  ArrayList<String> al2=new ArrayList<String>();  
	  al2.add("Ravi");  
	  al2.add("Hanumat");  
	  al2.add("Ajay");
	  al2.add("Nadeem");
	  System.out.println("Array List 2 : "+al2);
	  System.out.println("Gettting 2nd item using get() : "+al2.get(1));//Get method
	  System.out.println("Changing "+al2.set(1, "Santosh")+" using set() to "+al2.get(1));//setMethod
	  System.out.println("Array List 2 : "+al2);
	  al.retainAll(al2);  
	  System.out.println("\nIterating the elements after retaining the elements of List 2");  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  

}
 