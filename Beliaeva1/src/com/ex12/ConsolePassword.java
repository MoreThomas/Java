package com.ex12;

import java.io.Console;

/**
 * Паролі з консолі. Написати консольне застосування, яке з використанням класу Console вводить логін 
 * та пароль користувача і, якщо вони правильні, виводить You are welcome, 
 * а в іншому випадку - Access denied.
 * @author Julia
 *
 */
public class ConsolePassword {

	public static void main(String[] args) {
		Console cons = System.console();
		char[] passwd;
		System.out.println("Please enter your login and password: ");
		
		
		if (cons != null && (passwd = cons.readPassword("[%s]", "Password:")) != null) {			
			java.util.Arrays.fill(passwd, ' ');
		}
	}

}
