package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Syzonenko Alexandr Sergeevich", 5, 8, 9, 11));
		list.add(new Student("Vinnikov Alexandr Igorevich", 11, 10, 10, 11));
		list.add(new Student("Onysko Andrii Igorevich ", 8, 10, 8, 8));
		list.add(new Student("Iurchenko Alexandr Olegovich", 11, 11, 11, 10));
		list.add(new Student("Ashomok Andrii Igorovich", 12, 11, 12, 11));
		list.add(new Student("Zylzhuk Sergiy Valerivich", 10, 9, 11, 11));
		
		Collections.sort(list, Student.getComparatorInstance());		
		
		for(Student s : list) 
			System.out.println(s.getFio() + "\t" + s.getABS());

	}

}
