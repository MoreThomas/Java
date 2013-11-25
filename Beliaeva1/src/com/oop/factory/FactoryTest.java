package com.oop.factory;

import java.util.Random;

public class FactoryTest {
	public static void main(String[] args) {
		Random random = new Random();	
		int x, y, length = random.nextInt(10);
		
		System.out.println("Random length:" + length);
		
		for (int i = 0; i < length; i++) {
			x = random.nextInt(15);
			y = random.nextInt(10);
			
			Rectangle r = ConceretCreator.factoryMethod(x, y);
			System.out.println(r);
		}
	}
}
