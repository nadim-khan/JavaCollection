package MyPackage;

public class Recursion_Fibonacci {  
    static int n1=0,n2=1,n3=0;      
     static void printFibo(int count){      
        if(count>0){      
             n3 = n1 + n2;      
             n1 = n2;      
             n2 = n3;      
             System.out.print(" \n"+n3);     
             printFibo(count-1);      
         }      
     }        
  
public static void main(String[] args) {  
    int count=250;      
      System.out.print(n1+"\n"+n2);//printing 0 and 1      
      printFibo(count-2);//n-2 because 2 numbers are already printed     
}  
}  