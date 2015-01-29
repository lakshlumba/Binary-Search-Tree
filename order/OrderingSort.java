package javapractice.order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingSort {
	public static void main (String args[]){
		Order order1 = new Order(1001,"lucky");
		Order order2 = new Order(1002,"luck");
		Order order3 = new Order(1003,"luc");
		List<Order> list = new ArrayList<Order>();
		list.add(order2);list.add(order1);list.add(order3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		Collections.sort(list, new Order.SortByCustomerID());
		//Collections.sort(list,Order.SortByOrderID());
	}

}
