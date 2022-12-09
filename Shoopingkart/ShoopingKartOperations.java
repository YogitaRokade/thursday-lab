package shoopingKartusingarray;
import java.util.Scanner;
public class ShoopingKartOperations {
	static Scanner sc=new Scanner(System.in);
	//this class for all admin operations
	static void AllMenus()
	{
	int choice;
	
	
	while(true)
	{
		System.out.println("=====================================================");
	
	System.out.println("press 1.For admin Panel\n"+"Press 2.For user Panel\n"
	                   +"Press3.For Quit");
	System.out.println("=========================================================");
	System.out.println("Enter your choice");
	choice=sc.nextInt();
	 System.out.println("=========================================================");
	 
	 //all admin operations listed here
	 switch(choice)
	 { 
	 case 1:						
		 do {                           
		 System.out.println("Enter 1. for Add Product\n"+
		                  "Enter 2. for Update product\n"
					      + "Enter 3. for delete product\n"
					      +"Enter 4 for show all products\n"
					      +"Enter 5.for show product by Id\n"
					+"Enter 6 for show all orders\n"
					      +"Enter 7. for go back to the main menu");
		 System.out.println("=====================================================");
		 System.out.println("Enter your choice");
		 choice=sc.nextInt();
		 System.out.println("======================================================");
			
	        switch(choice)		
	         {
	        case 1:
	     	      ProductService.createProduct();
	              System.out.println("=============================================");
	              break;
	              
	        case 2:ProductService.updateProductById();
	    	       System.out.println("============================================");
	    	       break;
	    	
	        case 3:ProductService.deleteProductById();
		  	       System.out.println("============================================");
		  	       break;
		  	
	        case 4:
		         ProductService.getAllProduct();
	             System.out.println("=============================================");
	             break;
	            
	        case 5:ProductService.getProductById();
	              System.out.println("============================================");
	               break;
	
	        case 6:ProductService.showAllOrder();
	    	System.out.println("==================================================");
	    	break;
	  	           
	    	case 7:
	    	
	    	default:AllMenus();
	    	break;
	      }
		 }
		 while(choice!=7);
		 
		 //all user operations listed here
	 
		 case 2:
			 do
			 {
		    
	            System.out.println("press 1. for book products\n"
			+ "Enter 2. for cancel product\n"
		       +"Enter 1 for go back to the main menu");
	
	         System.out.println("====================================================");
	         System.out.println("Enter your choice");
	         choice=sc.nextInt();
	         System.out.println("===================================================");
	     
	        switch(choice)
	         {
	         
	         case 1:
	        	 ProductService.bookProduct();
	     	     System.out.println("===============================================");
	     	     break;
	         case 2:ProductService.cancelOrder();
	     	    System.out.println("=================================================");
	     	   break;
	     	case 3:	    	
	     		default:AllMenus();
	    	break;
	     		
	         }
	     }
	     while(choice!=3);
	
	case 3:System.exit(0);
	default:System.out.println("Please enter correct choice from menu");
	}
	}
	
    }
	
	}



