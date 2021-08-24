import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner num=new Scanner(System.in);
		
		int a = num.nextInt();
		int b = num.nextInt();
		for(int i = a;i <= b;i ++)
		{
			int number = 0,flagone = 0,flagtwo;
			flagone = i;
			if(i < 10)
			{
				number = flagone;
			}
			else {
				while(flagone>0) {
					flagtwo = flagone % 10;
					number= number * 10 + flagtwo;
					flagone = flagone / 10;
				}
			}
			if (number == i) {
			System.out.println(i);
			}
		}
	}

}
