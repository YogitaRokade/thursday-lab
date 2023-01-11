package shoppingkartuingarraylist;
import java.util.ArrayList;
import java.util.Scanner;


public class ProductService {
	
	//ArrayList to store and display product 
	static ArrayList<Product> product=new ArrayList<Product>();

	//this is order details ArrayList of type OrderDetails class,will store order details
	static ArrayList<OrderDetails> orders=new ArrayList<OrderDetails>();

	static Scanner sc=new Scanner(System.in);
	static int orderId=1;

	//this method is responsible to add product in the ArrayList
	static void addProduct()
	{
		System.out.println("Enter Product id:");
		int id=sc.nextInt();
		
		sc.nextLine(); //it will consume the \n character
		
		System.out.println("Enter Product Name:");
		String name=sc.nextLine();
		
		System.out.println("Enter Product Brand:");
		String brand=sc.nextLine();
		
		System.out.println("Enter Product Price:");
		double price=sc.nextDouble();
		
		System.out.println("Enter Product Stock:");
		int stock=sc.nextInt();
		
		//will insert in an ArrayList
		product.add(new Product(id, name, brand, price, stock));
		System.out.println("Product details added successfully!!");
		
	}

	//this method is responsible to update product by id
	static void updateProductById(int id) throws GlobalException
	{
		boolean status=false;
		for(int i=0;i<product.size();i++)
		{
			if(id==product.get(i).getId())
			{
				
				System.out.println("Enter new Product id:");
				int pid=sc.nextInt();
				
				sc.nextLine(); //it will consume the \n character
				
				System.out.println("Enter new Product Name:");
				String name=sc.nextLine();
				
				System.out.println("Enter new Product Brand:");
			    String brand=sc.nextLine();
				
				System.out.println("Enter new Product Price:");
				double price=sc.nextDouble();
				
				System.out.println("Enter new Product Stock:");
				int stock=sc.nextInt();
				
				product.set(i, new Product(pid, name, brand, price, stock));
				System.out.println("Product has been updated successfully!");
				status=true;
			}
		}
		
		if(status==false)
	         throw new GlobalException("Product id not found!!!");
	}

	//this method is responsible to retrieve product details by id
	static void getProductById(int id) throws GlobalException
	{
		boolean status=false;
		for(int i=0;i<product.size();i++)
		{
			if(id==product.get(i).getId())
			{
				System.out.println("Product Id:"+product.get(i).getId());
				System.out.println("Product Name:"+product.get(i).getName());
				System.out.println("Product Brand:"+product.get(i).getBrand());
				System.out.println("Product Price:"+product.get(i).getPrice());
				System.out.println("Product Stock:"+product.get(i).getStock());
				status=true;
				break;
			}
		}
		if(status==false)
		     throw new GlobalException("Product id not found!!!");
	}

	//this method is responsible to delete a product using Id
	static void deleteProductById(int id) throws GlobalException
	{
		boolean status=false;
		for(int i=0;i<product.size();i++)
		{
			if(id==product.get(i).getId())
			{
				product.remove(i);
				System.out.println("Product with Id "+id+" is deleted successfully!!");
				System.out.println("======================================================================");
				status=true;
			}
		}
		if(status==false)
		     throw new GlobalException("Product id not found!!!");
	}

	//this method is responsible to Deleting all the product that have been added
	static void deleteAllProduct() 
	{
		for(int i=0;i<product.size();i++)
		{
			product.clear();
			System.out.println("All the product has been removed successfully");
			System.out.println("Chart is Empty");
		}
		
	}

	//this method is responsible to retrieve all product details
	static void displayAllProduct()
	{
		for(int i=0;i<product.size();i++)
		{
			System.out.println("Product Id:"+product.get(i).getId());
			System.out.println("Product Name:"+product.get(i).getName());
			System.out.println("Product Brand:"+product.get(i).getBrand());
			System.out.println("Product Price:"+product.get(i).getPrice());
			System.out.println("Product Stock:"+product.get(i).getStock());
			System.out.println("===========================================================================");
		}	
	}

