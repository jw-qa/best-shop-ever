package com.lgb.coh2;

public class Warranty {
	private int type;
	private double price;

	public Warranty(int type, double price) {
		super();
		this.type = type;
		this.price = price;
	}

	protected int getType() {
		return type;
	}

	protected void setType(int type) {
		this.type = type;
	}

	protected double getPrice() {
		return price;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

}
