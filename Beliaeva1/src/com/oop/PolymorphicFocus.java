package com.oop;

public class PolymorphicFocus extends MyClass {

	public PolymorphicFocus() {
		setA("Create PolymorphicFocus constructor.");
	}
	
	public void setA(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		new PolymorphicFocus();
	}

}