	//this method is responsible to order product 
	static void bookProduct()
	{
		boolean status=false;
		sc.nextLine();
		System.out.println("Enter Product Name:");
		String name=sc.nextLine();
		System.out.println("==============================================================================");
		
		//display product for booking
		for(int i=0;i<product.size();i++)
		{
			if(product.get(i).getName().equalsIgnoreCase(name)) 
			{
				System.out.println("Product Id:"+product.get(i).getId());
				System.out.println("Product Name:"+product.get(i).getName());
				System.out.println("Product Brand:"+product.get(i).getBrand());
				System.out.println("Product Price: "+product.get(i).getPrice());			
				
				if(product.get(i).getStock()<=0)
				{
					System.out.println("This product is Currently Unavialable");
				}
				else
				{
				System.out.println("Product Stock:"+product.get(i).getStock());
				}
				System.out.println("======================================================================");
				status=true;
			}
		}
		
		//if searched product is available,then proceed for booking
		if(status==true)
		{
			int confirmation;
			//sc.nextLine();
			System.out.println("Want to book product? if Yes then press '1' else press '2':");
			confirmation=sc.nextInt();
			if(confirmation==1)
			{
			System.out.println("For Booking, Enter Id");
			int id=sc.nextInt();
			
			for(int i=0;i<product.size();i++)
			{
				if(product.get(i).getId()==id)
				{
					System.out.println("Enter quantity:");
					int quantity=sc.nextInt();
					
					//checking stock is available or not
					if(product.get(i).getStock()>=quantity)  
					{
						System.out.println("Your Booking has done successfully!!");
						double totalAmount=quantity*product.get(i).getPrice();
						System.out.println("\n~~Booking Details:~~");
						System.out.println("Product Name:"+product.get(i).getName());
						System.out.println("Product Brand:"+product.get(i).getBrand());
						System.out.println("Product Quantity:"+quantity);
						System.out.println("Total Amount:"+totalAmount);
						
						//updating stock after booking product
						product.get(i).setStock(product.get(i).getStock()-quantity);

						orders.add(new OrderDetails(name,product.get(i).getBrand(),quantity,id,totalAmount,orderId));
						orderId++;
						break;			
					}
				}
			}		
		}//confirmation if closed
			else
			{
				ShoppingKartArrayListOperations.mainMenu();
			}
		}
		else
			System.out.println("No such product available in shopping kart!!");
	}

	//this method is responsible to cancel order
	static void cancelOrder(int id) throws GlobalException
	{
		boolean status=false;
		for(int i=0;i<orders.size();i++)
		{
			if(id==orders.get(i).getOrderId())  //1==order[0]1
			{
				//this code will be increasing product stock after cancel
				for(int k=0;k<product.size();k++)  //loop for product
				{
					//checking ordered product id matching with product id
					if(product.get(k).getId()==orders.get(i).getProductId())
					{
						//increasing the stock in product array during cancellation
						product.get(k).setStock(product.get(k).getStock()+
								orders.get(i).getStock());
					}
				}
				//this code id for delete order details from an ArrayList
				for(int j=i;j<orders.size();j++)
					{
					if(id==orders.get(j).getOrderId())
					{
						orders.remove(j);
					    System.out.println("Order Id "+id+" has been cancelled successfully! ");
					    status = true;
					    break;
					}
					}
			}
		}
		
		if (status == false)
			throw new GlobalException("Product id not found!!");
	}

	//this method is responsible to show all order
	static void showAllOrder()
	{
		System.out.println("~~Ordered History~~");
		for(int i=0;i<orders.size();i++)
		{
			System.out.println("Order Id:"+orders.get(i).getOrderId());
			System.out.println("Product Name:"+orders.get(i).getName());
			System.out.println("Product Brand:"+orders.get(i).getBrand());
			System.out.println("Order Quantity:"+orders.get(i).getStock());
			System.out.println("Order Amount:"+orders.get(i).getTotalAmount());
			System.out.println("==========================================================================");
		}
	}
}




		
	

	


