import java.util.*;
class add2numbers{
	public int add(int a,int b){
		return a+b;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		add2numbers ob = new add2numbers();
		
		int c = ob.add(a,b);
		
		System.out.println("Addition: "+c);
		sc.close();
	}
}