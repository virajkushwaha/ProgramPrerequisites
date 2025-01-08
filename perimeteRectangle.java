import java.util.Scanner;

class PerimeterRectangle{
	public static float perimeter(float l , float b){
		return 2*(l+b);
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the lenght");
		
		float l = sc.nextFloat();
		System.out.println("Enter the Breadth");
		float b = sc.nextFloat();
		float r = perimeter(l,b);
		System.out.println("Perimeter: "+r);
		
	}
}
