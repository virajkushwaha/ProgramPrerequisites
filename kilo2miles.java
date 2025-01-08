import java.util.*;
class kilo2miles{
	public double convert(float a){
		return a * 0.621371;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length in Kilometers: ");
		float a = sc.nextFloat();
		kilo2miles ob = new kilo2miles();
		double c = ob.convert(a);
		System.out.println(c+" Miles");
	}
}