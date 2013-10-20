package com.array.ex2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Багатовимірний масив. 
 * Написати функцію, яка приймає змінну кількість рядків та повертає багатовимірний масив, 
 * елементами якого в свою чергу є масиви типу int[], 
 * що складаються з цифр кожного рядка і відсортовані за спаданням. 
 * Наприклад, при вхідних даних “q2r14gf”, “5w9” функція повинна повернути масив [[4,2,1],[9,5]]. 
 * Проілюструвати роботу функції в консольному застосуванні.
 * @author Julia
 *
 */

public class MultilevelArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));			
		String str = reader.toString();
		//Scanner sc = new Scanner(reader);
		
		String[] s = str.split(",");		

	}

//	public static String sortNumbers(String[] s) {
//		int[][] arr = new int[s.length][1];
//		for (int i = 0; i < s.length; i++) {
//			Scanner sc = new Scanner(s[i]);
//			int[] si = new int[s[i].length()];
//			int j = 0;
//			while(sc.hasNextInt())
//				si[j++] = sc.nextInt();
//			
//			
//			
//			arr[i][1] = si;
//		}
//	}
}
