import java.util.Scanner;
public class Main {
public static void main(String[] agrs) {
	Scanner wanshu=new Scanner(System.in);
	int m=wanshu.nextInt();
	int n=wanshu.nextInt();
	
	int i,j,k,sum;
	System.out.println(m+" to "+n+" WanShu:");
	for(i=m;i<=n;i++)
	{  if(i==1) continue;
        sum=1;
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			sum=sum+j;
		}
	    if(sum==i)
		{
	    	System.out.print(sum+",");
	}
	    
	}
	
}}

