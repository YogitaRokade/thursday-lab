package basicprogram;

import java.util.Scanner;

public class OneToFiftyPerfect {
	static boolean Perfect(int num)
	{
		int sum=0;
		for(int i=1;i<num/2;i++)
		{
			if(num%i==0)
			{
				
				sum=sum+i;
			}
		}
		if(sum==num)
			return true;
		else
			return false;
		
	}

	public static void main(String []args)
	{
	int n,i,sum=0,temp;
	System.out.println("how many numbers you want to check ");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
for(i=1;i<=n;i++)
{
	if(Perfect(i))
		System.out.println(i);

}
	}
}
