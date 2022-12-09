package shoopingKartusingarray;

import java.util.Scanner;

//this class is responsible for all operations
public class ProductService {
	
	//this is product array of type product class,will store will product details
	static Product product[]=new Product[10];
	//this is order details array type order details class ,will store order details
	static OrderDetails order[]=new OrderDetails[10];
	
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	static int orderIndex=0;
	static int orderId=1;

	//this method is responsible to add product in the array
	public static void createProduct()
	{
		System.out.println("Enter Product Id");
		int id=sc.nextInt();
		
		sc.nextLine();   //it will consume the \n character

		System.out.println("Enter Product Name:");
		String name=sc.nextLine();
		System.out.println("Enter Product Brand:");
		String brand=sc.nextLine();
	    System.out.println("Enter Product Price:");
		double price=sc.nextDouble();
		System.out.println("Enter Stock:");
		int quantity=sc.nextInt();
		
		// this will insert in an array
		product[index]=new Product(id,name,brand,price,quantity);
		index++; 
		System.out.println("\nProduct added successfully!!");
	}

	//this method is responsible to retrieve product details
	public static void getAllProduct()
	{
		for(int i=0;i<index;i++)
		{
			System.out.println("Product Id: "+product[i].getId());
			System.out.println("Product Name: "+product[i].getName());
			System.out.println("Product Brand: "+product[i].getBrand());
			System.out.println("Product price: "+product[i].getPrice());
			System.out.println("Product Stock: "+product[i].getQuantity());
			System.out.println("=========================================");
		}
	}

	//this method is responsible to retrieve product details by id 
  static void getProductById()
	{
		boolean f=false;
		System.out.println("Enter Id to Search Product:");
		int id=sc.nextInt();
		System.out.println("=========================================");
		for(int i=0;i<index;i++)
		{
			if(product[i].getId()==id)
			{
				System.out.println("Product Id:"+product[i].getId());
				System.out.println("Product Name:"+product[i].getName());
				System.out.println("Product Brand:"+product[i].getBrand());
				System.out.println("Product price:"+product[i].getPrice());
				System.out.println("Product Stock:"+product[i].getQuantity());
				System.out.println("=========================================");
				f=true;
				break;
			}
		}
		if(f==false)
		{
			System.out.println("Product Id not Found.");
			System.out.println("=========================================");
		}
	}
  //this method is responsible to order product
  static void bookProduct()
  {
	  boolean f=false;
	  sc.nextLine();
	  System.out.println(" Enter product Name :");
	  String name=sc.nextLine();
	  System.out.println("==============================================");
	  
	  //display product for booking
	  for(int i=0;i<index;i++)
	  {
		  if(product[i].getName().equalsIgnoreCase(name))
		  {
			  System.out.println("Product Id:"+product[i].getId());
				System.out.println("Product Name:"+product[i].getName());
				System.out.println("Product Brand:"+product[i].getBrand());
				System.out.println("Product price:"+product[i].getPrice());
				if(product[i].getQuantity()<=0)
				{
					System.out.println("Currently Unavailable");
				}
				else
				{
				System.out.println("Product Stock:"+product[i].getQuantity());
				}
				System.out.println("=========================================");
				f=true;
		  }
	  }
	  //if searched product is available ,then proceed for booking
	  if(f==true)
		{
		   int confirmation;
		   
		   System.out.println("want to book product? if yes then press1,else pres 2 :");
		   confirmation=sc.nextInt();
		   if(confirmation==1)
		   {
			System.out.println("For booking enter Id :");
			int id=sc.nextInt();
			for(int i=0;i<index;i++)
			{
				if(product[i].getId()==id)
				{
					System.out.println("Enter quantity :");
					int quantity=sc.nextInt();
					
					//checking stock is available or not
					if(product[i].getQuantity()>quantity)
					{
						System.out.println("Your booking is done succesfully");
						double total=quantity*product[i].getPrice();
						System.out.println("Booking Details : ");
						System.out.println("product name: "+product[i].getName());
						System.out.println("product brand : "+product[i].getBrand());
						System.out.println("product Quantity : "+quantity);
						System.out.println("Total Amount: "+total);
						
						//updating stock after booking product-after order
			      	product[i].setQuantity(product[i].getQuantity()-quantity);
			      	
			      	//adding order details to an array
						order[orderIndex]=new OrderDetails(orderId,product[i].getId(),name,
						product[i].getBrand(),quantity,total);
						orderIndex++;
						orderId++;
						break;
					}
				}
			}
		   }//confirmation if closed
		   else
		   {
			   ShoopingKartOperations.AllMenus();
		   }
		}
	  else
	  System.out.println("No such product available in shopping cart");
  }
  
