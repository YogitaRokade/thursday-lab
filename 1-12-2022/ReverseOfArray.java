//array in reverse order
package arrayexamples;

public class ReverseOfArray {
	public static void main(String []args) 
	{
		//initializing of array
		
		int arr[]=new int[] {1,2,3,4,5};
		System.out.println("Original array :");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
			
		}
		System.out.println();
		System.out.println("Array in reverse order :");

		//loop for reverse the array
	   for(int i=arr.length-1;i>=0;i--)
	   {
		   System.out.print(arr[i]+"  ");
	   }
	}

}
