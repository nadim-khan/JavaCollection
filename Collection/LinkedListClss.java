package Collection;
import java.util.*;

public class LinkedListClss {

	public static void main(String[] args){
		 LinkedList<String> lst=new LinkedList<String>();// Creating array list with lst object.
		 lst.add("Nadeem");
		 lst.add("Nadeem1");
		 lst.add("Nadeem3");
		 lst.add("Nadeem5");
		 Iterator iter=lst.iterator();
		 while(iter.hasNext()){
			 System.out.println(iter.next());
		 }
	}


}

