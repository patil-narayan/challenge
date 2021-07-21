package challenge2;

public class AreaOfCircle {
	public static double area(double radius) {
		double areaOfCircle=0;
		final double pi=3.14;
		if(radius<=0.0) {
			areaOfCircle=(radius*radius)*pi;
			return areaOfCircle;
		}
		else {
			return -1.0;
		}
	}
	public static double area(double a,double b) {
		double areaOfRectangle = 0;
		if(a>=0.0 && b>=0.0) {
			areaOfRectangle=a*b;
			return areaOfRectangle;
		}
		else {
			return -1.0;
		}
		
	}
	public static void main(String[] args) {
		System.out.println((area(2.5)));
		System.out.println((area(2.5,3.5)));
	}
	

}
