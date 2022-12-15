/*
 *5. Write a program to find out number of occurrence of one alphabet
 */

package arrayexamples;

import java.util.Scanner;

public class NoOfOccurence {
			public static void main(String []args)
				{
					  String str;
					   char ch='o';
					    int i,count=0;
						System.out.println("Enter a string : ");
						Scanner sc=new Scanner(System.in);
						str=sc.nextLine();
						for(i=0;i<str.length();i++)//loop for checking char is present or not
						{
						if(ch==str.charAt(i))
						{
							count++;
							
						}
						}
						System.out.println(ch+" is "+count+ " times Present in the "+str);
							
				}
			}


