
import java.util.Scanner;
public class exercise3_32 {

	public static void main(String[] args)
	{
		char ch;
		do{
		Scanner input=new Scanner(System.in);
		Scanner reader=new Scanner(System.in);
		System.out.println("enter the value of x-cordinate & y-cordinate for first point p0");
		double x0=input.nextDouble();
		double y0=input.nextDouble();
		System.out.println("enter the value of x-cordinate & y-cordinate for second point p1");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		System.out.println("enter the value of x-cordinate & y-cordinate for third point p2");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		if((x1-x0)*(y2-y0)-(x2 - x0)*(y1-y0)>0)
		{
			System.out.println("p2 lies on the left side from the line p0 to p1");		
		}
		else if((x1-x0)*(y2-y0)-(x2 - x0)*(y1-y0)==0)
		{
			System.out.println("p2 lies is on the same line from p0 to p1");	
			
	}
	else if((x1-x0)*(y2-y0)-(x2 - x0)*(y1-y0)<0)
	{
		System.out.println("p2 lies on the right side from the line p0 to p1");		
	}System.out.println("press 1 to continue or any key to exit");
	ch=reader.next().charAt(0);
		}while(ch=='1');
	}
}
