package cmislab;

import java.util.Scanner;

public class AnudipFoundationMenu {

	static Scanner sc = new Scanner(System.in);
	//This method contains all the coursePanel and otherPaneloperations
	
			public static void menu ()
			{
				int choice;
				while(true){

					System.out.println("=======================================================================================");
					System.out.println("Press 1.To go through the available courses \nPress 2.For enrolling a course and other options\nPress 3.To Quit");
					System.out.println(" ");
					System.out.println("Enter your choice: ");
					System.out.println("=======================================================================================");
					choice = sc.nextInt();
					switch (choice) {
					
					case 1 :AnudipFoundationOperations.coursePanel();
						break;
						
					case 2:AnudipFoundationOperations.otherPanel();
						
						break;
						
					case 3:System.exit(0);				

					default:
						System.out.println("Please enter a correct choice from menu!");

					}
					}
			}
			

}
