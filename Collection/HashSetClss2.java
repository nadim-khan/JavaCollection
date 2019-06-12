package collection;
import java.util.HashSet;

public class HashSetClss2 {
	public static void main (String[] args){
		HashSet <String> set=new HashSet<String>(); 
		 set.add("Ravi");  
         set.add("Vijay");  
         set.add("Arun");  
         set.add("Sumit");  
         System.out.println("An initial list of elements: "+set); 
         set.remove("Ravi");  
         System.out.println("Updated list of elements: "+set);
         set.removeAll(set);  
         System.out.println("Final list of elements: "+set);
	}

}
 