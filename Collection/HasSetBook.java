package collection;
import java.util.*; 
class Bookie {  
	int id;  
	String name,author,publisher;  
	int quantity;  
	public Bookie(int id, String name, String author, String publisher, int quantity) {  
		this.id = id;  
		this.name = name;  
		this.author = author;  
		this.publisher = publisher;  
		this.quantity = quantity;  
	}  
}  
public class HasSetBook {  
	public static void main(String[] args) {  
		HashSet<Bookie> set=new HashSet<Bookie>();  
		//Creating Books  
		Bookie b1=new Bookie(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		Bookie b2=new Bookie(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		Bookie b3=new Bookie(103,"Operating System","Galvin","Wiley",6);  
		//Adding Books to HashSet  
		set.add(b1);  
		set.add(b2);  
		set.add(b3);  
		
		//Traversing HashSet  
		for(Bookie b:set){  
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
		}  
		//Bookie.remove("Let us C");
	}  
}


