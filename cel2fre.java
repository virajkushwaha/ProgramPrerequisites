import java.util.*;
class cel2fre{
	public float convert(float a){
		return (a*9/5)+32;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		cel2fre ob = new cel2fre();
		float c = ob.convert(a);
		System.out.println("Fahrenhiet: "+c);
	}
}