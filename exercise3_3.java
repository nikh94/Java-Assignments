

import java.util.Scanner;

public class exercise3_3 {
	public static void main(String[] args)
	{char ch;
do {	
		System.out.println("two type of equations with coefficients are ax+by=c and dx+ey=f");
		System.out.println("a,b,c,d,e and f are the coefficient of x,y and constant variable");
		Scanner input = new Scanner(System.in); 
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the value for a,b,c from the first equation ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		System.out.println("enter the value for d,e,f from the second equation ");
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		if((a*d)-(b*c)==0)
	    System.out.println("no solutions for these equations");
	    else
	    System.out.println("solution for these equations are x and y");
		double x,y;
		x=(e*d-b*f)/(a*d-b*c);
		y=(a*f-e*c)/(a*d-b*c);
		System.out.println("value of x is " + x + " and y is " + y);
		System.out.println("press 1 to continue or any key to exit");
		ch=reader.next().charAt(0);
}while(ch=='1');

}
}

