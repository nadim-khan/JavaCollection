package Collection;
import java.util.*;

public class ArrDeque {
	  
	public static void main(String[] args) {  
		int count=0;
	//Creating Deque and adding elements  
	Deque<String> deque = new ArrayDeque<String>();  
	deque.add("Gautam");  
	deque.add("Karan");  
	deque.add("Ajay");  
	deque.add("Gautam");  
	deque.add("Karan");  
	deque.add("Ajay");
	//Traversing elements  
	for (String str : deque) {  
		 count++;
		 try{
			 Thread.sleep(500);
		 }catch(Exception e){
			 System.out.println("Exception Occured");
		 }finally{
			 System.out.println(count+". "+str);
		 }
	 
	}  
	}  

}
