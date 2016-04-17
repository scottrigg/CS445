package srigg.Delectable.objects;

import java.util.ArrayList;

public class Customer {

	private String customer_name, customer_email, customer_phone;
	private int CID;
	private boolean on;
	private Order order;
	private ArrayList<Order> orderHistory = new ArrayList<Order>();
	private Address shipping_address;
	
	public Customer()
	{
		customer_name = "Bob Dole";
		customer_email = "Bob.dole@iit.edu";
		customer_phone = "5555555555";
		CID = IdGen.newID();
		//this.order = new Order(this, null, email, null, address, ID);
		on=true;
	}
	
	public Customer(String name, String email, String phone, Address address)
	{
		customer_name = name;
		customer_email = email;
		customer_phone = phone;
		shipping_address = address;
		CID = IdGen.newID();
		on=true;
		
	}
	
	public String getName()
	{
		return customer_name;
	}
	
	public void setName(String name)
	{
		customer_name=name;
	}
	
	public void setCID()
	{
		CID=IdGen.newID();
	}
	
	public int getCID()
	{
		return CID;
	}
	
	public String getPhone()
	{
		return customer_phone;
	}
	
	public void setPhone(String newphone)
	{
		customer_phone=newphone;
	}
	
	public String getEmail()
	{
		return customer_email;
	}
	
	public void setEmail(String newemail)
	{
		customer_email=newemail;
	}
	
	public ArrayList<Order> getOrderHistory()
	{
		return orderHistory;
	}
	
	public void setOrderHistory(ArrayList<Order> order_hist)
	{
		orderHistory = order_hist;
	}
	
	public Address getCustomerAddress()
	{
		return shipping_address;
	}
	
	public void setCustomerAddress(Address newaddress)
	{
		shipping_address = newaddress;
	}
	
	public boolean matchesId(int cid)
	{
		return (cid==CID);
	}
	
	public boolean phoneMatch(String key)
	{
		String s = key.replaceAll("[\\s\\-()]","");
		String regex = "(?i).*" + s + ".*";
		return customer_phone.matches(regex);
	}
	
	public boolean nameMatch(String key)
	{
		String s = "(?i).*" + key + ".*";
		return customer_name.matches(s);
	}
	
	public boolean emailMatch(String key)
	{
		String s = "(?i).*" + key + ".*";
		return customer_email.matches(s);
	}
	
	public boolean customerMatch(String key)
	{
		if(phoneMatch(key)||emailMatch(key)|| nameMatch(key))
		{
			return true;
		}
		else return false;
	}
	
}
