package com.ex12;

import java.io.Console;

/**
 * ����� � ������. �������� ��������� ������������, ��� � ������������� ����� Console ������� ���� 
 * �� ������ ����������� �, ���� ���� ��������, �������� You are welcome, 
 * � � ������ ������� - Access denied.
 * @author Julia
 *
 */
public class ConsolePassword {

	public static void main(String[] args) {
		Console cons = System.console();
		char[] passwd;
		System.out.println("Please enter your login and password: ");
		
		
		if (cons != null && (passwd = cons.readPassword("[%s]", "Password:")) != null) {			
			java.util.Arrays.fill(passwd, ' ');
		}
	}

}
