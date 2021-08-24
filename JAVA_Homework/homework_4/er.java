import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		int a[] = new int[10];
		int b[] = new int[10];
		Scanner num=new Scanner(System.in);
		System.out.println("Please input 10 numbers:");
		for(int i = 0;i < 10;i ++) {
		
			a[i]=num.nextInt();
		}
		System.out.println("Your numbers are:");
		for(int i = 0;i < 10;i ++) {
			
			System.out.print(a[i]+" ");
		}
		System.out.println("\nPlease input m:");
		int m=num.nextInt();
		for(int i = 0;i < 10; i ++) {
			int flag = (i + m) % 10;
			b[flag] = a[i];
			
		}
		System.out.println("The new numbers are:");
		for(int i = 0;i < 10;i ++) {
			
			System.out.print(b[i]+" ");
		}
		
	}

}

