package com.oop;

import com.innerclasses.comparator.Student;

public class TestRecorder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Recorder recorder = Recorder.getInstance();
		
		recorder.addElement(new Student("Syzonenko Alexandr Sergeevich", 5, 8, 9, 11));
		recorder.addElement(new Student("Vinnikov Alexandr Igorevich", 11, 10, 10, 11));
		recorder.addElement(new Student("Onysko Andrii Igorevich ", 8, 10, 8, 8));
		recorder.addElement(new Student("Iurchenko Alexandr Olegovich", 11, 11, 11, 10));
		recorder.addElement(new Student("Ashomok Andrii Igorovich", 12, 11, 12, 11));
		recorder.addElement(new Student("Zylzhuk Sergiy Valerivich", 10, 9, 11, 11));
		
		System.out.println("Print All Students:");
		recorder.printAllStudents();		
		System.out.println("Search for Ashomok A.I.:");
		recorder.search("Ashomok Andrii Igorovich");
		System.out.println("Delete Onysko A.I. ... DONE");
		recorder.deleteStudent("Onysko Andrii Igorevich ");
		
		System.out.println("Add new student Sychkovsky V.E. ... DONE");
		recorder.createStudent("Sychkovsky Valentin Eduardovich", 9, 8, 7, 11);
		
		System.out.println("Print All Students after delete/add:");
		recorder.printAllStudents();
		
		System.out.println("Update JAVA for Iurchenko A.O. ... DONE");
		recorder.editJava("Iurchenko Alexandr Olegovich", 6);
		
		System.out.println("Update all marks for Syzonenko A.S. ... DONE");
		recorder.updateAll("Syzonenko Alexandr Sergeevich", "Syzonenko Alexandr Sergeevich", 8, 8, 8, 8);
		
		System.out.println("Print updated information about all Students:");
		recorder.printAllStudents();
	}

}
