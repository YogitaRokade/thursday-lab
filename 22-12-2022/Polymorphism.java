/*
 * 3.Explain run time polymorphism with a real time scenario
 */

package thursdaylab;

//Parents class 
class Friend  
{
	public void friendsMain()
	{
		System.out.println("This is the main Friend method");
	}
	public void friendsMain2()
	{
		System.out.println("This is the main Friend2 method");
	}
}

//Child class inheriting methods from parents class and overriding with own implementation
class Friend2 extends Friend
{
	@Override
	public void friendsMain()
	{
		super.friendsMain();
		System.out.println("This is the overriden friendMain method");
	}
	@Override
	public void friendsMain2()
	{
		System.out.println("This is the overriden friendMain2 method");
	}
	//This is child class's own implementation
	public void friendsMain3()
	{
		System.out.println("This is class Friends2's own method ");
	}
}

public class Polymorphism {
	public static void main (String args [])
	{
	//Creating object of the most recent class
		Friend2 obj  = new Friend2();
		obj.friendsMain();
		obj.friendsMain2();
		obj.friendsMain3();
		
	}

}

