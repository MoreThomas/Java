package com.serialization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

// doesn't work yet
// check this
// http://www.oracle.com/technetwork/articles/java/compress-1565076.html


public class RLEZipper implements Serializable {
	public static void main(String[] args) throws IOException {
		File in = new File(args[0]);
		File out = new File(args[1]);
		
		BufferedReader buffReader = new BufferedReader(new FileReader(in));
		StringBuffer buffString = new StringBuffer();
		
		while(buffReader.ready()) {
			String str = buffReader.readLine();
			buffString.append(str);
			System.out.println(str);
		}
		
		buffReader.close();
		
		convertToRLE(buffString.toString());
		
//		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(out));
//							
//		
//		
//		
//		buffWriter.close();
	}
	
	public static void convertToRLE(String str) {
		ArrayList<String> list = new ArrayList<String>();
		char[] chArray = str.toCharArray();
		char ch='0';
		int count = 1;
		
		for (int i = 1; i < chArray.length; i++) {
			if(chArray[i-1] == chArray[i] && chArray[i] != ' ') {
				count++;
				ch = chArray[i];
			} else {
				if(count>1) {
					list.add(count+"x"+String.valueOf(ch));
				}
				count = 1;
			}
		}
		
		
		for (String s : list) {
			System.out.println(s);
		}
	}
}
