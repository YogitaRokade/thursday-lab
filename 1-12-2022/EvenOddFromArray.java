
/* Java program to count the number of even and odd elements in an array */
package arrayexamples;

import java.util.Scanner;

public class EvenOddFromArray 
{
	

	public static void main(String[] args)
	{
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("How many elements you want  in array :");
	n = sc.nextInt();
	int[]arr = new int[n];
	System.out.println("Enter elements  in array :");
	for(int i = 0; i < n; i++)
	{
	arr[i] = sc.nextInt();
	}
	int count_odd =0, count_even = 0;
	for(int i = 0; i < n; i++)
	{
	if(arr[i] % 2 == 1)
	count_odd++;
	else
	count_even++;
	}
	System.out.println(" total count of Odd elements in array: "+ count_odd);
	System.out.println(" Total count of Even elements in array : "+ count_even);

	}
}


