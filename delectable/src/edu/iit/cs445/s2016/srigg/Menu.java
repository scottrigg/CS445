package edu.iit.cs445.s2016.srigg;

import java.util.ArrayList;

public class Menu {

	private double surcharge=0;
	private ArrayList<Food> menulisting;
	
	
	private Menu()
	{
		menulisting = new ArrayList<Food>();
	}
	
	public ArrayList<Food> menuListing()
	{
		return menulisting;
	}
	

	public void deleteFoodItem(int fid)
	{
		for(int i=0; i<menulisting.size();i++)
		{
			Food f = menulisting.get(i);
			if(f.getFID()==fid)
			{
				menulisting.remove(f);
			}
			
		}
	}
	
	public void addFoodItem(Food food1)
	{
		menulisting.add(food1);
	}

//	public boolean matchesId(int fid) {
//		// TODO Auto-generated method stub
//		
//		return fid==OID;
//		
//	}
}
