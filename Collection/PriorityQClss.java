package collection;
import java.util.*; 

public class PriorityQClss {

	public static void main(String[] args){  
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul"); 
		System.out.println("Users List : "+queue+"\n");
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("\nIterating the queue elements:");  
		queue.forEach(x->System.out.println(x));
		queue.remove();  
		queue.poll();  
		System.out.println("\nAfter removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}  
	}  

}