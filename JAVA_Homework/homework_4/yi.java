import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		int n_num = 0,s_num = 0,k_num = 0,t_num = 0;
		Scanner in = new Scanner(System.in);
	  	System.out.println("Please input a sentence:");
		String str = in.nextLine().toUpperCase();
		char ch[] = str.toCharArray();
		int sum = 0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i] >='0' && ch[i]<='9') {
				n_num++;
			}
			else if(ch[i] >= 'A' && ch[i] <= 'Z') {
				s_num++;
			}
			else if(ch[i] == ' ') {
				k_num++;
			}
			else {
				t_num++;
			}
		}
		
			System.out.println("The number of numbers is: "+n_num);
			System.out.println("The number of English letters is: "+s_num);
			System.out.println("The number of blank space is: "+k_num);
			System.out.println("The number of other characters is: "+t_num);
		}
		
	}

