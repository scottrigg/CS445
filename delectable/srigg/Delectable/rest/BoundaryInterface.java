package srigg.Delectable.rest;

import java.util.ArrayList;
import srigg.Delectable.objects.*;

public interface BoundaryInterface {

	//Customers
	public ArrayList<Customer> getCust();
	public ArrayList<Customer> getCustomerByKey(String key);
	public Customer getCutomerByID();
	
	//Orders
	public ArrayList<Order> getOrders();
	public ArrayList<Order> getOrderByDate();
	public Order getOrderByOID(int oid);
	public void createOrder(String delivery_date, Address delivery_address, Customer personal_info, String note, ArrayList<FoodItem> order_details);
	public void cancelOrder(int oid);
	
	//Menu
	public ArrayList<Food> getMenu();
	public Food getMenuByMID(int fid);
	
//	//Report
//	public ArrayList<Report> getReport();
//	public Report getReportByRID(String start_date, String end_date);
	
//	//Admin
//	public void createMenuEntry(String name, double price_per_person, int minimum_order, ArrayList<String> categories);
//	public void changeMenuItemPrice(int mid, double price_per_person);
//	public double getSurcharge();
//	public void updateSurcharge(double surcharge);
//	public void updateOrderStatus(int oid);
}
