import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the first number:");
		int x = in.nextInt();
		System.out.println("Please input the second number:");
		int y = in.nextInt();
		System.out.println("Please input the third number:");
		int z = in.nextInt();
		int max;
		max = x;
		if(max < y) {
			max = y;
		}
		if(max < z) {
			max = z;
		}
		
		System.out.print("The maximum number is:");
		System.out.println(max);
	}
	

}


