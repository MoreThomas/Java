package com.ex16;

/*
 * Сам собі не рівня. Написати код, який встановлює деяку змінну x у таке значення, що в результаті виконання операції
 * System.out.println(x==x); на екран виводиться false.
 */

public class NotEqual {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* In computing, NaN, which stands for Not a Number, is a value or 
		 * symbol that is usually produced as the result of an operation on 
		 * invalid input operands, especially in floating-point calculations 
		 */
		double x = Double.NaN; 
		System.out.println(x == x);
	}

}
