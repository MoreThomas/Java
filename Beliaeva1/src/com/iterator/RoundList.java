package com.iterator;

public class RoundList {

	public static void main(String[] args) {
		InfinityArrayList<String> list = new InfinityArrayList<String>();
		
		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");
		
		while(list.hasNext())
			System.out.println(list.next());
	}

}
