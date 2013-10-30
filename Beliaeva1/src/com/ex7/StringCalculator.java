package com.ex7;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Рекордні рядки. Написати консольне застосування, яке вводить з 
 * клавіатури деяку кількість рядків та виводить на екран найдовший і найкоротший з них, 
 * а також довжини цих рядків.
 * @author Julia
 *
 */
public class StringCalculator {

	public static void main(String[] args) throws IOException {
		final Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your string for calculation: ");


		String s,n = "";
		while(!(s = sc.nextLine()).equalsIgnoreCase("end")) {							
			n += s;
		}
				
		getMaxSent(n);
		getMinSent(n);
		
	}

	public static void getMaxSent(String n) {
		StringTokenizer sents = new StringTokenizer(n, ".\n");
		int len = 0;
		String str = "";
		while(sents.hasMoreTokens()) {
			String s = sents.nextToken().trim();
			if(len < s.length()) {
				len = s.length();
				str = s;
			}
		}
		
		System.out.println("Max length of the sentences is: "+len+"\n"+str);
	}
	
	public static void getMinSent(String n) {
		StringTokenizer sents = new StringTokenizer(n, ".\n");
		int len = 0; 
		String str1 = "", 
				str2 = "";
		
		if(sents.hasMoreTokens()) {
			str1 = sents.nextToken().trim();
			len = str1.length();
		}
		
		while(sents.hasMoreTokens()) {
			str1 = sents.nextToken().trim();
																					
			if((str1.length() < len) && !str1.equals("")) {
					len = str1.length();
					str2 = str1;				
			}
		}
		
		System.out.println("Min length of the sentences is: "+len+"\n"+str2);
	}
}
