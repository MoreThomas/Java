package com.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;


// check this
// http://www.oracle.com/technetwork/articles/java/compress-1565076.html


public class RLEZipper implements Serializable {
	public static void main(String[] args) throws IOException {
		File in = new File(args[0]);
		File out = new File(args[1]);
		
		FileInputStream fileInputStr = new FileInputStream(in);		
		FileOutputStream fileOutputStr = new FileOutputStream(out);
		
		int b;
		while((b = fileInputStr.read()) != -1) {
			fileOutputStr.write(b);
		}
			
		fileOutputStr.flush();
		
		fileInputStr.close();
		fileOutputStr.close();
	}
}
