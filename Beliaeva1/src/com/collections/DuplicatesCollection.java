package com.collections;

import java.util.Random;

public class DuplicatesCollection implements Cloneable {

	private Integer i1;

	public DuplicatesCollection(Integer i1) {		
		this.i1 = i1;
	}
	
	//	method not needed
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		else
			return false;
	}

	//	method not needed
	public int hashCode() {
		Random rand = new Random(100);
		return i1+rand.nextInt();
	}

	public Integer getI1() {
		return i1;
	}

	//	method not needed 		
	public DuplicatesCollection clone() throws CloneNotSupportedException {
        return (DuplicatesCollection)super.clone();
	}
}
