package javapractice.order;

import java.util.Comparator;

public class Order implements Comparable<Order> {
	
	private int orderID;
	private String customerID;

	public static class SortByOrderID implements Comparator<Order> {
		@Override
		public int compare(Order o1, Order o2) {
			return o1.orderID > o2.orderID ? 1 : (o1.orderID  < o2.orderID ? -1 : 0);
		}		
	}
	
	public static class SortByCustomerID implements Comparator<Order> {
		@Override
		public int compare(Order o1, Order o2) {
			return o1.customerID.compareTo(o2.customerID);
		}		
	}
	public int getOrderID() {
		return orderID;
	}
	
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public Order(int orderID, String customerID) {
		this.orderID = orderID;
		this.customerID = customerID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	@Override
	public int compareTo(Order o) {
		return this.orderID > orderID ? 1 : (this.orderID < orderID ? -1 : 0);
	}

	@Override
	public String toString() {
		return String.valueOf(orderID);
	}

}
