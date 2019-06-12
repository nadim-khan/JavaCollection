package collection;
import java.util.*;

public class TreeSetOperatn {
	  public static void main(String args[]){  
	  TreeSet<String> set=new TreeSet<String>();  
	         set.add("Afghj");  
	         set.add("Bvhj");  
	         set.add("Cvhj");  
	         set.add("Dfh");  
	         set.add("Jv");  
	         set.add("Fghj");  
	         set.add("Gghj");  
	         set.add("Hghj");  
	         set.add("Ixdfg");  
	         set.add("Ehh");  
	         System.out.println("\n\nInitial Set: "+set);
	         System.out.println("\nReverse Set: "+set.descendingSet());  
	         System.out.println("\nHead Set: "+set.headSet("Cvhj", true));  
	         System.out.println("\nSubSet: "+set.subSet("Afghj", true, "Hghj", true));  
	         System.out.println("\nTailSet: "+set.tailSet("C", false));  
	 }
}
