package srigg.Delectable.rest;

import java.util.ArrayList;
import java.util.Date;

import srigg.Delectable.objects.*;

public class delectableManager implements BoundaryInterface{

	//Customers
	private static ArrayList<Customer> customer_list = new ArrayList<Customer>();
	
	public ArrayList<Customer> getCust()
	{
		return customer_list;
	}
	
	public ArrayList<Customer> getCustomerByKey(String key)
	{
		for(int i=0;i<customer_list.size();i++)
		{
			Customer c = customer_list.get(i);
			if(c.customerMatch(key)) 
				customer_list.add(c);
		}
		return customer_list;
	}
	
	public Customer getCustomerByID(int id)
	{
		Customer foundc=null;
		for(int i=0;i<customer_list.size();i++)
		{
			Customer c = customer_list.get(i);
			if(c.matchesId(id)) 
				foundc =c;
		}
		return foundc;
	}
	
	//Orders
	private static ArrayList<Order> order_list = new ArrayList<Order>();
	public ArrayList<Order> getOrders()
	{
		return order_list;
		
	}
	
	public ArrayList<Order> getOrderByDate(Date date)
	{
		ArrayList<Order> order_list_by_date= new ArrayList<Order>();
		Order o;
		for(int i=0;i<order_list.size();i++)
		{
			o = order_list.get(i);
			if(o.deliveryDateMatch(date))
			{
				order_list_by_date.add(o);
			}
		}
		return order_list_by_date;
	}
	
	public Order getOrderByOID(int oid)
	{
		Order foundo=null;
		for(int i=0;i<order_list.size();i++)
		{
			Order o = order_list.get(i);
			if(o.matchesOID(oid)) 
				foundo =o;
		}
		return foundo;
	}
	
	public void createOrder(Date delivery_date, Address delivery_address, Customer personal_info, String note, 
			ArrayList<FoodItem> order_details)
	{
		Order new_order= new Order(personal_info,delivery_date, note, order_details, delivery_address);
		order_list.add(new_order);
	}
	
	public void cancelOrder(int oid)
	{
		for(int i=0; i<order_list.size();i++)
		{
			if(order_list.get(i).matchesOID(oid))
				order_list.remove(i);
		}
	}
	
	//Menu
	private static ArrayList<Food> menu_items = new ArrayList<Food>();

	public ArrayList<Food> getMenu()
	{
		return menu_items;
	}
	
	public Food getMenuByMID(int fid)
	{
		Food foundf=null;
		for(int i=0;i<menu_items.size();i++)
		{
			Food f = menu_items.get(i);
			if(f.matchFID(fid)) 
				foundf =f;
		}
		return foundf;
	}

	@Override
	public Customer getCutomerByID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Order> getOrderByDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createOrder(String delivery_date, Address delivery_address, Customer personal_info, String note,
			ArrayList<FoodItem> order_details) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public Customer getCutomerByID(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public ArrayList<Order> getOrderByDate(String date) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void createOrder(String delivery_date, Address delivery_address, Customer personal_info, String note,
//			ArrayList<FoodItem> order_details) {
//		// TODO Auto-generated method stub
//		
//	}
	
//	//Report
//	private static ArrayList<Report> report_list = new ArrayList<Report>();
//	
//	public ArrayList<Report> getReport()
//	{
//		return report_list;
//	}
//	
//	public ArrayList<Report> getReportByRID(int rid, String start_date, String end_date)
//	{
//		Report rep=null;
//		
//		for(int i=0; i<report_list.size();i++)
//		{
//			Report r = report_list.get(i);
//		}
//	}
	
	//Admin
	//private static 
	
	
}


////Customers
//	public ArrayList<Customer> getCust();
//	public ArrayList<Customer> getCustomerKey(String query_string);
//	public Customer getCutomerByID(int id);
//	
//	//Orders
//	public ArrayList<Order> getOrders();
//	public ArrayList<Order> getOrderByDate(String date);
//	public ArrayList<Order> getOrderByOID(int oid);
//	public int createOrder(String delivery_date, Address delivery_address, Customer personal_info, String note, ArrayList<FoodItem> order_details);
//	public void cancelOrder(int oid);
//	
//	//Menu
//	public ArrayList<Menu> getMenu();
//	public ArrayList<Menu> getMenuByMID();
//	
//	//Report
//	public ArrayList<Report> getReport();
//	public ArrayList<Report> getReportByRID(String start_date, String end_date);
//	
//	//Admin
//	public void createMenuEntry(String name, double price_per_person, int minimum_order, ArrayList<String> categories);
//	public void changeMenuItemPrice(int mid, double price_per_person);
//	public double getSurcharge();
//	public void updateSurcharge(double surcharge);
//	public void updateOrderStatus(int oid);
