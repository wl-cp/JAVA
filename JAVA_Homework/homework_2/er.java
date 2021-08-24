import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		
		Scanner change = new Scanner(System.in);
		String str = change.nextLine();
		String newstr = str.toUpperCase();
		System.out.println("result:"+newstr);
	}

}

