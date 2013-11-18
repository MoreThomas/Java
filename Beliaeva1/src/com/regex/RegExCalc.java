package com.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class RegExCalc {
	static String str;
		
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		str = reader.readLine().trim();
		checkArgs(str);		
	}

	public static void checkArgs(String str) {
		Pattern pattern = Pattern.compile("^[0-9]{1,7}\\s{0,3}(\\+|\\*|/|-)\\s{0,3}[0-9]{1,7}$");
		Pattern patMulty = Pattern.compile("^[0-9]{1,7}\\s{0,3}\\*\\s{0,3}[0-9]{1,7}$");
		Pattern patDiv = Pattern.compile("^[0-9]{1,7}\\s{0,3}/\\s{0,3}[0-9]{1,7}$");
		Pattern patMinus = Pattern.compile("^[0-9]{1,7}\\s{0,3}-\\s{0,3}[0-9]{1,7}$");
		Pattern patPlus = Pattern.compile("^[0-9]{1,7}\\s{0,3}\\+\\s{0,3}[0-9]{1,7}$");
		
		if(!pattern.matcher(str).find()) {			
			System.err.println("Введенные данные неверны! Простой арифметическое уравнение с двумя операндами, должно иметь вид, подобный с 3 + 5 (або 5*6)");
			System.exit(0);
		} 
		
		if(patPlus.matcher(str).find()) 
			plus();
		
		if(patMinus.matcher(str).find()) 
			minus();
		
		if(patDiv.matcher(str).find()) 
			div();
			
		if(patMulty.matcher(str).find()) 
			multiplication();
	}
	
	public static void plus() {
		String[] s = str.split("\\+");
		double x = Double.valueOf(s[0].trim());
		double y = Double.valueOf(s[1].trim());
		double z = x+y;
		System.out.println(str+" = "+z);
	}
	
	public static void minus() {
		String[] s = str.split("-");
		double x = Double.valueOf(s[0].trim());
		double y = Double.valueOf(s[1].trim());
		double z = x-y;
		System.out.println(str+" = "+z);
	}
	
	public static void div() {
		String[] s = str.split("/");
		double x = Double.valueOf(s[0].trim());
		double y = Double.valueOf(s[1].trim());
		double z = x/y;
		System.out.println(str+" = "+z);
	}
	
	public static void multiplication() {
		String[] s = str.split("\\*");
		double x = Double.valueOf(s[0].trim());
		double y = Double.valueOf(s[1].trim());
		double z = x*y;
		System.out.println(str+" = "+z);
	}
}
