package com.lgb.coh2;

import java.util.ArrayList;

public class Basket {
	
	private ArrayList<String> basket=new ArrayList<String>();

	protected ArrayList<String> getBasket() {
		return basket;
	}

	protected void ammendBasket(ArrayList<String> basket) {
		this.basket = basket;
	} 
	
	
	
	
	

}
