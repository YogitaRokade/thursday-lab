package shoppingkartuingarraylist;

import java.util.Scanner;

public class ProductMain {
	//This method contains all the Admin related operations
		public static void adminPanel()
		{
			//Declaring variables
			int choice;
			Scanner sc = new Scanner (System.in);
			do
			{
				System.out.println("Enter 1. For  Add Product\n" 
			            + "Enter 2. For Update product details using Id\n"
						+ "Enter 3. For display product details using Id\n" 
						+ "Enter 4. For deleting a product using Id\n"
						+ "Enter 5. For displaying all the product\n"
						+ "Enter 6. For deleting all the products\n"
						+ "Enter 7. For displaying all the placed order details \n"
						+ "Enter 8. To go back to the Main menu \n");

				System.out.println("=======================================================================================");
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				System.out.println(" ");
				System.out.println("=======================================================================================");


				switch (choice) {

				case 1:
					ProductService.addProduct();
					System.out.println("=======================================================================================");
					break;

				case 2:
					System.out.println("Enter Id to update: ");
					int Id = sc.nextInt();
					try
					{
					ProductService.updateProductById(Id);
					}
					catch(GlobalException e)
					{
					System.out.println(e.getMessage());
					}
					System.out.println("=======================================================================================");
					break;

				
				 case 3: 
					 System.out.println("Enter Id to display product: ");
					 int id = sc.nextInt();
					 try
						{
						ProductService.getProductById(id);
						}
						catch(GlobalException e)
						{
						System.out.println(e.getMessage());
						}
					 System.out.println("=======================================================================================");
						break;
				
				  
				  case 4: 
					  System.out.println("Enter Id to delete product: ");
						 int id1 = sc.nextInt();
						 try
							{
							ProductService.deleteProductById(id1);
							}
							catch(GlobalException e)
							{
							System.out.println(e.getMessage());
							}
					 System.out.println("=======================================================================================");
							break;
					
				 case 5:
					  System.out.println("All the added products are mentioned below: ");
					  System.out.println(" ");
					  ProductService.displayAllProduct();
					  System.out.println("=======================================================================================");
							break;
				   
				 case 6: 
					  ProductService.deleteAllProduct();
					  System.out.println("=======================================================================================");
							break;
					 
				 case 7: 
					  ProductService.showAllOrder();
					  System.out.println("=======================================================================================");
							break;
					 			
							
				 case 8:
					ShoppingKartArrayListOperations.mainMenu();
					;
				default:
					System.out.println("Please enter a correct choice from the menu!  ");
				}
			}
			while(choice!=8);
			
		}
		
		//This method contains all the User related operations
		
		public static void userPanel()
		{
			//Declaring variable
			int choice;
			Scanner sc = new Scanner (System.in);
			do
			{
				System.out.println("Enter 1. For searching a product using Id\n" 
						+ "Enter 2. To order a product \n" + "Enter 3. To cancel an order using Id \n" 
						+ "Enter 4. To go back to the Main menu \n");

				System.out.println("=======================================================================================");
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				System.out.println("=======================================================================================");


				switch (choice) {

			    case 1: 
					 System.out.println("Enter Id to display product: ");
					 int id = sc.nextInt();
					 try
						{
						ProductService.getProductById(id);
						}
						catch(GlobalException e)
						{
						System.out.println(e.getMessage());
						}
					 System.out.println("=======================================================================================");
						break;						
							
				 case 2:
					 ProductService.bookProduct ();
					 System.out.println("=======================================================================================");
						    break;
						    
				 case 3:
					 System.out.println("Enter Id to cancel an order: ");
					 int id2 = sc.nextInt();
					 try
						{
						ProductService.cancelOrder(id2);
						}
						catch(GlobalException e)
						{
						System.out.println(e.getMessage());
						}
				 System.out.println("=======================================================================================");
						break;
					 
				 case 4:
					ShoppingKartArrayListOperations.mainMenu();
					;
				default:
					System.out.println("Please enter a correct choice from the menu!  ");
				}
			}
			while(choice!=4);
			
		}
}