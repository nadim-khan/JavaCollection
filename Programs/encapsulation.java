package MyPackage;
//A Account class which is a fully encapsulated class.  
//It has a private data member and getter and setter methods.  
class Account {  
	//private data members  
	private long acc_no=112233;  
	private String name,email;  
	private float amount;  
	//public getter and setter methods  
	public long getAcc_no() {  
		return acc_no;  
	}  
	public void setAcc_no(long acc_no) {  
		this.acc_no = acc_no;  
	}  
	public String getName() {  
		return name;  
		//System.out.println(name); 
	}  
	public void setName(String name) {  
		this.name = name;  
	}  
	public String getEmail() {  
		return email;  
	}  
	public void setEmail(String email) {  
		this.email = email;  
	}  
	public float getAmount() {  
		return amount;  
	}  
	public void setAmount(float amount) {  
		this.amount = amount;  
	}  

}  

//A Java class to test the encapsulated class Account.  
public class encapsulation {  
	public static void main(String[] args) {  
		//creating instance of Account class  
		Account acc=new Account();  
		//setting values through setter methods  
		acc.setAcc_no(7560504000L);  
		acc.setName("Sonoo Jaiswal");  
		acc.setEmail("sonoojaiswal@javatpoint.com");  
		acc.setAmount(500000f);  
		//getting values through getter methods  
		System.out.println("Account No. :- "+acc.getAcc_no()+" \nName :- "+acc.getName()+" \nEmail :- "+acc.getEmail()+" \nAmount :- "+acc.getAmount());  
	}  
}  
