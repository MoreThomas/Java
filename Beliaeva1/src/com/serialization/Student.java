package com.serialization;

import java.io.Serializable;

public class Student implements Serializable {
	private static final long serialVersionUID = 7810897646817354751L;
	private int RatingProlog, RatingAI;
	private static Student student = null;
	
	private Student() {}
	
	public synchronized static Student getInstance() {
		if(student == null)
			student = new Student();
		
		return student;
	}

	public int getRatingProlog() {
		return RatingProlog;
	}

	public void setRatingProlog(int ratingProlog) {
		RatingProlog = ratingProlog;
	}

	public int getRatingAI() {
		return RatingAI;
	}

	public void setRatingAI(int ratingAI) {
		RatingAI = ratingAI;
	}
	
}
