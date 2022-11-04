package basicprogram;
import java.util.Scanner;
public class SumOfEven {
public static void main(String []args)
{
	int n,i,sum=0;
	System.out.println("How many numbers you want ");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			sum=sum+i;
		}
	}
	System.out.println("sum of all even numbers from 1 to "+n+" is :"+sum);
}
}
