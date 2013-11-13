package com.oop;

import java.util.Random;

/**
 * ������������� ������. 
 * �������� ��������, ��� ������� ������ � ����� ������� ����� �����, 
 * � ���� ��������� �� ����� � �������� �� �������� �� �����. 
 * �������� �� ���������������; ���������� �������������� ���������� � ����������.
 * @author Julia
 * http://vedenin.ru/prg/12.php
 */

public class LowlevelList {

	public static void main(String[] args) {
		Random random = new Random();
		int length = random.nextInt(15);
		Integer[] arr = new Integer[length];
		
		for (int i = 0; i < length; i++)
			arr[i] = random.nextInt();
		
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
	
}
