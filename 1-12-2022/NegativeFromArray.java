//write a program to print negative numbers in an array
package arrayexamples;

import java.util.Scanner;

public class NegativeFromArray {
	public static void main(String []args)
	{
		int i,n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sie of the array :");
		n=sc.nextInt();
		int arr[]=new int[n];
		//Take input from user
		System.out.println("Enter  "+n+" elements of array");
		
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		displayNegative(arr);
	}
	public static void displayNegative(int[]arr)
	{
		boolean flag=false;
		int i;
		//for loop for checking negative number
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				flag=true;
				break;
			}
		}
		//loop for display
				System.out.println("Negative numbers from array are :");
				for(;i<arr.length;i++)
				{
					if(arr[i]<0)
					{
						System.out.print(arr[i]+"  ");
					}
			    }
	}
		



}
