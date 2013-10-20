package com.ex5;

/**
 * Сума натуральних чисел. Написати функцію, 
 * яка знаходить суму перших n натуральних чисел; число n є параметром функції.
 * @author Julia
 *
 */
public class Factorial {

	public static void main(String[] args) {
		System.out.println("Factorial of our number "+args[0]+" is: "+getFactorial(Integer.valueOf(args[0])));
	}

	private static int getFactorial(int n) {
		if(n == 0) 				
			return 1;
		
		return n*getFactorial(n-1);
	}
	
}


