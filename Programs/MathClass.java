package MyPackage;

public class MathClass {
	public static void main(String[] args){
		int x=20;
		int y=2;
		double a = 30;
		double b = Math.toRadians(a); 
		
		System.out.println("*************************\nBasic maths\n*************************");
		System.out.println("x = 20 \ny= "+y+"\n\n");
		System.out.println("Maximum in x: "+x+" and y: "+y+" is = "+Math.max(x, y));
		System.out.println("Minium in x: "+x+" and y: "+y+" is = "+Math.min(x, y));
		System.out.println("Power of x: "+x+" to y: "+y+" is = "+Math.pow(x, y));
		System.out.println("Logarithm in x (log e) of: "+x+" is = "+Math.log(x));
		System.out.println("logarith in x (log 10) is = "+Math.log10(x));
		System.out.println("Square root of  in x: "+x+" is = "+Math.sqrt(x));
		System.out.println("\n\n*************************\nAdvance maths\n*************************");
		System.out.println("a = 30 \nb= "+b+"(Radian of a=30)\n\n");
		System.out.println("Sine value of a is: " +Math.sin(a));
		System.out.println("CoSine value of a is: " +Math.cos(a));
		System.out.println("Tangent value of a is: " +Math.tan(a)); 
	      
        // return the trigonometric arc sine of a      
        System.out.println("trigonometric arc Sine value of a is: " +Math.asin(a));    
          
        // return the trigonometric arc cosine value of a  
        System.out.println("trigonometric arc Cosine value of a is: " +Math.acos(a));  
          
        // return the trigonometric arc tangent value of a  
        System.out.println("trigonometric arc Tangent value of a is: " +Math.atan(a));  
  
        // return the hyperbolic sine of a      
        System.out.println("hyperbolic Sine value of a is: " +Math.sinh(a));    
          
        // return the hyperbolic cosine value of a  
        System.out.println("hyperbolic Cosine value of a is: " +Math.cosh(a));  
          
        // return the hyperbolic tangent value of a  
        System.out.println("hyperbolic Tangent value of a is: " +Math.tanh(a)); 
	}
	
}
