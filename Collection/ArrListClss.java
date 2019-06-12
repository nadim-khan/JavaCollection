package collection;
import java.util.*;

class ArrListClss{
	public static void main(String[] args){
		int count=0;
		 ArrayList<String> lst=new ArrayList<String>();// Creating array list with lst object.
		 lst.add("Nadeem");
		 lst.add("Nadeem1");
		 lst.add("Nadeem3");
		 lst.add("Nadeem5");
		 lst.add("Vijay");  
		 lst.add("Ravi");  
		 lst.add("Ajay");  
		 lst.add("Nadeem");
		 lst.add("Nadeem1");
		 lst.add("Nadeem3");
		 lst.add("Nadeem5");
		 lst.add("Vijay");  
		 lst.add("Ravi");  
		 lst.add("Ajay");  
		 Iterator<String> iter=lst.iterator();
		 while(iter.hasNext()){
			 count++;
			 try{
				 Thread.sleep(500);
			 }catch(Exception e){
				 System.out.println("Exception Occured");
			 }finally{
				 System.out.println(count+". "+iter.next());
			 }
		 }
	}
}