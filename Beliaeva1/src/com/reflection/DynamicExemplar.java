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
				.print("Enter class name and method (for example java.lang.Integer.valueOf): ");

		try {
			String str = reader.readLine();

			if (str.isEmpty()) {
				System.err.println("String is empty!");
				System.exit(0);
			}

			strMethod = str.substring(str.lastIndexOf(".") + 1,
					str.length());
			String strClass = str.substring(0, str.lastIndexOf("."));

			System.out.println(strClass + "\n" + strMethod);

			cl = Class.forName(strClass);

			Method[] methods = cl.getMethods();

			String outputType = null;			

			for (Method method : methods) {

				if (method.getName().equals(strMethod)) {
					System.out.println("Возвращаемый тип: "
							+ method.getReturnType().getName());
					outputType = method.getReturnType().getName();
					
					Class[] paramTypes = method.getParameterTypes();
					
					System.out.print("Типы параметров: ");
					if (paramTypes.length == 1)
						chooseClass(paramTypes[0].getName());
					else if (paramTypes.length > 1)
						System.err
								.println("Вызов методов с аргументами более 1го не реализовано.");					
						
				}
			}
			
			
					
//			System.out.println(method.invoke(cl, ""));

		} catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | ClassNotFoundException| SecurityException | IOException e) {
			e.printStackTrace();
		}

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
