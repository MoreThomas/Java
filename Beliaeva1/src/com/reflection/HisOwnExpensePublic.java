package com.reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;

public class HisOwnExpensePublic {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("Enter class name:");
		
		try {			
			String name = reader.readLine();
			/*
			 * можно ввести как пример
			 * String name = "com.innerclasses.cars.SaledSlavuta";
			 */
			Class cl = Class.forName(name);
			Method[] methods = cl.getMethods();
			for (Method method : methods) {								
				//проверяем имя класса, к-рый создал метод с именем класса, к-рый ввели мы 
				if(method.getDeclaringClass().getName().equals(name)) {
					System.out.println("public "+method.getReturnType().getName()
						+" "+method.getName()+"("
						+getMethodParams(method.getParameterTypes())+");");
				}
			}
			
		} catch (ClassNotFoundException | IOException e) {			
			e.printStackTrace();
		}
	}

	static String getMethodParams(Class[] cl) {
		StringBuffer s1 = new StringBuffer();
		int count = cl.length;
		for (Class class1 : cl) {			
			s1.append(class1.getName());
			if(--count > 0)
				s1.append(", ");
		}		
		return s1.toString();
	}	
	
}
