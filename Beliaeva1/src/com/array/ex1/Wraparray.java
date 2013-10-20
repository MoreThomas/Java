package com.array.ex1;

/**
 * Обернений масив. 
 * Написати функцію, яка приймає масив цілих чисел як аргумент та повертає масив, 
 * у якому елементи вхідного масиву розташовані в зворотному порядку.
 * @author Julia
 *
 */

public class Wraparray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {				
		StringBuilder arr = new StringBuilder();		
		
		for(String el : args)
			arr.append(el);
		
		System.out.println("You have: "+arr.toString());
		arr.reverse();
		System.out.println("Reverse: "+arr.toString());
	}

}
