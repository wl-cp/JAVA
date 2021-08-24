import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine().toUpperCase();
		char ch[] = str.toCharArray();
		int sum = 0;
		for(char ch1='A';ch1<'Z';ch1++) {
			sum = 0;
		for(int i=0;i<ch.length;i++) {
			if(ch1==ch[i]) {
				sum++;
			}
			
		}
		if(sum!=0) {
			System.out.println("("+ch1+")Num="+sum);
		}
		}
		
	}

}

