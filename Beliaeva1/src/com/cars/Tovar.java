package com.cars;

public class Tovar {
	private double basicPrice;
	private int discount;
	
	public double getBasicPrice() {
		return basicPrice;
	}
	
	int getDiscount() {
		return discount;
	}
	
	public double getPrice() {
		return basicPrice*discount;
	}
}