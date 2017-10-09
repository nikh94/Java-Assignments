import java.util.Scanner; 

public class Twopoints {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("enter the value of points line 1 ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
	    System.out.println("enter the value of points line 2");
	    double x2=input.nextDouble();
	    double y2=input.nextDouble();
		double a,b;
		a=x2-x1;
		b=y2-y1;
		double S1,S2;
		S1=Math.pow(a,2);
		S2=Math.pow(b,2);
	    double S;
	    S=Math.pow((S1+S2),0.5);
	    System.out.println("distance b/w the lines is  " + S );
	    
		
		
		
	
	}

}
