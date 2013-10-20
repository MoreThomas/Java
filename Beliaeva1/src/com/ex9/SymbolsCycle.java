package com.ex9;

/**
 * Символьний цикл. Написати найпростіший цикл, 
 * який виводить на екран всі символи від s до b в зворотному порядку.
 * @author Julia
 *
 */
public class SymbolsCycle {

	public static void main(String[] args) {
		String alphabet = "";
		for(char ch='b'; ch <= 's'; ch++)
			alphabet += ch;
		
		System.out.println("Alphabet from 'b' to 's': "+alphabet);
		System.out.println("Reverse alphabet from 's' to 'b': "+new StringBuilder(alphabet).reverse());
	}

}
