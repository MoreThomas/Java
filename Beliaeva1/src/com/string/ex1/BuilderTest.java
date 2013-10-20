package com.string.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle.Control;

import com.Controller;

/**
 * Без будівельників погано. 
 * Написати цикл, який створює рядок з n літер a (число n вводиться з клавіатури) двома способами: 
 * без використання StringBuilder/StringBuffer (на основі операцій String s=… s+=… ) 
 * та з використанням цього класу. 
 * Порівняти час виконання відповідних фрагментів коду.
 * @author Julia
 *
 */

public class BuilderTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Count 'a': ");
		int c = Integer.parseInt(reader.readLine());
		long start;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Test"+i+" started:");
			start = Controller.startTime();
			createString(c);
			System.out.println(Controller.endTime(start));
			
			start = Controller.startTime();
			createStringBuffer(c);
			System.out.println(Controller.endTime(start));
			
			start = Controller.startTime();
			createStringBuilder(c);
			System.out.println(Controller.endTime(start));
		}
	}
	
	public static void createString(int c) {
		String s = "";
		for(int i=0; i<c; i++)
			s+="a";
		
		System.out.print("String DONE: ");
	}
	
	public static void createStringBuffer(int c) {
		StringBuffer s = new StringBuffer();
		for(int i=0; i<c; i++)
			s.append("a");
		
		System.out.print("StringBuffer DONE: ");
	}

	public static void createStringBuilder(int c) {
		StringBuilder s = new StringBuilder();
		for(int i=0; i<c; i++)
			s.append("a");
		
		System.out.print("StringBuilder DONE: ");
	}
	
}
