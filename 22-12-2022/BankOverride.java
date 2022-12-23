/*
 * 1.write a program to show method overriding using a bank class as super class
 * and create sub class accordingly.
 * write at least common property and change the implementation in subclass. display the 
 * implementation of each subclass with object.
 */

package thursdaylab;
class Bank //This is the parent class
{
	int getRateOfIntrest()
	{
		return(8);
	}
}
//This is the child class inheriting and overriding parent class method with implementation
class HDFC extends Bank 
{
	int getRateOfInterest()
	{
		return(10);
	}
}
//This is the child class inheriting and overriding parent class method with implementation
class YesBank extends Bank 
{
	int getRateOfInterest()
	{
		return(11);
	}
}
//This is the child class inheriting and overriding parent class method with implementation
class SBI extends Bank
{
	int getRateOfInterest()
	{
		return(7);
	}
}


public class BankOverride {
	public static void main (String []args)
	{
		//Creating object of each class in order to display the output
		HDFC obj1 = new HDFC();
		YesBank obj2 = new YesBank();
		SBI obj3 = new SBI();
		
		System.out.println("Rate of Interest for HDFC is:"+obj1.getRateOfInterest());
		System.out.println("Rate of Interest for PMC is: "+obj2.getRateOfInterest());
		System.out.println("Rate of Interest for SBI is: "+obj3.getRateOfInterest());
	} 
}
