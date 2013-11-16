package com.serialization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

public class RandomWriter {
	static RandomAccessFile randomAccess;
	static final File file = new File("RandomWriter.out");
	
	public static void main(String[] args) throws IOException {		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Random text:");
		String str = reader.readLine();
		
		
		PrintWriter writer = new PrintWriter(file);
		writer.print(str);
		writer.close();
						
		System.out.print("Enter position to change:");
		String position = reader.readLine();
		
		System.out.print("Enter new symbol:");
		String symbol = reader.readLine();
		
		reader.close();

//		method will change only 1 symbol
//		goTo(Integer.valueOf(position), Character.toString(symbol.toCharArray()[0]));
		
		goTo(Integer.valueOf(position), symbol);
		
		FileReader fReader = new FileReader(file);
		StringBuffer buff = new StringBuffer();
		
		int b;
		while((b = fReader.read()) != -1)
			buff.append((char)b);
		
		System.out.println("New text:\n" + buff);		
		
		fReader.close();
	}
	
	public static void goTo(int num, String ch) throws IOException {     
		randomAccess = new RandomAccessFile(file, "rw");
		randomAccess.seek(num);
		randomAccess.write(ch.getBytes());        
        randomAccess.close();
    }
	

}
