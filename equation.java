public class equation {
	public static void main(String[] args) {
		System.out.println("1st equation is 3.4x + 50.2y = 44.5");
		System.out.println("2nd equation is 2.1x + .55y = 5.9");
		System.out.println("value of a,b,c,d,e and f are derived from these equations are");
		double a,b,c,d,e,f,g,x,y;
		a=3.4;
		b=50.2;
		c=2.1;
		d=.55;
		e=44.5;
		f=5.9;
		System.out.println("solution for these equations are x and y");
		x=(e*d-b*f)/(a*d-b*c);
		y=(a*f-e*c)/(a*d-b*c);
		System.out.println("value of x is " + x + " and y is " + y);
		
		
	}
}
