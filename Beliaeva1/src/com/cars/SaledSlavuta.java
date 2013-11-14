package com.cars;

public class SaledSlavuta extends Slavuta {
	
	ITovar tovar = new ITovar() {
		private double slavutaBasicPrice = 15000;
		private int slavutaDiscount = 15;
		
		@Override
		public double getPrice() {
			return slavutaBasicPrice*slavutaDiscount;
		}
		
		@Override
		public int getDiscount() {
			return slavutaDiscount;
		}
		
		@Override
		public double getBasicPrice() {
			return slavutaBasicPrice;
		}
	};

	public double getPrice() {
		return tovar.getPrice()/2;
	}
	
	public int getDiscount() {
		return tovar.getDiscount()*2;
	}
}
