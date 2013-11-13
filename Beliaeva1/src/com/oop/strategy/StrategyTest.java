package com.oop.strategy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class StrategyTest {

	public static void main(String[] args) {
		ArrayList<Figure> list = new ArrayList<Figure>();
		Random random = new Random();
		Figure f = null;
		int x, y, length = random.nextInt(10);
		
		System.out.println("Random length:" + length);
		
		for (int i = 0; i < length; i++) {
			x = random.nextInt(15);
			y = random.nextInt(10);		
			
			if(x == y)
				f = new Square();			
			else 
				f = new Rectangle();
			
			f.setA(x);
			f.setB(y);
			list.add(f);
		}				
		
		Iterator<Figure> it = list.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}

}
