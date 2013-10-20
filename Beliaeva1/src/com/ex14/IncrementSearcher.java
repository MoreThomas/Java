package com.ex14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Підбір інкременту. 
 * Написати функцію, яка приймає дійсний аргумент q та повертає таке дійсне число x,
 * що інструкція System.out.println(x++/x);
 * виводить на екран q.
 * @author Julia
 *
 */
public class IncrementSearcher {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		System.out.println("Please enter your number:");
		
		while((input = reader.readLine()).isEmpty()) 
			input += reader.readLine();
		
		if(isCharacters(input)) {
			int q = Integer.valueOf(input);
			for(int x=q;;) {
				if(q == (x++/q)) {
					System.out.println("x++/x (with x++ = "+x+"): "+q);
					break;
				}
			}
						
		}

	}

	private static boolean isCharacters(String s) {
		char[] ch = s.toCharArray();
		
		for(int j=0; j<ch.length; j++) {			
			if(ch[j] == '.' && ch[0] != '.') 
				continue;			
			else if(!Character.isDigit(ch[j])) {
				System.out.println("ERROR: Found character <"+ch[j]+"> in inputted data!");
				return false;
			}
		}
		
		return true;
	}
	
}
