/*
 * 6.Write a program to join two string
 */
package arrayexamples;

import java.util.Scanner;

public class StringConcatination {
	public static void main(String []args)
	{
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string : ");
    	str1=sc.nextLine();
		System.out.println("Enter second string : ");
        str2=sc.nextLine();
	String str3=str1.concat(str2);//using inbuilt function concat
	System.out.println(str3);
}
}
