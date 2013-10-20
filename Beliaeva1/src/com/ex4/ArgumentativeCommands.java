package com.ex4;

/**
 * Аргументовані команди. Написати консольне застосування, яке підраховує суму дійсних чисел, 
 * заданих як аргументи командного рядка. Програма має контролювати коректність введення і у випадку, 
 * якщо дані мають неправильний формат, видавати відповідне повідомлення.
 * @author Julia
 *
 */
public class ArgumentativeCommands {
	
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("ERROR: Not found any inputted data!");
			System.exit(1);
		}
			
		double d = 0;
		
		for(int i=0; i<args.length; i++) {
			char[] ch = args[i].toCharArray();
			for(int j=0; j<ch.length; j++) {
				if(ch[j] == '.') {} else
				if(!Character.isDigit(ch[j])) {
					System.out.println("ERROR: Found character <"+ch[j]+"> in inputted data!");
					System.exit(1);
				} 
			}
			
			d += Double.valueOf(args[i]);
		}
		
		System.out.println("Summary of inputted data is: "+d);
	}

}
