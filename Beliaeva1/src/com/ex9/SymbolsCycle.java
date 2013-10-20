package com.ex9;

/**
 * ���������� ����. �������� ����������� ����, 
 * ���� �������� �� ����� �� ������� �� s �� b � ���������� �������.
 * @author Julia
 *
 */
public class SymbolsCycle {

	public static void main(String[] args) {
		String alphabet = "";
		for(char ch='b'; ch <= 's'; ch++)
			alphabet += ch;
		
		System.out.println("Alphabet from 'b' to 's': "+alphabet);
		System.out.println("Reverse alphabet from 's' to 'b': "+new StringBuilder(alphabet).reverse());
	}

}
