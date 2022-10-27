package com.lgb.coh2;

import java.util.ArrayList;

public class Shop {

	public static void main(String[] args) {
		
		ArrayList<Product> cat = new ArrayList<Product>();
		ArrayList<Warranty> warrantyList = new ArrayList<Warranty>();
		Basket custBasket = new Basket();
		
		//Build Product Cat
		Product lgTv = new Product("LG TV", 500, 2, "Rubbish - get a Sony", true, 20);
		cat.add(lgTv);
		Product sonyTv = new Product("Sony TV", 800, 1, "Congrats", false, 20);
		cat.add(sonyTv);
		
		//Build Warranty List
		Warranty twelveMonth = new Warranty(12, 10);
		Warranty twentyFourMonth = new Warranty(24, 18);
		Warranty thirtySixMonth = new Warranty(36, 69);
		warrantyList.add(twentyFourMonth);
		warrantyList.add(twelveMonth);
		warrantyList.add(thirtySixMonth);

	}

}
