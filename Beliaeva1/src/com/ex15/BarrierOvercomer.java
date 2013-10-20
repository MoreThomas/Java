package com.ex15;

/**
 * ��������� ���� ���������! 
 * ����� x � ����� ���� long. 
 * �������� ���, ���� ���������� �� ����� � ���� ��������, �� � ��������� ��������� ��������
 * System.out.println(x++>=x);
 * �� ����� ���������� true.
 * @author Julia
 *
 */
public class BarrierOvercomer {

	public static void main(String[] args) {
		long x = (long)(Math.random()*100);
		System.out.println("Get random x: "+x);
		
		while(!(x++>=x))
			System.out.println(x++>=x);
	}	
	
}
