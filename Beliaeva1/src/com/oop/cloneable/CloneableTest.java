package com.oop.cloneable;

import java.util.ArrayList;
import java.util.Random;

public class CloneableTest {

	public static void main(String[] args) {
		Student student = Student.getInstance();
		ArrayList<Student> list = new ArrayList<Student>();
				
		int length = new Random().nextInt(10);
		
		list.add(student);
		try {
		
			for (int i = 0; i < length; i++)			
				list.add(student.clone());
			
		} catch (CloneNotSupportedException e) {		
			e.printStackTrace();
		}
		
	}

}
