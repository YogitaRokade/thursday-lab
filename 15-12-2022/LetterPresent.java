/*
 *1. Write a program to check if the letter 'e' is present in the word 'mumbai' or not
 */

package arrayexamples;

import java.util.Scanner;

public class LetterPresent {
	public static void main(String []args)
	{
		  String str;
		   char ch='e';
		 int i;
			System.out.println("Enter a string : ");
			Scanner sc=new Scanner(System.in);
			str=sc.nextLine();
		
			for(i=0;i<str.length();i++)//loop for checking given charector in string
			{
			if(ch==str.charAt(i))
			{
				System.out.println(ch+ " Present in the "+str);
				break;
			}
			else
				System.out.println(ch+ " is not Present in the "+str);
			     break;
			}
				
	}

}
