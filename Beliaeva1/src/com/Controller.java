package com;

public class Controller {
	
	public static long startTime() {
		return System.nanoTime(); //Returns the current value of the most precise available system timer, in nanoseconds.
	}
	
	public static long endTime(long l) {
		return System.nanoTime() - l;
	}
}
