package edu.iit.cs445.s2016.srigg;

import java.util.Date;

public class Food {

	private int fid = 0;
	private String food_name;
	private double price_per_person;
	private int minimum_order;
	private String category[];
	private String category_name;

	public Food(String name, Double price, int minimum, String ctgry[])
	{
		fid = IdGen.newID();
		food_name=name;
		price_per_person=price;
		minimum_order=minimum;
		category=ctgry;
	}
	
	public void updateFood(String name, Double price, int minimum, String ctgry[])
	{
		food_name=name;
		price_per_person=price;
		minimum_order=minimum;
		category=ctgry;
	}
	
	public void updateFoodName(String newname)
	{
		food_name=newname;
		//updatedate;
	}
	
	public int getFID()
	{
		return fid;
	}
	
	public String getFoodName()
	{
		return food_name;
	}
	
	public int getMinimumOrder()
	{
		return minimum_order;
	}
	
	public double getPricePerson()
	{
		return price_per_person;
	}
	
	public String[] getCategories()
	{
		return category;
	}
	
	public boolean foodMatch(String key)
	{
		if(this.food_name.matches(key) || Integer.toString(minimum_order).equals(key) || Double.toString(price_per_person).equals(key))
		{
			return true;
		}

		return false;
	}
	
	public boolean matchFID(int FID)
	{
		return FID==fid;
	}
}
