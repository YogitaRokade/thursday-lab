/*
 * Remove specific element from n array
 */
package thursdaylab;
import java.util.Scanner;

public class SpecificpositionFromArray {

	public static void main(String args[])
	{
		int size,i,pos,k; //variable declaration
       Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many elements you want in array");
	size=sc.nextInt();   //accepting size of array from user
	
	int arr[]=new int[size];
	System.out.println("Enter "+size+" elements in array"); 
	
	  for(i=0;i<size;i++)
	   {
		arr[i]=sc.nextInt(); //Array element from user
	   }
	
	System.out.println("Enter position you want to delete");
	pos=sc.nextInt();
		
     int[] arr_new = new int[arr.length-1];
       
        for( i=0, k=0;i<arr.length;i++)
        {
            if(i+1!=pos)
            {
                arr_new[k]=arr[i]; //replacing next position to deleted position 
                k++;
            }
        }
        System.out.println("After deletion array is : ");
         //display after deletion element in array
        for(i=0;i<size-1;i++) 
        {
        	
        System.out.println(arr_new[i]);
        
        }
    }
}