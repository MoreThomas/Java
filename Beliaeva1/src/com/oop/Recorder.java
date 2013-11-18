package com.oop;

import java.util.ArrayList;
import com.innerclasses.comparator.Student;

/*
 * Манипуляции мы будем производить надо объектами 
 * класса com.innerclasses.comparator.Student 
 */

public class Recorder {
	private ArrayList<Student> list;
	private static Recorder recorder;
	
	private Recorder() {
		list = new ArrayList<Student>();
	}
	
	public static synchronized Recorder getInstance() {
		if(recorder == null)
			recorder = new Recorder();
		
		return recorder;
	}
	
	public void addElement(Student s) {
		list.add(s);
	}
	
	public void createStudent(String fio, int opschi, int lisp, int prolog, int java) {
		addElement(new Student(fio, opschi, lisp, prolog, java));
	}
	
	public void deleteStudent(String fio) {
		Student s = getStudent(fio);
		if(s == null) {
			System.out.println("No such student "+fio+" !");
			return;
		} else {		
			list.remove(s);
			System.out.println("Student "+fio+" deleted!");
		}
	}
	
	public void editFIO(String fio, String newFIO) {
		getStudent(fio).setFio(newFIO);
	}
	
	public void editOpschi(String fio, int newOpschi) {
		getStudent(fio).setOpschi(newOpschi);
	}
	
	public void editLisp(String fio, int newLisp) {
		getStudent(fio).setLisp(newLisp);
	}
	
	public void editProlog(String fio, int newProlog) {
		getStudent(fio).setProlog(newProlog);
	}
	
	public void editJava(String fio, int newJava) {
		getStudent(fio).setJava(newJava);
	}		
	
	public void updateAll(String fio, String newFIO, int opschi, int lisp, int prolog, int java) {
		getStudent(fio).updateAllParams(newFIO, opschi, lisp, prolog, java);
	}
	
	public void printAllStudents() {
		for(Student s : list)
			System.out.println(s.getFio()+" has next:\t"+"Opschi: "+s.getOpschi()+"\tLISP: "+s.getLisp()+"\tProlog: "+s.getProlog()+"\tJAVA: "+s.getJava());
	}
	
	public void search(String fio) {
		Student s = getStudent(fio);
		if(s == null) {
			System.out.println("No such student "+fio+" !");
			return;
		} else {		
			System.out.println(s.getFio()+" has next:\t"+"Opschi: "+s.getOpschi()+" LISP: "+s.getLisp()+" Prolog: "+s.getProlog()+" JAVA: "+s.getJava());
		}
	}
	
	private Student getStudent(String fio) {
		Student student = null;
		for(Student s : list)
			if(s.getFio().equalsIgnoreCase(fio))
				student = s;		
							
		return student;
	}
}
