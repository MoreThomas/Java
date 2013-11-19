package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ElementsShuffle {

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int length = random.nextInt(16);

		for (int i = 0; i < length; i++)
			list.add(random.nextInt(200));
		
		printList(list);
		
		Collections.shuffle(list, random);
		
		printList(list);
	}

	static void printList(ArrayList<Integer> list) {
		System.out.print("Collection: ");
		for(Integer i : list) 
			System.out.print(i+" ");
				
		System.out.println();
	}
	
}
