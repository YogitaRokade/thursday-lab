//find maximum and minimum number from array
package arrayexamples;

import java.util.Scanner;

public class MaxMin {
	//Method for finding maximum number
	public int max(int[]arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	//method for finding minimum value in array
		public int min(int[]arr)
		{
			int min=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<min)
				{
					min=arr[i];
				}
			}
			return min;
		
	}
	public static void main(String[]args)
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

	
MaxMin m=new MaxMin();
System.out.println("Maximum value of the array : "+m.max(arr));
System.out.println("Minimum value of the array : "+m.min(arr));
}
}
