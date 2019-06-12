package collection;
import java.util.*; 

class Booky implements Comparable<Booky>{  
	int id;  
	String name,author,publisher;  
	int quantity;  
	public Booky(int id, String name, String author, String publisher, int quantity) {  
		this.id = id;  
		this.name = name;  
		this.author = author;  
		this.publisher = publisher;  
		this.quantity = quantity;  
	}  
	public int compareTo(Booky b) {  
		if(id>b.id){  
			return 1;  
		}else if(id<b.id){  
			return -1;  
		}else{  
			return 0;  
		}  
	}  
} 
public class TreeBooky {

	public static void main(String[] args) {  
		Set<Booky> set=new TreeSet<Booky>();  
		//Creating Bookys  
		Booky b1=new Booky(121,"Let us C","Yashwant Kanetkar","BPB",8);  
		Booky b2=new Booky(233,"Operating System","Galvin","Wiley",6);  
		Booky b3=new Booky(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		//Adding Bookys to TreeSet  
		set.add(b1);  
		set.add(b2);  
		set.add(b3);  
		//Traversing TreeSet  
		for(Booky b:set){  
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		}  
	}  

}


