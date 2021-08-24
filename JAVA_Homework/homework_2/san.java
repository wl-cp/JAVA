import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		double sum,average;
		sum = x + y + z;
		average = (x + y + z)/3.0;
		System.out.println("sum="+sum);
		System.out.println("average="+average);
	}

}


