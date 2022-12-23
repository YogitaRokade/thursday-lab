/*
 * 4.Write a code to implement covid vaccination booster dose system.for male if the age is more than 
 * 60 and for female if the age is more than 50 and nationality must be indian then eligible for doze.
 */
package thursdaylab;

import java.util.Scanner;

import ExceptionHandeling.AgeNotValidForVaccineException;

class Vaccine
{
	String nationality;
	String gender;
	int age;
	
	public Vaccine (String nationality,String gender,int age)
	{
		this.nationality=nationality;
		this.gender=gender;
		this.age=age;

	}

	public String getNationality() {
		return nationality;
	}

    public String getGender() {
		return gender;
	}

    public int getAge() {
		return age;
	}	
}
public class CovidVaccination{ 
	
	//Method to check eligibility 
	public static void eligibilityCheck(String gender,int age,String nationality) 
			throws AgeNotValidForVaccineException
	{
		//Checking for Female candidates
		if (gender.equalsIgnoreCase("female")&& age >= 50 && nationality.equalsIgnoreCase("Indian"))
				{
			    System.out.println("Welcome !");
			    System.out.println("You are eligible for women's covid booster dose.");
				}
		//Checking for Male candidates
		else if (gender.equalsIgnoreCase("male")&& age >= 60 && nationality.equalsIgnoreCase("Indian"))
		        {
			    System.out.println("Welcome !");
			    System.out.println("You are eligible for male's covid booster dose.");
		        }    
		
		else
			//Exception handling 
			    throw new AgeNotValidForVaccineException(" 1. Nationality should be Indian"
					+ "\n 2. Age should be 50 years and above for Women & 60 years and above for Men");
	}
	
public static void main (String []args)
{
	String nationality;
	String gender;
	int  age;
	
	Scanner sc = new Scanner (System.in);
	
	//Taking input from user
	
	System.out.println("Please enter your nationality: ");
	nationality = sc.nextLine();
	
	System.out.println("Please enter your gender: ");
	gender = sc.nextLine();
    
	System.out.println("Please enter your age: ");
	age = sc.nextInt();
	sc.nextLine();
	
	//try block to identify possible error

	try
	{
		CovidVaccination.eligibilityCheck(gender,age,nationality);
    }  
	catch(AgeNotValidForVaccineException check2)
	{
		System.out.println(check2.getMessage());
		//check2.printStackTrace();
	}
	
}
}

