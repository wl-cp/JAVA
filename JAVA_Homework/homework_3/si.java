import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int sum=0,i = 1,j = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Please input a number:");
		int n = in.nextInt();
		
		do {
	
			sum = sum + i;
			j = j + 1;
			i = i * j;
			
		}while(j <= n);
		System.out.println("1+2!+3!+...+n!= "+sum);
	}

}

