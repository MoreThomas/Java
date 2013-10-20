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
	static int fib, currentValue = 1;
	
	public static void main(String[] args) {
		fib = 145;

		//Returns the current value of the running Java Virtual Machine's high-resolution time source, in nanoseconds.
		long startTime = Controller.startTime();		
		System.out.println("Without recursion (below input value = "+ fib +"): "+plusNotR(fib));		
		System.out.println("Time: "+Controller.endTime(startTime));
		
		startTime = Controller.startTime();
		currentValue = 1;
		plusR(currentValue);
		System.out.println("Using recursion (below input value = "+ fib +"): "+currentValue);
		System.out.println("Time: "+Controller.endTime(startTime));
	}

	public static int plusNotR(int i) {
		for (int j = 1; j < i; j++) {
			currentValue += i;
		}
		return currentValue;		
	}
	
	
	public static void plusR(int x) {		
		currentValue += x;		
		System.out.println("for step: "+x);
		
		while(true) {			
			if(fib < (x+=1)) break;	
			plusR(x);
		}	
	}
}
