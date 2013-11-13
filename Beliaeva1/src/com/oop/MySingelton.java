package com.oop;

public class MySingelton {
	private static MySingelton singl = null;
	
	private MySingelton() {	}

	public static MySingelton getInstMySingelton() {
		if(singl == null)
			singl = new MySingelton();
		
		return singl;
	}
	
	public String toString() {
		return "This is override method toString() in Singelton class MySingelton!";
	}
}
