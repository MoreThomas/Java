package com.string.ex2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ��������� ������� ������. 
 * �������� �������, ��� ������ �� �������� �����, � ����� �������� ����������� ������, ��������� �������, 
 * � ������� ����� �����, � ����� ������� � � �������, ��� ������� ������� � � ���������� �������. 
 * ���������, ��� ������� �������� ��������� � ���� ������� ������� �� ��������� �������-����-�. 
 * �������� ��������� ������������, ��� ������� ������ ���� �������.
 * @author Julia
 *
 */

public class ReverseLeksema {

	public static void main(String[] args) throws IOException {	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your sentence: ");
		String s = reader.readLine();
		reverseByWord(s);
		
	}
	
	static void reverseByWord(String s) {
		StringBuilder sBuf = new StringBuilder();
		String[] strArr = s.split(" ");
		List<String> list = Arrays.asList(strArr);
		Collections.reverse(list);

		for (String l : list) {
			sBuf.append(l);
			sBuf.append("-");
		}								
		
		System.out.println(sBuf.substring(0, sBuf.length()-1));
	} 

}
