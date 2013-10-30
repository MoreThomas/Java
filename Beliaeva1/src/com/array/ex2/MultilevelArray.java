package com.array.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * ������������� �����. 
 * �������� �������, ��� ������ ����� ������� ����� �� ������� ������������� �����, 
 * ���������� ����� � ���� ����� � ������ ���� int[], 
 * �� ����������� � ���� ������� ����� � ���������� �� ���������. 
 * ���������, ��� ������� ����� �q2r14gf�, �5w9� ������� ������� ��������� ����� [[4,2,1],[9,5]]. 
 * ������������� ������ ������� � ����������� �����������.
 * @author Julia
 *
 */

public class MultilevelArray {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));			
		String[] s = reader.readLine().split(",");			
		sortNumbers(s);
	}

	static void sortNumbers(String[] s) {
		
		for (int i = 0; i < s.length; i++) {				
			char[] ch = s[i].trim().toCharArray();
			String str = "";			
			
			for (int j = 0; j < ch.length; j++)
				if(Character.isDigit(ch[j]))
					str += String.valueOf(ch[j]) + ";";										
			
			int[] arr = createIntArray(str);
						
			for(int a : arr)
				System.out.print(a);
			System.out.println();
		}				
	}
	
	static int[] createIntArray(String s) {		
		String[] sArr = s.split(";");
		int[] arr = new int[sArr.length];
		
		for (int i = 0; i < sArr.length; i++) 
			arr[i] = Integer.parseInt(sArr[i]);				
		
		Arrays.sort(arr);
		return arr;
	}
}
