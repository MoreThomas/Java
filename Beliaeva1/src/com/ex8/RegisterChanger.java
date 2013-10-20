package com.ex8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���� �������. �������� �������, ��� ������ �� �������� ������ ����������� ������� 
 * �� ������� ��� ����� ������, ��� � ������������ ������. 
 * ��������� �� �������� ���������, ���������� �� �������, ����������� ��������. 
 * ��������� ������� �� ����� �������� �� ���������������, ������������ ��������� ����������. 
 * ����������� ������� ������ ����������� ����. 
 * ��������� ������ �������� ������� � ������� ������� �� ����� ������� ��������� ������� �������.
 * @author Julia
 *
 */
public class RegisterChanger {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		System.out.println("Please enter some sentence:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char[] c = reader.readLine().toCharArray();

		for(int i=0; i<c.length; i++)
			upperCase(c[i]);
	}

	public static void upperCase(char ch) {
		int i = ch;
		i = i ^ 32;
		char c = (char)i; 
		System.out.print(c);				
	} 
	
}
