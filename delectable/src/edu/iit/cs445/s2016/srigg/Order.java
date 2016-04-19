package edu.iit.cs445.s2016.srigg;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Order 
{
	private int OID;
	private Date order_date;
	private Date delivery_date;
	private double total_cost;
	private double surcharge;
	private boolean order_status;
	private Customer ordered_by;
	private Address address;
	private ArrayList<FoodItem> food_items;
	private String notes;
	
	public Order(Customer cust, Date dlv_date, String note, ArrayList<FoodItem> fi, Address da)
	{
		delivery_date=dlv_date;
		ordered_by = cust;
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 1);
		cal.set(Calendar.WEEK_OF_MONTH, 1);
		cal.set(Calendar.DAY_OF_WEEK,1);
		cal.set(Calendar.HOUR, 12);
		cal.set(Calendar.MINUTE, 0);
		order_date = cal.getTime();
		OID = IdGen.newID();
		notes=note;
		order_status=true;
		delivery_date=dlv_date;
	
	}
	
	public int getOrderId()
	{
		return OID;
	}
	
	public void setOrderDate(Date date)
	{
		order_date=date;
	}
	
	public void setNotes(String note)
	{
		notes=note;
	}
	
	public void setTotalCost(Double cost)
	{
		this.total_cost=cost;
	}
	
	public Date getOrderDate()
	{
		return order_date;
	}
	
	public String getNotes()
	{
		return notes;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (!(o instanceof Order)) return false;
		
		Order order = (Order) o;
		
		if (OID!= order.OID) return false;
		
		return true;
	}
	
	public int getOID()
	{
		return OID;
	}
	
	public double getTotalCost()
	{//method iterates through all the items in the order, then calculates the cost of them all
		double total=0;
		for(int i=0;i<food_items.size();i++)
		{
			FoodItem fitem=food_items.get(i);
			total = total+fitem.getItemOrderAmount();
		}
		total =total + surcharge; //something.getsurcharge()?
		return total;
	}

	public boolean orderMatch(String key)
	{
		if(delivery_date.toString().matches(key)||order_date.toString().matches(key)||notes.matches(key)||ordered_by.customerMatch(key)
				||address.toString().matches(key))
		{
			return true;
		}
		else return false;
		
	}

	public boolean matchesOID(int oid2) {
		// TODO Auto-generated method stub
		return oid2==OID;
	}
	
	public boolean deliveryDateMatch(Date dd)
	{
		return dd==delivery_date;
	}
	
}
