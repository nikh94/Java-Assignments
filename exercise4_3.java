package exercise4_3;
import java.util.Scanner;
public class exercise4_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("open gps-data-team.com and obtain the gps location");
		System.out.println("location in the form degree/minutes/seconds \n");
		System.out.println("gps location of atlanta,georgia");
		System.out.println("84°23'13''W,33°47'1''N which can be expressed as ");
		System.out.println("33.7489954,-84.3879824 as latitude and longitude");
		double x1,y1;
		x1=33.7489954;
		y1=-84.3879824;
		System.out.println(" similarly through gps location of orlando,florida we can express");
	    System.out.println("28.5383355,-81.37923649999999 as latitude and longitude");
		double x2,y2;
		x2=28.5383355;
		y2=-81.37923649999999;
		System.out.println("the gps location of savannah,georgia");
		 System.out.println("32.0835407,-81.09983419999998 are latitude and longitude");
			double x3,y3;
			x3=32.0835407;
			y3=-81.0993419999998;
		System.out.println("the gps location of charlotte,north carolina");
		 System.out.println("35.2270869,-80.84312669999997  are latitude and longitude");
			double x4,y4;
			x4=35.2270869;
			y4=-80.84312669999997;
		 System.out.println("all points forms a polygon which can be divided by a diagonal");
	     System.out.println("let a,b,c,d be the sides with ac diagonal");
	     double a,b,c,d,ac,radius,s1,s2,area1,area2,total_ar;
	     radius=6371.01;
	     a=radius*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * 
	    	      Math.cos(Math.toRadians(y1 - y2)));
	     System.out.println("distance between atlanta and orlando is " +a+" km");
		b=radius*Math.acos(Math.sin(Math.toRadians(x2))*Math.sin(Math.toRadians(x3))+Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(x3)) * 
	    	      Math.cos(Math.toRadians(y2 - y3)));
		System.out.println("distance between orlando and savannah is " +b+" km");
		
		c=radius*Math.acos(Math.sin(Math.toRadians(x3))*Math.sin(Math.toRadians(x4))+Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(x4)) * 
	    	      Math.cos(Math.toRadians(y3 - y4)));
		System.out.println("distance between savannah and charlotte is " +c+" km");
		d=radius*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x4))+Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x4)) * 
	    	      Math.cos(Math.toRadians(y1 - y4)));
		System.out.println("distance between atlanta and charlotte is " +d+" km");
		ac=radius*Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x3))+Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x3)) * 
	    	      Math.cos(Math.toRadians(y1 - y3)));
		System.out.println("distance between atlanta and savannah is " +ac+" km");
		s1 = (a+b+ac)/2;
		area1 = Math.pow(s1*(s1-a)*(s1-b)*(s1-ac),0.5);
		s2 = (c+d+ac)/2;
		area2 = Math.pow(s2*(s2-c)*(s2-d)*(s2-ac),0.5);
		System.out.println("area of triangle 1 " +area1 +"sq km.");
           
		System.out.println("area of triangle 2 " +area2 +"sq km.");
		
		total_ar=area1+area2;
		System.out.println("total area enclosed by four cities is " +total_ar +"sq km");
	}
}
