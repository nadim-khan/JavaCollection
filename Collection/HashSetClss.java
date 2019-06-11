package Collection;
import java.util.*;

public class HashSetClss {
	public static void main(String[] args){
		//HashSet<String> set=new HashSet<String>();
		//LinkedHashSet<String> set=new LinkedHashSet<String>();
		TreeSet<String> set=new TreeSet<String>();
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay"); 
		//System.out.println(set); 
		//set.add(null); // Linked Hash set allows null
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		System.out.println("No duplicates are allowed !! "); 
	}
}
