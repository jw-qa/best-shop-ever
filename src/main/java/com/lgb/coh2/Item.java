package com.lgb.coh2;

public class Item {
	private Product thisProduct;
	private int quantity;
	
	protected Item(Product thisProduct, int quantity) {
		this.thisProduct = thisProduct;
		this.quantity = quantity;
	}

	
	protected Product getThisProduct() {
		return thisProduct;
	}

	protected void setThisProduct(Product thisProduct) {
		this.thisProduct = thisProduct;
	}

	protected int getQuantity() {
		return quantity;
	}

	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
