package com.collections;

import java.util.HashSet;

public class DuplicatTest {

	public static void main(String[] args) {
		DuplicatesCollection dupl1 = new DuplicatesCollection(new Integer(10));
		DuplicatesCollection dupl2 = new DuplicatesCollection(new Integer(10));
		HashSet<DuplicatesCollection> hash = new HashSet<DuplicatesCollection>();
		
		hash.add(dupl1);
		hash.add(dupl2);
		
		for(DuplicatesCollection i :hash)
			System.out.println(i.getI1());
	}

}
