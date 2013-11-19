package com.serialization;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

// http://www.oracle.com/technetwork/articles/java/compress-1565076.html
/*
 * ��������� ��������� ������� ��������� ���� �� args[0] (�� ������ ������ ��� eula),
 * ���� ������� ����������� � ������� �����, �� ��������� �� ������� � ���������� � ������
 * ��� ���-��������� (���� 11��), ���� �� �����������, �� ������ ����� ������.
 * ����� ��� ���������, ������ ������� � �������� ����, �-��� ����� � args[1] (�� ������ ������ ��� zipped).
 */

public class RLEZipper implements Serializable {
	private static final long serialVersionUID = -3154548929368036079L;

	public static void main(String[] args) throws IOException {
		File in = new File(args[0]);
		File out = new File(args[1]);
		
		BufferedReader buffReader = new BufferedReader(new FileReader(in));
		StringBuffer buffString = new StringBuffer();
		
		while(buffReader.ready()) {
			String str = convertToRLE(buffReader.readLine());
			buffString.append(str);
		}
		
		buffReader.close();				
		
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter(out));		
		buffWriter.write(buffString.toString());
		
		buffWriter.close();
	}
	
	public static String convertToRLE(String str) {
		StringBuffer buff = new StringBuffer();		
		char[] ch = str.toCharArray();				
		int count = 1;		
		
		for (int i = 1; i < ch.length; i++) {
			char c = ch[i-1];
		
			if(ch[i] == ' ')
				continue;
			
			if(c == ch[i]) {
				count++;
				continue;
			} else {
				if(count>1) 
					buff.append(count+"x"+String.valueOf(c));
				else 
					buff.append(String.valueOf(c));
				
				count = 1;				
			}
		}
				
		return buff.toString();
	}
}
