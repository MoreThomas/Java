package com.comparable;

public class Student implements Comparable {
	private String fio;
	private int opschi, lisp, prolog, java;
	
	public Student(String fio, int opschi, int lisp, int prolog, int java) {
		this.fio = fio;
		this.opschi = opschi;
		this.lisp = lisp;
		this.prolog = prolog;
		this.java = java;
	}
	
	public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	public int getOpschi() {
		return opschi;
	}
	public void setOpschi(int opschi) {
		this.opschi = opschi;
	}
	public int getLisp() {
		return lisp;
	}
	public void setLisp(int lisp) {
		this.lisp = lisp;
	}
	public int getProlog() {
		return prolog;
	}
	public void setProlog(int prolog) {
		this.prolog = prolog;
	}
	public int getJava() {
		return java;
	}
	public void setJava(int java) {
		this.java = java;
	}
		
	public int getABS() {
		return Math.abs((opschi+lisp+prolog+java)/2);
	}
	
	@Override
	public int compareTo(Object obj) {
		Student s = (Student) obj;
		int result = s.getABS() - getABS();
		
		if(result != 0)
			return (int) result / Math.abs( result );
		
		return 0;
	}
}
