package com.comparable;

import java.util.TreeSet;

public class ComparableTest {

	public static void main(String[] args) {
		TreeSet<Student> tree = new TreeSet<Student>();
		tree.add(new Student("Syzonenko Alexandr Sergeevich", 5, 8, 9, 11));
		tree.add(new Student("Vinnikov Alexandr Igorevich", 11, 10, 10, 11));
		tree.add(new Student("Onysko Andrii Igorevich ", 8, 10, 8, 8));
		tree.add(new Student("Iurchenko Alexandr Olegovich", 11, 11, 11, 10));
		tree.add(new Student("Ashomok Andrii Igorovich", 11, 11, 11, 11));
		tree.add(new Student("Zylzhuk Sergiy Valerivich", 10, 9, 11, 11));
		
		for(Student s : tree) 
			System.out.println(s.getFio() + "\t" + s.getABS());
		
	}

}
