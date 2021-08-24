import java.util.Scanner;

public class Main {
	
	public static boolean InJudge(int n) {
        for (int m = 2; m < n; m++) {
            if (n % m == 0) {
                return false;

            }
        }
        return true;
    }

    public static boolean ReverJudge(int n) {
        int y = 0;
        int z;
        if (InJudge(n)) {
        	while(n>0) {
        		z = n % 10;
        		y = y *10 + z;
        		n /= 10;
        	}
        	
        }
        if (InJudge(y)) {
            return true;
        } else {
            return false;
        }
    }
	public static void main(String[] args) {
		Scanner sushu=new Scanner(System.in);
		int number=sushu.nextInt();
		 if (InJudge(number) && ReverJudge(number)) {
             System.out.print("yes");
         }
		 else {
			 System.out.print("no");
         }

	}

}
