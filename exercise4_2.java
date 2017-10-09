
import java.util.Scanner;
public class exercise4_2 {

	public static void main(String[] args) {
		char ch;
		do{Scanner reader=new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("enter the latitude value of point 1 in degrees");
		double x1=input.nextDouble();
		System.out.println("enter the longitude value of point 1 in degrees");
		double y1=input.nextDouble();
		System.out.println("enter the latitude value of point 2 in degrees");
		double x2=input.nextDouble();
        System.out.println("enter the longitude value of point 2 in degrees");
		double y2=input.nextDouble();
	    double d,radius;
	    radius=6371.01;
	    d= radius*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * 
	    	      Math.cos(Math.toRadians(y1 - y2)));
	    System.out.println("distance between the two points of great circle is " + d +"km" );
	    System.out.println("press 1 to continue or any key to exit");
		ch=reader.next().charAt(0);
			}while(ch=='1');
	}

}
