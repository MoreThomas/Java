package com.innerclasses;

import java.util.Arrays;
import java.util.Comparator;

public class LocalShare {
	
	public static void main(String[] args) {
		final int[] innerCount = new int[1];		
		innerCount[0] = 0;
		
		String[] sarr = { "kvak", "shmyak", "a", "very long string" };
		Arrays.sort(sarr, new Comparator<String>() {
			
			public int compare(String o1, String o2) {			
				innerCount[0]++;
				System.out.println("Compare s1: "+o1+"; s2: "+o2+"; count:"+innerCount[0]);
				return o1.length() - o2.length();
			}						
						
		});		
				
		System.out.println(Arrays.toString(sarr));
		System.out.printf("The metod compare has been invoked %d times", innerCount[0]);
	}

}
