package com.oop;
/**
 * ��������. �������� ����, ������������ �� �������� Singleton. 
 * ������������� ��������� �� ������ ���������� ����� �����.
 * @author Julia
 *
 */
public class SingeltonTest {

	public static void main(String[] args) {
		MySingelton singl = MySingelton.getInstMySingelton();
		System.out.println(singl);
	}

}
