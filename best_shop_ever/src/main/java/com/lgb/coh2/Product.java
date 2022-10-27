package com.lgb.coh2;

public class Product {
	private String productName;
	private double price;
	private int quantity;
	private String description;
	boolean hasWarranty;
	
	public Product(String productName, double price, int quantity, String description, boolean hasWarranty) {
		super();
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
		this.hasWarranty = hasWarranty;
	}
	protected String getProductName() {
		return productName;
	}
	protected void setProductName(String productName) {
		this.productName = productName;
	}
	protected double getPrice() {
		return price;
	}
	protected void setPrice(double price) {
		this.price = price;
	}
	protected int getQuantity() {
		return quantity;
	}
	protected void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	protected String getDescription() {
		return description;
	}
	protected void setDescription(String description) {
		this.description = description;
	}
	protected boolean isHasWarranty() {
		return hasWarranty;
	}
	protected void setHasWarranty(boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}
	

}
