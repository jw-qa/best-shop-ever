package com.lgb.coh2;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Shop {

	public static void main(String[] args) {

		ArrayList<Product> cat = new ArrayList<Product>();
		ArrayList<Item> it = new ArrayList<Item>();
		ArrayList<Warranty> warrantyList = new ArrayList<Warranty>();
		Basket custBasket = new Basket();

		// Build Product Cat
		Product lgTv = new Product("LG TV", 500, 2, "Rubbish - get a Sony", true, 20);
		cat.add(lgTv);
		Product sonyTv = new Product("Sony TV", 800, 1, "Congrats", false, 20);
		cat.add(sonyTv);

		// Build Warranty List
		Warranty twelveMonth = new Warranty(12, 10);
		Warranty twentyFourMonth = new Warranty(24, 18);
		Warranty thirtySixMonth = new Warranty(36, 69);
		warrantyList.add(twelveMonth);
		warrantyList.add(twentyFourMonth);
		warrantyList.add(thirtySixMonth);

//		// adding to basket
//		Item myItem = new Item(lgTv, 1);
//		custBasket.addToBasket(myItem);

		shopWelcome(cat);

//		for (Warranty w : warrantyList)
//			System.out.println(w.getType());
//
//		for (Item item : custBasket.getBasket())
//			System.out.println(item.getThisProduct().getProductName());
		addItemsToBasket(cat, custBasket.getBasket(), it);

	}

	static void addItemsToBasket(ArrayList<Product> cat, ArrayList<Item> basket, ArrayList<Item> item) {

		Scanner console = new Scanner(System.in);
		String lineRead = " ee";
		

		try {
			while (prompt() && (lineRead = console.next()) != null) {
				
				if (lineRead.toString().equalsIgnoreCase("QUIT"))
					break;
				
				
				String itemName = console.next();
				System.out.println("Enter the Quantity  :");
				
				int quantity =Integer.parseInt(console.next());
				
				for (Product product : cat) {

					if (product.getProductName().equalsIgnoreCase(itemName)) {

						for (Item it : item) {
							if (it.getQuantity() >= quantity)
								basket.add(it);
							else
								System.out.print("only  " + it.getQuantity() + " left in stock");
						}

					}

//				String itemName = console.next();
//
//				vatCalculator tb = new vatCalculator(vat, Double.parseDouble(lineRead), quantity);
//				lines.add(tb);
				}
			}

		} catch (NoSuchElementException e) {
		}

	}

	static void shopWelcome(ArrayList<Product> cat) {
		System.out.println("Welcome to our shop, here are our products : ");

		for (Product product : cat)
			System.out
					.println(product.getProductName() + " | " + product.getPrice() + " | " + product.getDescription());
	}
	   static private boolean prompt()
	   {
		   System.out.println("Please Enter the Item Name  :");
	       return true;
	   }
}
