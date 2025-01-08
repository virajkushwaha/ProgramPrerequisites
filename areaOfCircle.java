import java.util.Scanner;
class AreaOfCircle{
	public double areaOfCircle(double r){
		return Math.PI * r * r ;
		
	}
	public static void main(String args[]){
		System.out.println("Enter the radius: ");
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		AreaOfCircle a = new AreaOfCircle();
		double area = a.areaOfCircle(r);
		System.out.println("Area: "+area);
		
	}
	
	
}