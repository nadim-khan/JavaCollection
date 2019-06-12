package collection;
import java.util.*;

public class ArrDQ {
	public static void main(String[] args) {  
	    Deque<String> deque=new ArrayDeque<String>();  
	    deque.offer("arvind");  
	    deque.offer("vimal");  
	    deque.add("mukul"); 
	    deque.add("Amit");  
		deque.offerFirst("Vijay");  
		deque.add("Karan");  
		deque.add("Jai");  
		deque.add("Rahul"); 
	    deque.add("jai");
	    deque.add("jai");
	    deque.add("Rahul");   
	     System.out.println((deque.toString()).toUpperCase());
	    System.out.println("\nAfter offerFirst Traversal...");  
	    for(String s:deque){  
	        System.out.println(s.toUpperCase());  
	    }  
	    //deque.poll(); 
	    //deque.pollFirst();//it is same as poll() 
	    deque.pollLast();  
	    System.out.println("\nAfter pollLast() Traversal...");  
	    for(String s:deque){  
	        System.out.println(s);  
	    }  
	    deque.poll();  
	    System.out.println("\nAfter poll() Traversal...");  
	    for(String s:deque){  
	        System.out.println(s);  
	    } 
	}  
}
