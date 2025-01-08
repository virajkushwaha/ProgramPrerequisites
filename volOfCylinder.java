import java.util.Scanner;
class volOfCylinder{
	public double volOfCylinder(double r , double h){
		return Math.PI * r * r * h;
		
	}
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius: ");
		double r = sc.nextDouble();
		System.out.println("Enter the Height: ");
		double h = sc.nextDouble();
		volOfCylinder a = new volOfCylinder();
		double vol = a.volOfCylinder(r,h);
		System.out.println("Volume of Cylinder: " + vol);
		
	}
	
	
}