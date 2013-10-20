package com.ex6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * ������������ ���������. �������� ��������, ��� �������� �� ����� ������� �������� 
 * ����� ���� ����� �� �������� �� ������ ��������� �����. 
 * ���������� �� ������ � ��������� ���� � �������:
 * i - �������� �������� ����� �� 1;
 * d - �������� �������� �� 1;
 * u � �������� �������� �� ����������� (����� �� �������� ������������ 10);
 * q � ��������� ��������� ��������.
 * ���������� �������� �� �����������. 
 * ���� ���������� ��� ���������� ���, ���� ������� ���� �������� �������� �����������.
 * @author Julia
 *
 */
public class InteractiveControl {
	private static final char[] cParam = {'i', 'd', 'u', 'q'};
	
	public static void main(String[] args) throws IOException {
		
		if(args[0].length() == 0) {
			System.out.println("ERROR: No inputted data!");
			System.exit(1);
		}
		
		int defNumb = Integer.valueOf(args[0]);
		System.out.println("Your in-line number is: "+defNumb);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Please eneter your option: ");
		String n = "";

		while (n.isEmpty())
			n = reader.readLine();

		char[] comm = n.toCharArray();
		isWrongSymb(comm);		
		actionNumber(defNumb, comm);		
	}

	private static void isWrongSymb(char[] comm) {
		
		for(int i=0; i<comm.length; i++) {
			int n = 0;
			for(int j=0; j<cParam.length; j++) {
				if(comm[i] != cParam[j]) {
					n++;
				}
			}
			
			if(n == cParam.length) {
				System.out.println("ERROR: Found unknown command symbol <"+comm[i]+"> in line!");
				System.exit(1);
			}
		}						
	}
	
	private static void actionNumber(int defNumb, char[] comm) {
		int dN = defNumb;
		for(int i=0; i<comm.length; i++) { 
			if(comm[i] == 'i')
				dN++;
			
			if(comm[i] == 'd')
				dN--;
			
			if(comm[i] == 'u')
				dN = defNumb;
			
			if(comm[i] == 'q') {
				System.out.println("Current number is: "+dN+"\nExit ...");
				System.exit(1);
			}
				
		}
	}
}
