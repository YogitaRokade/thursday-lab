package basicprogram;

import java.util.Scanner;

public class Factorial {
	public static void main(String []args)
	{
		int n,i,fact=1,temp;
		//input from user.
		System.out.println("Enter number for find factorial");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		//loop for the creating table
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial of : "+temp+"ïs : "+fact);
}
}
