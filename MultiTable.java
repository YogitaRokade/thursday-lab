package basicprogram;
import java.util.Scanner;
public class MultiTable {
	public static void main(String []args)
	{
		int n,i,tab;
		//input from user.
		System.out.println("Enter number for creating table");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		//loop for the creating table
		for(i=1;i<=10;i++)
		{
			tab=n*i;
			System.out.println(""+tab);
			
		}
	}

}
