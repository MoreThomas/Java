package com.oop.polymorphicstatic;

import java.util.ArrayList;

public class BaseTest {
	static ArrayList<Base> list = new ArrayList<Base>();
	
	public static void main(String[] args) {			
		
		addBase(new Sub2());
		addBase(new Sub1());
		addBase(new Base());
		
		for (Base base : list) {
			base.inform();
		}
	}

	public static void addBase(Base b) {
		Base base = b; 
		list.add(base);
	}
	
}