	//this method is responsible to display all order details		
	static void showAllOrder()
	{
		System.out.println("Ordered history");
		for(int i=0;i<orderIndex;i++)
		{
		System.out.println("Order Id : "+order[i].getOrderId());
		System.out.println("productName : "+order[i].getProductName());
		System.out.println("product Brand : "+order[i].getBrand());
		System.out.println("order price : "+order[i].getQuantity());
		System.out.println("Order Amount: "+order[i].getTotalAmount());
		System.out.println("============================================");
		}
	}
	
	//this method is responsible to update product details by product id	
	static void updateProductById()
	{
		boolean status=false;
		System.out.println("Enter product id to update the product details:");
		int id=sc.nextInt();
		for(int i=0;i<index;i++)
		{
			if(id==product[i].getId())
			{
				System.out.println("Enter new Product Id");
				int pid=sc.nextInt();
				
				sc.nextLine();   //it will consume the \n character

				System.out.println("Enter new Product Name:");
				String name=sc.nextLine();
				System.out.println("Enter new Product Brand:");
				String brand=sc.nextLine();
			    System.out.println("Enter new Product Price:");
				double price=sc.nextDouble();
				System.out.println("Enter new Stock:");
				int quantity=sc.nextInt();
				product[i]=new Product(pid,name,brand,price,quantity);
				System.out.println("Product has been updated successfully!!");
				status=true;
			}		
		}
		if(status==false)
		{
			System.out.println("Product Id not found");
			System.out.println("=====================================");
		}
	}
	//This method is responsible to  delete by product id
	static void deleteProductById()
	{
		boolean status=false;
		System.out.println("Enter product id to delete product details :");
		int id=sc.nextInt();
		for(int i=0;i<index;i++)
		{
			if(id==product[i].getId())
			{
				for(int j=i;j<index-1;j++)
				{
					product[j]=product[j+1];
				}
			
			index--;
			System.out.println("Product item deleted successfully !!!");
			status=true;
			break;
		    }
		}
	if(status==false) 
	{
		System.out.println("Product id not found");
		System.out.println("==================================================");
	}
	}
	
	
	
	
	
	//This method is responsible to cancel order
	static void cancelOrder()
	{
		boolean status=false;
	
		System.out.println("Enter order id to cancel the product");
         int OId=sc.nextInt();
         for(int i=0;i<orderIndex;i++)
         {
        	 if(OId==order[i].getOrderId())     //1==order[0]1
        	 {
        		 // this code will be increasing product stock after cancel
        		for(int k=0;k<index;k++)		//loop for product
        		{
        			//checking ordered product id matching with product id
        			if(product[k].getId()==order[i].getProductId())
        			{
        				//increasing the stock in product array during cancellation
        				product[k].setQuantity(product[k].getQuantity()+order[i].getQuantity());
        			}
        		}
        		//this code id for delete order details from an array
        		for(int j=i;j<orderIndex;j++)
        		{
        			order[j]=order[j+1];
        		}
        		orderIndex--;
        		System.out.println("Order cancelled successfully");
        		status=true;
        		break;
        	 }
         }
         if(status==false)
         {
        	 System.out.println("Order Id not found");
        	 System.out.println("=====================================================");
         }
	}
	}


