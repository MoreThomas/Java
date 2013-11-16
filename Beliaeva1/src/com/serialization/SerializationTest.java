package com.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class SerializationTest implements Serializable {

	private static final long serialVersionUID = 7887117103633748678L;
	private static final File fileName = new File("Students.out");
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ArrayList<Student> list = new ArrayList<Student>();		
		Student studentMain = Student.getInstance();				
		
		FileOutputStream output = new FileOutputStream(fileName);
		ObjectOutputStream objStream = new ObjectOutputStream(output);
		
		objStream.writeObject(studentMain);
		objStream.flush();
		objStream.close();
		output.close();
		
		studentMain.setRatingProlog(12);
		studentMain.setRatingAI(11);
		list.add(studentMain);
				
		Student studentClone1 = getStudent();
		Student studentClone2 = getStudent();	
		
		studentClone1.setRatingProlog(11);
		studentClone1.setRatingAI(5);
		list.add(studentClone1);
		
		studentClone2.setRatingProlog(7);
		studentClone2.setRatingAI(8);
		list.add(studentClone2);
				
		for(Student st : list)
			System.out.println("Serializated student got for Prolog: "+st.getRatingProlog() + "; AI: "+st.getRatingAI());
		
		
	}

	public static Student getStudent() {
		Student student = null;;
		try {
		FileInputStream input = new FileInputStream(fileName);
		ObjectInputStream objInput = new ObjectInputStream(input);
		student = (Student) objInput.readObject();	

		objInput.close();
		input.close();
		} catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return student;
	}
	
}
