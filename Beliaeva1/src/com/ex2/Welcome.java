package com.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Привітання. Написати консольне застосування, яке вводить з клавіатури ім’я
 * користувача та виводить на екран привітання цьому користувачеві.
 * 
 * @author Julia
 * 
 */
public class Welcome {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Please eneter you name: ");
		String name = "";

		while (name.isEmpty())
			name = reader.readLine();

		System.out.println("Hello " + name);
	}

}
