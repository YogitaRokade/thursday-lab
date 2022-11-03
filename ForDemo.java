package basicprogram;

import java.util.Scanner;

public class ForDemo {
	public static void main(String []args)
	{
	int i,sum=0,n;
	//sum of n natural numbers.
	System.out.println("Enter value of n");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	for(i=1;i<=n;i++)
	{
		sum=sum+i;
		
	}
	System.out.println("sum of natural numbers from 1 to "+n+" is:"+sum);
	}

}
