package com.ex19;

import com.Controller;

/*
 * ����� Գ�������. �������� �������, ��� ������ ���� ����� �� ������� ����� Գ������� � ��� �������. 
 * ����������� ����� Գ�������: ����� ��� ����� ��������� 1, � ����� �������� ������������ �� ���� ���� ���������. 
 * ������ �������� � ���� ��������: 
 * - �������������; 
 * - �����������.
 * �������� ��� ��������� ��������. ������� ��� ����������� ������� �������� ������� ������ (�������� ��� ������������ �������).
 */
public class FibonacheeNumbers {	
	static int fib, currentValue;
	
	public static void main(String[] args) {
		fib = 40; //count of fibanachi iteration
		System.out.println("Below input value = "+ fib);		
		//Returns the current value of the running Java Virtual Machine's high-resolution time source, in nanoseconds.
		currentValue = 1;
		long startTime = Controller.startTime();		
		System.out.println("Without recursion: "+useNORecurs());		
		System.out.println("Time: "+Controller.endTime(startTime));
				
		currentValue = 1;
		startTime = Controller.startTime();
		useRecurs(1);
		
		System.out.println("Using recursion: "+currentValue);
		System.out.println("Time: "+Controller.endTime(startTime));
	}

	public static int useNORecurs() {
		int x = 1;
		for (int j = 0; j < fib; j++) {			
//			System.out.println(currentValue + "+" + x);
			currentValue += x;
			x = currentValue - x;
		}
		return currentValue;		
	}
	
	
	public static void useRecurs(int x) {		
//		System.out.println(currentValue + "+" + x);	
		currentValue += x;						
		
		if(--fib == 0) {			
			return;
		} else {	
			useRecurs(currentValue - x);
			return;
		}	
	}
}
