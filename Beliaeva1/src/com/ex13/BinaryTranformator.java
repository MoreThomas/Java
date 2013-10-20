package com.ex13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Двійкове подання. Написати консольне застосування, 
 * яке вводить з клавіатури ціле невід'ємне число і виводить на екран його двійкове подання.
 * @author Julia
 *
 */
public class BinaryTranformator {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = "";
		
		System.out.println("Please enter your number:");
		
		while((input = reader.readLine()).isEmpty()) 
			input += reader.readLine();
		
		if(isCharacters(input)) {
			int i = Integer.valueOf(input);
			System.out.println("Binary composition is: "+Integer.toBinaryString(i));
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
