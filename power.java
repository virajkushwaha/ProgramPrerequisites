import java.util.*;
class Power{
	public static double powerCal(double a,int e){
		if (e == 1){
			return a;
		}
		else{
			return a * powerCal(a,e-1);
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		double a = sc.nextDouble();
		System.out.println("Enter the power");
		int e = sc.nextInt();
		
		double res = powerCal(a,e);
		
		System.out.println("Exponential Number: "+res);
	}
}