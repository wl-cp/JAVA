import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int[] a = new int[n];
        for(int j=0;j<n;j++) {
        	a[j] = in.nextInt();
        }
        int min = a[0];
        int max = a[0];
        for(int k=0;k<n;k++) {
        	if(a[k] > max) {
        		max = a[k];
        	}
        	if(a[k] < min) {
        		min = a[k];
        	}
        }
       System.out.println(max+" "+min); 
    }
}


