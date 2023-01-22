package cmislab;
import java.util.Scanner;
import java.util.Set;
import java.time.LocalDate;

//import CollectionFramework.AnudipFoundationMenu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class AnudipFoundationService {
	
	static ArrayList <StudentDetailsAnudip>  student = new ArrayList<StudentDetailsAnudip>();
	static Scanner sc = new Scanner (System.in);
	static int batchId = 1000;
	static ArrayList<Batch> batches = new ArrayList<Batch>();
	static Set<StudentDetailsAnudip> StudentDetails = new HashSet<StudentDetailsAnudip>();
	
	//This method contains all the student information related to Java
	
	static void studentJavaDetails() throws GlobalExceptionAnudip 
	{
		 String course;
	     String name;
	     String email;
		 long phone;
		 int id;
		 
		 System.out.println("Enter your course: ");
		 course = sc.nextLine();
		 
		 if ((course.equalsIgnoreCase("Java"))||(course.equalsIgnoreCase("Java full stack developer"))||(course.equalsIgnoreCase("Java full stack")))
		 {
		 
		 id = AnudipFoundationService.createStudentId();
		 System.out.println("Your assigned Id is: "+id);
		     
		 System.out.println("Enter your name: ");
		 name =  sc.nextLine();
		 
		 System.out.println("Enter your email: ");
		 email = sc.nextLine();
		 
		 if((email.endsWith("@yahoo.com"))||(email.endsWith("@gmail.com"))||(email.endsWith(".in")))
		 {
		 
		 System.out.println("Enter your phone no: ");
		 phone = sc.nextLong();
		 
		 student.add(new StudentDetailsAnudip(id,course,name,email,phone));
		 
		 sc.nextLine();
		 
		 System.out.println(" ");
		 System.out.println("Registration has been done sucessfully!");
		 System.out.println("=======================================================================================");
		 }
		 else
			 throw new GlobalExceptionAnudip ("Email Id should end with either '@gmail.com' or '@yahoo.com' or '.in'");
		 System.out.println(" ");
		// System.out.println("---------------------------------------------------------------------------------------");
		 }
		 else 
			 throw new GlobalExceptionAnudip("Error! No other courses are available.");
		 System.out.println(" ");
		 System.out.println("---------------------------------------------------------------------------------------");
		 
	}
	
	//This method contains all the student information related to AWS
	
	static void studentAWSDetails() throws GlobalExceptionAnudip 
	{
		 String course;
	     String name;
	     String email;
		 long phone;
		 int id;
		 
		 System.out.println("Enter your course: ");
		 course = sc.nextLine();
		 if((course.equalsIgnoreCase("AWS"))||(course.equalsIgnoreCase("Amazon Web Services")))
		 {
		 
		 id = AnudipFoundationService.createStudentId();
		 System.out.println("Your assigned Id is: "+id);
		     
		 System.out.println("Enter your name: ");
		 name =  sc.nextLine();
		 
		 System.out.println("Enter your email: ");
		 email = sc.nextLine();
		 
		 System.out.println("Enter your phone no: ");
		 phone = sc.nextLong();
		 
		 student.add(new StudentDetailsAnudip(id,course,name,email,phone));
		 
		 sc.nextLine();
		 
		 System.out.println(" ");
		 System.out.println("Registration has been done sucessfully!");
		 System.out.println("=======================================================================================");
		 }
		 
		 else 
			 throw new GlobalExceptionAnudip("Error! No other courses are available.");
		 System.out.println(" ");
		 System.out.println("---------------------------------------------------------------------------------------");
		 
	}
	
		
	 static int studentId = 1;
	 static int createStudentId()
	 {
		 return studentId++;
	 }
	
	 
	 // This method is to enroll in a course
	static void feeConfirmation()
	{
		int confirmation;
		System.out.println("Please update your fee details here: ");
		
		System.out.println(" ");
		
		System.out.println("Enter 1. For confirming,fee status as sucessful.\n" + "Enter 2. For going back to the main menu\n");
		
		Scanner sc = new Scanner(System.in);
		confirmation = sc.nextInt();
		
		if (confirmation == 1)
		{
			System.out.println("---------------------------------------------------------------------------------------");
			System.out.println("Congratulations ! You have sucessfully enrolled in the course.");
            System.out.println(" ");
			System.out.println(" ");
			System.out.println("Course details are as follows: ");
			System.out.println("---------------------------------------------------------------------------------------");
	
			
			for(int i=0;i<student.size();i++)
			{ 
				System.out.println("Assigned Student Id: "+student.get(i).getId());
				System.out.println("Enrolled Cousre: "+student.get(i).getCourse());
				System.out.println("Student's Name: "+student.get(i).getName());
				System.out.println("Student's Email Id: "+student.get(i).getEmail());
				System.out.println("Student's Phone no: "+student.get(i).getPhone());
				System.out.println("---------------------------------------------------------------------------------------");
			}
		}
		else if (confirmation == 2)
		{
			AnudipFoundationMenu.menu();
		}
		else
			System.out.println("Please put in the correct choice!");
	}
	
	
	//Update details using Id
	
	static void updateDetailsById (int Id) throws GlobalExceptionAnudip
	{
	 boolean status = false;
	 
	 for(int i=0;i<student.size();i++)
	 {
		if (Id == student.get(i).getId())
		{
			 System.out.println("Enter new Id: ");
			 int id = sc.nextInt();
			 sc.nextLine();
			 
			 System.out.println("Enter new course name: ");
			 String course = sc.nextLine();
			 
			 System.out.println("Enter your new name: ");
			 String  name =  sc.nextLine();
			 
			 System.out.println("Enter your new email: ");
			 String email = sc.nextLine();
			 
			 System.out.println("Enter your new phone no: ");
			 long phone = sc.nextLong();
			 
			 student.set(i, new StudentDetailsAnudip(id,course,name,email,phone));
			 
			 System.out.println("Student's detail has been updated sucessfully!");
			 status = true;
		}
	 }
	 if (status == false)
	 {
		 throw new GlobalExceptionAnudip("No Student's details bearing such Id can be found");
	 }
	 
	}
	

	//To generate batch code
	
	static String batchCodeGeneration()
	{
	String s=String.valueOf(batchId);
	String batch = "ANP-C"+ s;
	batchId++;

	return batch;
	}

	//To create a batch
	
	static void createBatch()
	{
		String batchCode;
		String duration;
		LocalDate startDate;
		LocalDate endDate;
		
		batchCode = AnudipFoundationService.batchCodeGeneration();
		//System.out.println(batchCode);
		
		System.out.println("Please enter course duration:");
		duration=sc.nextLine();
		System.out.println("Enter batch start Date:"+"\n(yy-mm-dd)");//2016-08-31
		startDate=LocalDate.parse(sc.nextLine());
		System.out.println("Enter batch end Date:"+"\n(yy-mm-dd)");
		endDate=LocalDate.parse(sc.nextLine());
		batches.add(new Batch(batchCode, duration, startDate, endDate));
		sc.nextLine();
		System.out.println("Batch created sucessfully.");
		System.out.println("Batch code is: "+batchCode);
		
		
		
	}
	
	//To show all the student details
	
	static void showAllStudentDetails()
	{
		for(int i=0;i<student.size();i++)
		{
			System.out.println("Assigned Student Id: "+student.get(i).getId());
			System.out.println("Enrolled Cousre: "+student.get(i).getCourse());
			System.out.println("Student's Name: "+student.get(i).getName());
			System.out.println("Student's Email Id: "+student.get(i).getEmail());
			System.out.println("Student's Phone no: "+student.get(i).getPhone());
			System.out.println("---------------------------------------------------------------------------------------");
		}
	}
	
	
	//To assign student to the batch
	static void assignStudentToBatch(Batch b)throws GlobalExceptionAnudip
	{
		boolean status=false;
		System.out.println("Enter Student Id:");
	    int sId=sc.nextInt();

		for(int j=0;j<student.size();j++)
		{
			if(sId==student.get(j).getId())
			{
			StudentDetails.add(student.get(j));
			b.setStudents (StudentDetails);
			System.out.println("Student assigned to the batch sucessfully!");
			status=true;
			break;
			}
		}
		 
		if(status==false)
		{
			throw new GlobalExceptionAnudip("Sorry! Student Id cannot be found!");
		}
	}
	
	static void assignStudents() throws GlobalExceptionAnudip 
	{
		sc.nextLine();
		System.out.println("Enter Batch Code:");
		String batchCode=sc.nextLine();
		if (batchCode.equalsIgnoreCase("ANP-C1000"))
		{
		
		
		for(int i=0;i<batches.size();i++)
		{
			if(batchCode.equalsIgnoreCase(batches.get(i).getBatchId()))
			{
				Batch batch=batches.get(i);
				assignStudentToBatch(batch);
			}
		}
		}
		else 
			throw new GlobalExceptionAnudip ("Invalid batch code. Please enter correct batch code.");
	}
	
	//To check student details batch wise
	static void checkBatchWiseStudentsDetails() throws GlobalExceptionAnudip
	{
		sc.nextLine();
		System.out.println("Enter Batch Code:");
		String batchCode=sc.nextLine();
		if (batchCode.equals("ANP-C1000"))
		{
		System.out.println("All the details are as follows: ");
		System.out.println(" ");
		for(int i=0;i<batches.size();i++)
		{
			if(batchCode.equalsIgnoreCase(batches.get(i).getBatchId()))
			{
				
			    //fetching all student details of specific batch
				Set<StudentDetailsAnudip> allStudents=batches.get(i).
						getStudents();
				//for students list
				Iterator itr=allStudents.iterator();
				while(itr.hasNext())
				{
					StudentDetailsAnudip sd=(StudentDetailsAnudip) itr.next();
					System.out.println("Student id: "+ sd.getId());
					System.out.println("Student Name: "+ sd.getName());
					System.out.println("Student Email id: "+ sd.getEmail());
					System.out.println("Student Contact No: "+ sd.getPhone());
					System.out.println("Enrolled Course: "+ sd.getCourse());
					System.out.println("---------------------------------------------------------------------------------------");
					System.out.println(" ");
				}
			}
	    }
		}
		else 
			throw new GlobalExceptionAnudip("Invalid batch code. Please enter correct batch code.");
	}
}
		
	
	
	
	
	
	
	
	
	
	


