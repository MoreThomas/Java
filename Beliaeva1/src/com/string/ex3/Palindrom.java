package com.string.ex3;

import java.util.Scanner;

/**
 * ��������. 
 * �������� ��������, ��� ������� � ��������� ����� � ��������, �� � �� ����������, 
 * ����� �� �������� �� �������� ���� ������� �� ������ �����.
 * @author Julia
 *
 */
public class Palindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");	    
	    String s = scan.nextLine();
	    StringBuffer sb=new StringBuffer(s);
	    sb.reverse();
        
	    if(s.equals(sb.toString()))
	        System.out.println("Palindrome String.");
	    else
	    	System.out.println("Your string isn't like Palindrom!");	    
	}

}
