/*
 * A library needs to develop an online application for two types of users-adults and children.
 * both of this users should be able to register n account.any user who is less than 12 years of age 
 * will be register as a child and they cn borrow a kids category book for 10 days;
 * where as an adult can borrow fiction category books which needs to be return within 7 days.
 */

package oopsconcept;

interface LibraryUser
{
	public void registerAccount();
	public void requestBook();
}
class KidUsers implements LibraryUser
{
	int age;
	String bookType;
	//generate  using setter method
	public void setAge(int age) {
		this.age = age;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(age<12)
			System.out.println("You are succesfully Register under kids Account");
		else
			System.out.println("sorry, age must be less than 12 for kids account");
	}
	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType.equalsIgnoreCase("kids"))
			System.out.println("Book issue successfully"+"\n"+"Please return within 10 days");
		else
			System.out.println("You are allowed to take only kids book");
	}
	
}
class Adults implements LibraryUser
{
	int age;
	String bookType;
	//set value using setter method
	public void setAge(int age) {
		this.age = age;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		if(age>12)
			System.out.println("You are succesfully Register under adult  Account");
		else
			System.out.println("sorry, age must be greater than 12");
	}
	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		if(bookType.equalsIgnoreCase("kids"))
			System.out.println("Book issue successfully"+"\n"+"Please return within 7 days");
		else
			System.out.println("You are allowed to take only Adult fiction book");
	}
	
	
}

public class Library {
	public static void main(String []args)
	{
		//test case 1
		KidUsers kidUsers=new KidUsers();
		kidUsers.setAge(10);//set value
		kidUsers.setBookType("kids");
        kidUsers.registerAccount();
        kidUsers.requestBook();
        System.out.println();
     	kidUsers.setAge(18);//set value
		kidUsers.setBookType("fiction");
        kidUsers.registerAccount();
        kidUsers.requestBook();
        
        System.out.println();
        //test case 2
        Adults adultUser=new Adults();
        
        adultUser.setAge(05);
        adultUser.setBookType("kids");
        adultUser.registerAccount();
        adultUser.requestBook();
        System.out.println();
        adultUser.setAge(23);
        adultUser.setBookType("fiction");
        adultUser.registerAccount();
        adultUser.requestBook();
        
        
        
	}
}
