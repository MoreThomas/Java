package com.collections;

import java.util.ArrayList;
import java.util.Random;

/*
 * ����� ��������. �������� ��������� ������������,
 *  ��� ���������� ����� ������ ������ ������� �������� � ������� ����� ����� �� 0 �� 7 �������.
 */

public class SubsetsSearcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random random = new Random();
		int length = random.nextInt(15);
		
		for (int i = 0; i < length; i++) 
			list.add(random.nextInt(8));
		
		for(Integer i : list)
			System.out.println(i);
	}

}
