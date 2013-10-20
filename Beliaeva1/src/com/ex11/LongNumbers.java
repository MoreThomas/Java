package com.ex11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Довгі цілі. Написати консольне застосування, 
 * яке вводить з клавіатури два великих цілих числа і знаходить їх суму. 
 * Використати клас BigInteger.
 * @author Julia
 *
 */
public class LongNumbers {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your first big number: ");
		BigInteger bI1 = new BigInteger(reader.readLine().trim());		
		
		System.out.println("Enter second big number: ");
		BigInteger bI2 = new BigInteger(reader.readLine());		
		
		System.out.println("Summary is: "+bI2.add(bI1));
	}

}
