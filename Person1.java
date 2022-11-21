
/*Create a class called person with a member variable name.save it in a file called person.java
 * Create a class called Employee that will inherit the person class .the other data members of the employee 
 * class are annual salary(Double),the yar the employee started 
 */
 package oopsconcept;
 
class  Employee5 extends Person1
{
	double annualSalary;
	String dateOfJoin, nationalInsuranceNo,name;
	public  Employee5(Double annualSalary,String dateOfJoin,String NationalInsuranceNo,String name)
	{
		this.annualSalary=annualSalary;
		this.dateOfJoin=dateOfJoin;
		this.nationalInsuranceNo=nationalInsuranceNo;
		this.name=name;
	}
	public String getName() {
		return name;
	}
	//public void setName(String name) {
	//	this.name = name;
	//}
	public double getAnnualSalary() {
		return annualSalary;
	}
	//public void setAnnualSalary(double annualSalary) {
		//this.annualSalary = annualSalary;
	//}
	public String getDateOfJoin() {
		return dateOfJoin;
	}
	//public void setDateOfJoin(String dateOfJoin) {
	//	this.dateOfJoin = dateOfJoin;
	//}
	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}
	//public void setNationalInsuranceNo(String nationalInsuranceNo) {
	//	this.nationalInsuranceNo = nationalInsuranceNo;
	//}
}
public class Person1 {
	public static void main(String args[])
	{
		Employee5 emp=new Employee5(2000000d,"10-11-2022","12345","Yogita");
		System.out.println("annualsalary : "+emp.getAnnualSalary()+"\n"+"date of joinning:"+emp.getDateOfJoin()+"\n"
		+"National insurance number :"+emp.getNationalInsuranceNo()+"\n"+"Name:"+emp.getName());
		
	}

}
