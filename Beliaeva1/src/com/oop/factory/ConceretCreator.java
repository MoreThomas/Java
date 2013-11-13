package com.oop.factory;

public class ConceretCreator {	
	public Rectangle factoryMethod(int x, int y) {
		Rectangle r = null;
		if(x == y)
			r = new Square();
		else 
			r = new Rectangle();
		
		r.setX(x);
		r.setY(y);
		
		return r;
	}
}
