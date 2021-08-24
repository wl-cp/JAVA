package homework5;
import java.util.Scanner;
public class Point {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Please input the horizontal (X) :");
		float x=in.nextFloat();
		System.out.println("Please input the ordinate (Y) :");
		float y=in.nextFloat();
		MyPoint n=new MyPoint();
		MyPoint.x=x;
		MyPoint.y=y;
		MyPoint.Point();
	}

}
class MyPoint{
	static float x;
	static float y;
	static void Point(){
		System.out.println("Your location of horizontal (X) is :"+x);
		System.out.println("Your location of ordinate (Y) is :"+y);
	}
}

