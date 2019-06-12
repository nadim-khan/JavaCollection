package collection;
import java.util.*;

public class TreeSetClss {
	public static void main(String[] args){
		TreeSet<Integer> set=new TreeSet<Integer>();
		set.add(25);
		set.add(20);
		set.add(35);
		set.add(35);
		 System.out.println("Highest Value: "+set.pollFirst());  
         System.out.println("Lowest Value: "+set.pollLast());  
	}
}
