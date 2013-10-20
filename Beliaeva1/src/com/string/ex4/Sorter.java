package com.string.ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * ���������� �����. 
 * �������� �������, ��� ������ �� �������� ����� �� ������� �����, 
 * ������������ �� ��������� � ���������� �������. 
 * ���������, ��� �������� qwerty ������� �� ��������� ywtqre. 
 * ��������� ������ �������� ������� � ������� �������.
 * @author Julia
 *
 */

public class Sorter {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		String s = reader.readLine();
							
		sortAlphabetically(s);
	}
	
	static void sortAlphabetically(String s) {
		char[] ch = s.toCharArray();
		Arrays.sort(ch);		
		s = String.valueOf(ch);
		System.out.println("Sorted:\n"+s);
		System.out.println("Reversed:\n"+new StringBuffer(s).reverse());
	}

}
