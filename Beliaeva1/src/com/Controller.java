package com;

public class Controller {
	
	public static long startTime() {
		return System.nanoTime();
	}
	
	public static long endTime(long l) {
		return System.nanoTime() - l;
	}
}
