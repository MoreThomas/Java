package com.ex10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * ���� ����. �������� ��������� ������������, ��� ������� � ��������� ���� ����'���� �����, 
 * ������� ������� ����� ����������� �� �������� 200, �� �������� �� ����� ���� ���� ����.
 * @author Julia
 *
 */
public class Summator {
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char[] ch = reader.readLine().toCharArray();
		short sum = 0;
		
		for(int i=0; i<ch.length; i++) {
			if(!Character.isDigit(ch[i])) {
				System.out.println("ERROR: Found character <"+ch[i]+"> in inputted data!");
				System.exit(1);
			} 
			
			sum += ch[i];
		}
		
		System.out.println("Summary is: "+sum);
	}

}
