package shoppingkartuingarraylist;

import java.util.ArrayList;

//this class is responsible for store all order details

	public class OrderDetails {
		//Java bean 
		//Order Detail class to store order details
		private String name;
		private String brand;
		private int stock; 
		private int productId;
		private double totalAmount;
		private int orderId;
		
		public OrderDetails(String name, String brand, int stock, int productId, double totalAmount, int orderId) {
			super();
			this.name = name;
			this.brand = brand;
			this.stock = stock;
			this.productId = productId;
			this.totalAmount = totalAmount;
			this.orderId = orderId;
		}

		public OrderDetails() {
			super();
			// TODO Auto-generated constructor stub
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public int getStock() {
			return stock;
		}

		public void setStock(int stock) {
			this.stock = stock;
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public double getTotalAmount() {
			return totalAmount;
			
		}

		public int getOrderId() {
			return orderId;
		}

		public void setOrderId(int orderId) {
			this.orderId = orderId;
		}

		public void setTotalAmount(double totalAmount) {
			this.totalAmount = totalAmount;
		}
		}


