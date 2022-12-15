/*
 * 7.Write a program to compare two string
 */

package arrayexamples;

import java.util.Scanner;

public class CompareString {

	public static void main(String []args)
	{
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string : ");
    	str1=sc.nextLine();
		System.out.println("Enter second string : ");
        str2=sc.nextLine();
		System.out.println(str1.compareTo(str2));//it returns integer value
		
	
	    
	}



}
