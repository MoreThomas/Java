package com.oop;

import java.util.Random;

/**
 * Низькорівневий список. 
 * Написати програму, яка створює список з деякої кількості цілих чисел, 
 * а потім проходить по ньому і виводить всі елементи на екран. 
 * Колекції не використовувати; обмежитися низькорівневими операціями з указниками.
 * @author Julia
 * http://vedenin.ru/prg/12.php
 */

public class LowlevelList {

	public static void main(String[] args) {
		Random random = new Random();
		int length = random.nextInt(15);
		Integer[] arr = new Integer[length];
		
		for (int i = 0; i < length; i++)
			arr[i] = random.nextInt();
		
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
	
}
