/*
 * 4.Write a program to find first and the last occurrence of the letter 
 *  'o' in hello world
 */
package arrayexamples;
 

import java.util.Scanner;

public class LastOccurance {
	public static void main(String []args)
	{
		  String str;
			System.out.println("Enter a string : ");
			Scanner sc=new Scanner(System.in);
			str=sc.nextLine();
			System.out.println(str.indexOf('o'));//to print first index of char
			System.out.println(str.lastIndexOf('o'));//to print last index of char
			
		}
				
	}


