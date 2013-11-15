package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Не до конца, проблема с 3 созданием десериализированного объекта

public class SerializationTest implements Serializable {

	private static final long serialVersionUID = 7887117103633748678L;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student studentMain = Student.getInstance();

		FileOutputStream output = new FileOutputStream("Students.out");
		ObjectOutputStream objStream = new ObjectOutputStream(output);
		
		objStream.writeObject(studentMain);
		objStream.flush();
		objStream.close();
		output.close();
		
		
		FileInputStream input = new FileInputStream("Students.out");
		ObjectInputStream objInput = new ObjectInputStream(input);
		
//		System.out.println("File text:");
//		int b;
//		while((b = input.read()) != -1) {
//			System.out.println(Integer.valueOf(b));
//		}
		
		Student studentClone1 = (Student) objInput.readObject();
//		Student studentClone2 = (Student) objInput.readObject();	

		objInput.close();
		input.close();
		
		studentClone1.setRatingProlog(11);
		studentClone1.setRatingAI(9);
		
		studentMain.setRatingProlog(8);
		studentMain.setRatingAI(7);
				
		System.out.println("Main serializated student got for Prolog: "+studentMain.getRatingProlog() + "; AI: "+studentMain.getRatingAI());
		System.out.println("First serializated student got for Prolog: "+studentClone1.getRatingProlog() + "; AI: "+studentClone1.getRatingAI());
		
	}

}
