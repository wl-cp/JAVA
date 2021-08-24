import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int sum = 0;
		
		Scanner in = new Scanner(System.in);
        int[] number = new int[240];
        char[] group = in.nextLine().toCharArray();
        int leng = group.length;
        for (int i = 0; i < group.length; i++) {
        	 number[i] = group[i]-'0';
        }
        int N = in.nextInt();
        for (int i = 0; i < group.length; i++) {
        	
            if (number[i]>number[i+1]){
                for (int j = i; j < group.length; j++) {
                    number[j] = number[j+1];
                }
                leng--;
                sum++;
                if (sum==N){
                    break;
                }
                i=-1;
            }
        }
        for (int i = 0; i < leng; i++) {
            System.out.print(number[i]);
        }
	}

}
