package com.iterator;

import java.util.ArrayList;

public class InfinityArrayList<E> extends ArrayList<E> {
	private static final long serialVersionUID = -7783510313621278229L;
	int counter = 0;

	public boolean hasNext() {
		if(counter == super.size()-1)
			counter = 0;
			
		return true;
	}


	public E next() {
		E obj = super.get(counter);
		counter++;
		return obj;
	}
}
