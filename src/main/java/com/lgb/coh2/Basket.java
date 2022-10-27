package com.lgb.coh2;

import java.util.ArrayList;

public class Basket {
	
	private ArrayList<Item> basket=new ArrayList<Item>();

	protected ArrayList<Item> getBasket() {
		return basket;
	}

	protected void addToBasket(Item anItem) {
		
		basket.add(anItem);
	} 
	
	protected int getTotalItems()
	{
		return basket.size();
	}
	
	
	
	
	

}
