package homework5;
import java.util.Scanner;
public class Cir {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		double rad=in.nextDouble();
		Circle circle=new Circle(rad);
		circle.disp();

	}

}
class Circle{
	private double radius;
	Circle(){
		radius=0;
	}
	Circle(double rad)
	{
		radius=rad;
	}
	double getPerimeter() {
		return 2*Math.PI*radius;
	}
	double getArea() {
		return Math.PI*radius*radius;
	}
	void disp() {

		System.out.printf("radius=%.4f\n",radius);
		System.out.printf("perimeter=%.4f\n",getPerimeter());
		System.out.printf("area=%.4f\n",getArea());
	}
	
}
