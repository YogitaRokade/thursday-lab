package oopsconcept;
import java.util.Scanner;

public class Bank {
	public static void main (String []args)
	{
		float balance,withdraw,deposit;
		System.out.println("Enter your bankbalance");
		Scanner sc=new Scanner(System.in);
		balance=sc.nextFloat();
		if(balance>=5000)
		{
			System.out.println("Enter amount for withdraw");
			withdraw=sc.nextFloat();
			if(withdraw>balance)
			{
				System.out.println("Insufficient balance");
			}
			else
			{
				System.out.println("Withdraw Successfully!");
				balance=balance-withdraw;
				System.out.println("Your remining balance: "+balance);
			}
		}
		System.out.println("Enter amount to deposit");
		deposit=sc.nextFloat();
		balance=balance + deposit;
		System.out.println(" After deposit your bank balance :"+balance);
        
	}

}
