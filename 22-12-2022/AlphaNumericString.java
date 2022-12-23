//2.find the sum of all digits from an alpha numeric string.

package thursdaylab;

import java.util.Scanner;

public class AlphaNumericString {
	public static void main(String []args)
	{
		//declaring variable
		String str;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter alpha numeric string : ");//user input
		str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			//checking character is digit and find numeric value of it;
			if(str.charAt(i)>='0' &&str.charAt(i)<='9')
			{
				//then add it to the sum
				sum=sum+str.charAt(i)-'0';
			}
		}
		//display output
		System.out.println("sum of all digit in alphanumeric string is : "+sum);
	}

}
