package com.reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class DynamicExemplar {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter class name: ");
		
		try {
			String name = reader.readLine();
			
			if(name.isEmpty()) {
				System.err.println("String is empty!");
				System.exit(0);
			}
			
			Class cl = Class.forName(name);							
			
			System.out.println("Class Name is "+cl.getName());
			
			Method[] methods = cl.getMethods();			
			
			if(methods.length == 0) {
				System.out.println("Class "+cl.getName()+" hasn't any methods.");
				System.exit(0);
			}	
			
			System.out.println("Methods:");
			
			for (Method method : methods) { 
				System.out.println(" - "+method.getName());			    			
			}
									
			System.out.print("Enter method for execution:");
			String methodName = reader.readLine();
			
			//Method method = null;
			
			Class outputType, inputType = null;
			
			
			for(Method method : methods) {
				if(method.getName().equals(methodName)) {
					System.out.println("Возвращаемый тип: " + method.getReturnType().getName());
					outputType = Class.forName(method.getReturnType().getName());
					
					 Class[] paramTypes = method.getParameterTypes(); 
					 System.out.print("Типы параметров: "); 
					 if(paramTypes.length > 0)
						 for (Class paramType : paramTypes) {
							 System.out.print(" " + paramType.getName());
							 inputType = Class.forName(paramType.getName());
						 }
					 
					 else System.out.print("none");
				}
			}
			
			System.out.print("Enter method for execution:");
			String inputParam = reader.readLine();
						
			Method m = cl.getMethod(methodName, inputType);
					
			System.out.println(m.invoke(cl, "")); 
			
		} catch( IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException | ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}

	}

}
