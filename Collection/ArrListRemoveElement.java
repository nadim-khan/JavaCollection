package Collection;
import java.util.*;
public class ArrListRemoveElement {public static void main(String [] args)  
{  
    ArrayList<String> al=new ArrayList<String>();  
    al.add("Ravi");    
    al.add("Vijay");    
    al.add("Ajay");   
    al.add("Anuj");  
    al.add("Gaurav");  
    System.out.println("\nAn initial list of elements:\n\t "+al);   
    //Removing specific element from arraylist  
    al.remove("Vijay");  
    System.out.println("\nAfter invoking remove(object) method:\n\t "+al);   
    //Removing element on the basis of specific position  
    al.remove(0);  
    System.out.println("\nAfter invoking remove(index) method:\n\t "+al);   
      
    //Creating another arraylist  
    ArrayList<String> al2=new ArrayList<String>();    
    al2.add("Ravi");    
    al2.add("Hanumat");    
    //Adding new elements to arraylist  
    al.addAll(al2);  
    System.out.println("\nUpdated list :\n\t "+al);   
    //Removing all the new elements from arraylist  
    al.removeAll(al2);  
    System.out.println("\nAfter invoking removeAll() method: \n\t"+al);   
    //Removing elements on the basis of specified condition  
    al.removeIf(str -> str.contains("Ajay"));   //Here, we are using Lambda expression   
    System.out.println("\nAfter invoking removeIf() method:\n\t "+al);  
    //Removing all the elements available in the list  
    al.clear();  
    System.out.println("\nAfter invoking clear() method:\n\t "+al);   
 }  }

