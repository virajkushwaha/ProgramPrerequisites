import java.util.Scanner;

class simpleInterest{
	public static float simpleInterest(float p , float r , float t){
		return (p*r*t)/100;
	}
	public static void main(String agrs[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Principle: ");
		float p = sc.nextFloat();
		System.out.println("Rate: ");
		float r = sc.nextFloat();
		System.out.println("Time in Years: ");
		float t = sc.nextFloat();
		float simpleInterest = simpleInterest(p,r,t);
		System.out.println("Simple Interest: "+simpleInterest);
	}
}