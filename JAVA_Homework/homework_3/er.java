import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		
		Scanner sushu = new Scanner(System.in);
		int n;
		do {
					n = sushu.nextInt();
					for(int i=2;i<n;i++) {
						if(n % i == 0) {
							System.out.println(n+" is not sushu.");
							break;
						}
						
						if(i == n-1)	{
							System.out.println(n+" is sushu.");
						}
						
					}	
		}while(n != 0);
		System.out.println("programe is over.");
	}		
}

