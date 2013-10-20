package com.array.ex1;

/**
 * ��������� �����. 
 * �������� �������, ��� ������ ����� ����� ����� �� �������� �� ������� �����, 
 * � ����� �������� �������� ������ ���������� � ���������� �������.
 * @author Julia
 *
 */

public class Wraparray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {				
		StringBuilder arr = new StringBuilder();		
		
		for(String el : args)
			arr.append(el);
		
		System.out.println("You have: "+arr.toString());
		arr.reverse();
		System.out.println("Reverse: "+arr.toString());
	}

}
