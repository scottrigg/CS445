package edu.iit.cs445.s2016.srigg;

import java.util.ArrayList;

public class FoodItem {
//class for when the customer is picking the food item they want
	private Food food;
	private int quantity_ordered;
	private ArrayList<Food> menulisting;
	private double item_amount;
	
	public FoodItem(Food fd, int quantity) throws RuntimeException
	{//inputs what the food is, and how much of it is being ordered.
		food=fd;
		if(quantity<food.getMinimumOrder())
		{//if the quantity specified is < the minimum amount, throw a runtime exception
			throw new RuntimeException();
		}
		quantity_ordered=quantity;
		double price_per_person=new Double(food.getPricePerson());
		item_amount = price_per_person * quantity;
		
	}
	
	public ArrayList<Food> queryFoodItem(String key)
	{//method looks through the menu and uses the Match() method to find food matches.
	 //If found, it adds it to the array of results, foodlisting
		ArrayList<Food> foodlisting = new ArrayList<Food>();
		for(int i=0; i<menulisting.size();i++)
		{
			Food f = menulisting.get(i);
			if(f.foodMatch(key))
			{
				foodlisting.add(f);
			}
		}
		return foodlisting;
	}
	
	public Food getFood()
	{
		return food;
	}
	
	public int getFID()
	{
		return food.getFID();
	}
	
	public int getMinimumOrderOf()
	{
		return food.getMinimumOrder();
	}
	
	public double getPriceOf()
	{
		return food.getPricePerson();
	}
	
	public double getItemOrderAmount()
	{//
		return item_amount;
	}

}
