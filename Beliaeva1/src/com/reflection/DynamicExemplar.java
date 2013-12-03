package com.reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//НЕРАБОЧАЯ!

public class DynamicExemplar {
	static Class cl;
	static String strMethod;
	
	
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		System.out
				.print("Enter class name or class with invoke method, " +
						"for example:\n\t- com.innerclasses.LocalShare;" +
						"\n\t- com.innerclasses.LocalShare.main;\n--->");

		try {
			String str = reader.readLine();

			if (str.isEmpty()) {
				System.err.println("String is empty!");
				System.exit(0);
			}

			// парсим введенную строку и извлекаем название метода
			strMethod = str.substring(str.lastIndexOf(".") + 1,
					str.length());
			// парсим введенную строку и извлекаем название класса
			String strClass = str.substring(0, str.lastIndexOf("."));

			System.out.println("Парсим строку ...\n"+"Класс: "+strClass + "\nМетод: " + strMethod);

			// получаем инстанс искомого класса
			cl = Class.forName(strClass);
			// получам все медоты описанные в классе (public, private, protected, default)
			Method[] methods = cl.getDeclaredMethods();

			String outputType = null;			

			for (Method method : methods) {

				if (method.getName().equals(strMethod)) {
			
//					outputType = method.getReturnType().getName();					
//					Class[] paramTypes = method.getParameterTypes();					
//					
//					System.out.print("Типы параметров: ");
//					if (paramTypes.length == 1)
//						chooseClass(paramTypes[0].getName());
//					else if (paramTypes.length > 1)
//						System.err
//								.println("Вызов методов с аргументами более 1го не реализовано.");					
						
					System.out.println("Структура метода: "+method.getReturnType().getName()+" "+method.getName()+"("+
						getMethodParams(method.getParameterTypes())+")");
				}
			}
			
			
					
//			System.out.println(method.invoke(cl, ""));

		} catch (/*NoSuchMethodException | IllegalAccessException | InvocationTargetException | */IllegalArgumentException | ClassNotFoundException| SecurityException | IOException e) {
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
	
	static void invokeMethod(Method m) {
		
	}
	
	public static void chooseClass(String inputType) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {		
		if(inputType.contains("String"))
			getString();
		
		if(inputType.contains("Bool"))
			getBool();
		
		if(inputType.contains("int") || inputType.contains("Int"))
			getInt();
		
	}

	
	public static void getString() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class[] c = new Class[]{String.class}; 
		Method method = cl.getMethod(strMethod, c);	
		method.invoke(cl, "48");
	}

	public static void getInt() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
		Class[] c = new Class[]{int.class}; 
		Method method = cl.getMethod(strMethod, c);	
		method.invoke(cl, 48);
	}
	
	public static void getBool() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  {
		Class[] c = new Class[]{boolean.class}; 
		Method method = cl.getMethod(strMethod, c);	
		method.invoke(cl, 0);
	}
	
}
