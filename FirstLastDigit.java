package basicprogram;

import java.util.Scanner;

public class FirstLastDigit {
	public static void main(String [] args)
	{
		int n,first=0,last=0,temp;
		Scanner sc=new Scanner(System.in);
		//input number from user.
		System.out.println("Enter number find first and last digit");
		n=sc.nextInt();
		temp=n;
		last=n%10;
		//run loop till n is greater than 0.
		while(n>0)
		{
			first=n%10;
			n=n/10;
		}

		//display the first and last digit.
		System.out.println("first digit of: "+temp+ " is : "+first+" last digit is: "+last);

}
}
