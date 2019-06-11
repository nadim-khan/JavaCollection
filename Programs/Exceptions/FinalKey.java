package MyPackage.Exceptions;
class cube{
	void cubeIt(final int n){		
		System.out.println("Cube of "+n+" : "+n*n*n);
	}
}
public class FinalKey {
	public static void main(String[] args){
		cube c1=new cube();
		c1.cubeIt(5);
	}

}
