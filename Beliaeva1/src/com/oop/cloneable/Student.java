package com.oop.cloneable;

public class Student implements Cloneable {
	private String RatingProlog, RatingAI;
	private static Student student = null;
	
	private Student() {}
	
	public static Student getInstance() {
		if(student == null)
			student = new Student();
		
		return student;
				
	}
	
	public String getRatingProlog() {
		return RatingProlog;
	}

	public void setRatingProlog(String ratingProlog) {
		RatingProlog = ratingProlog;
	}

	public String getRatingAI() {
		return RatingAI;
	}

	public void setRatingAI(String ratingAI) {
		RatingAI = ratingAI;
	}
	
	public Student clone() throws CloneNotSupportedException {
         return (Student)super.clone();
	}
}
