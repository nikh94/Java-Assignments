import java.util.Scanner;

public class trianglearea {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("enter the value of 1st point on triangle ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
	    System.out.println("enter the value of 2nd point on triangle");
	    double x2=input.nextDouble();
	    double y2=input.nextDouble();
	    System.out.println("enter the value of 3rd point on triangle");
	    double x3=input.nextDouble();
	    double y3=input.nextDouble();
		double a1,b1,s1;
		a1=x2-x1;
		b1=y2-y1;
	    s1=Math.pow((Math.pow(a1, 2)+Math.pow(b1,2)),0.5);
	    System.out.println("side 1 value is " + s1);
	    double a2,b2,s2;
		a2=x3-x2;
		b2=y3-y2;
	    s2=Math.pow((Math.pow(a2, 2)+Math.pow(b2,2)),0.5);
	    System.out.println("side 2 value is " + s2);
	    double a3,b3,s3;
		a3=x1-x3;
		b3=y1-y3;
	    s3=Math.pow((Math.pow(a3, 2)+Math.pow(b3,2)),0.5);
	    System.out.println("side 3 value is " + s3);
	    double s,area;
	    s=(s1+s2+s3)/2;
	    area=Math.pow((s*(s-s1)*(s-s2)*(s-s3)),0.5);
	    System.out.println("area of triangle is " + area );
	    
	    
	    
	
	
	
	
	}
}
