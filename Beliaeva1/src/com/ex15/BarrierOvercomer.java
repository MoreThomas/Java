package com.ex15;

/**
 * Інкремент долає перешкоди! 
 * Нехай x – змінна типу long. 
 * Написати код, який встановлює цю змінну в таке значення, що в результаті виконання операції
 * System.out.println(x++>=x);
 * на екран виводиться true.
 * @author Julia
 *
 */
public class BarrierOvercomer {

	public static void main(String[] args) {
		long x = (long)(Math.random()*100);
		System.out.println("Get random x: "+x);
		
		while(!(x++>=x))
			System.out.println(x++>=x);
	}	
	
}
