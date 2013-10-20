package com.ex3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;

/**
 * ������ � �������. �������� ��������� ������������, ��� ������� � ���������
 * ����� ����� � �������� �� ����� �������� �������� ����� �����. �����������
 * ������ ������������� ��������-���������, � ����� ��������� ������.
 * 
 * @author Julia
 * 
 */
public class NumberProcessor {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.println("Please eneter your number: ");
		String n = "";

		while (n.isEmpty())
			n = reader.readLine();

		double i = Math.log(Double.valueOf(n));		
		System.out.format("Logarithm is: %.3f%n", i);
	}

}
