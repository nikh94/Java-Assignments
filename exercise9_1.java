package exercise9_1;
import java.util.Scanner;

public class exercise9_1 {

	static boolean option=true;
	public static void main(String[] args) throws Exception
	{
		while(option)
			run();
	}
	public static void run() throws Exception
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("This is a program to print area and perimeter of rectangle with given width and height");
			System.out.print("Enter the width of the rectangle \n");
			double width = sc.nextDouble();
			System.out.print("Enter the height of the rectangle \n");
			double height = sc.nextDouble();

			rectangle a= new rectangle(width,height);

			System.out.println("\nThe width of the rectangle is "+a.getWidth()+" units");
			System.out.println("The height of the rectangle is "+a.getHeight()+" units");
			System.out.println("The area of the rectangle is "+a.getArea()+" square units");
			System.out.println("The perimeter of the rectangle is "+a.getPerimeter()+"\n");
			System.out.print("Enter 1 to continue or any key to exit\n");
			if(sc.next().equals("1"))
				option=true;
			else
				option=false;
		}
		catch(Exception e)
		{
			System.out.println("\nInvalid input. please enter valid input(NUMERIC VALUES)");
		}
	}
}

