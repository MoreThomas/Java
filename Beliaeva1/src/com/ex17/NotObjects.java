package com.ex17;

public class NotObjects {

 /**
 * Необ’єктивні змінні. Написати код, який встановлює деяку змінну x у таке значення, що в результаті виконання операції
 * System.out.println(x instanceof Object); на екран виводиться false.
 */
	public static void main(String[] args) {
		Object i = null;
		System.out.println(i instanceof Object);
	}

}
