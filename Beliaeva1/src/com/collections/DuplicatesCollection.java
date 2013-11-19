package com.collections;

import java.util.HashSet;

//Не работает!
public class DuplicatesCollection implements Comparable {
	static Integer i1,i2;
	public static void main(String[] args) {
		i1 = new Integer(10);
		i2 = 10;
		HashSet<Integer> hash = new HashSet<Integer>();

		hash.add(i1);
		hash.add(i2);		
		
		for (Integer integer : hash) {
			System.out.println(integer);
		}
	}

	@Override
	public int compareTo(Object o) {
		if((i1-i2) == 0)
			return 1;
		else 
			return 0;
	}
	
	
}
