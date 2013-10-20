package com.ex16;

/*
 * ��� ��� �� ����. �������� ���, ���� ���������� ����� ����� x � ���� ��������, �� � ��������� ��������� ��������
 * System.out.println(x==x); �� ����� ���������� false.
 */

public class NotEqual {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* In computing, NaN, which stands for Not a Number, is a value or 
		 * symbol that is usually produced as the result of an operation on 
		 * invalid input operands, especially in floating-point calculations 
		 */
		double x = Double.NaN; 
		System.out.println(x == x);
	}

}
