import java.util.*;
class Avg{
	public static float avg(float a,float b , float c){
		return (a+b+c)/3;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers: ");
		float a = sc.nextInt();
		float b = sc.nextInt();
		float c = sc.nextInt();
	
		float res = avg(a,b,c);
		System.out.println("Average: "+ res);
	}
}