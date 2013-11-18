package com.oop;

public class MyClass {
	private String a = "default string";
	
	public MyClass() {
		System.out.println("Empty Constructor Message. Default value a is: "+a);
	}
	
	public MyClass(String a) {
		this.a = a;
		System.out.println("Constructor Message. Value a is: "+a);
	}
	
	void setA(String s) {
		a = s;
	}
}
