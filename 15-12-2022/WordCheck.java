/*
 * 2.Write a program to check if the word 'I' is present in the "I love my India" or not.
 */

package arrayexamples;
import java.util.Scanner;

public class WordCheck {
	public static void main(String []args)
	{
		  String str;
		   
			System.out.println("Enter a string : ");
			Scanner sc=new Scanner(System.in);
			str=sc.nextLine();
			if(str.contains("i"))//using contains function
			{
				System.out.println(str+ " contains: I");//true
			}
			else
				System.out.println(str+ " not contains :I");
			
				
	}


}
