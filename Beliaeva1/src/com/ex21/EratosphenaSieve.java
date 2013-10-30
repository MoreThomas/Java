package com.ex21;

import java.util.Arrays;

import com.Controller;

public class EratosphenaSieve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int n = 100;
		int curr = 2;
		boolean[] flags = new boolean[n + 1];
		
		long start = Controller.startTime();
		Arrays.fill(flags, false);						

		while (curr < Math.sqrt(n)) {			
			for (int k = 2; k <= (n / curr); k++)
				flags[curr*k] = true;				
						
			curr++;
		}			
		
		long end = Controller.endTime(start);
				
		for (int i = 2; i <= n; i++) {
			if (!flags[i])
				System.out.print(i + " ");
		}
		
		System.out.println("\nExecuting Time: "+end);
	}

}
