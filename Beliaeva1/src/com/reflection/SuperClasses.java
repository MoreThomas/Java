package com.reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperClasses {

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
			Class superClass = null;
						
			System.out.println("Class Name is "+cl.getName());
			
			
			while((superClass =  cl.getSuperclass())!= null) {				
				System.out.println("\textends\n"+superClass.getName());
				cl = superClass;
			}						
			
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
