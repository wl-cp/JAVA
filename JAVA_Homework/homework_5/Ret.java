package homework5;
import java.util.Scanner;
public class Ret {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Please input length:");
		float a=in.nextFloat();
		System.out.println("Please input width:");
		float b=in.nextFloat();
		Retangle n=new Retangle();
		float area=n.Area(a,b);
		System.out.println("The lengh is:" +a);
		System.out.println("The width is:"+b);
		System.out.println("The area is:"+area);

	}
	
}
class Retangle{
	float Area(float a,float b) {
		float area;
		area=a*b;
		return area;
	}
}
