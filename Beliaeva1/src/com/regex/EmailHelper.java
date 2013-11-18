package com.regex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailHelper {

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<String>();						
		BufferedReader buffReader = new BufferedReader(new FileReader(new File("email.csv")));				
		Pattern pattern = Pattern.compile("\\w{1,40}@[a-zA-Z]{1,20}\\.(net|com|ua|com\\.ua|ru|com\\.ru|kiev\\.ua|cc)");
		while(buffReader.ready()) {
			String str = buffReader.readLine();
			Matcher matcher = pattern.matcher(str);
			if(matcher.find())
				list.add(str);
		}
		
		buffReader.close();
		
		BufferedWriter buffWriter = new BufferedWriter(new FileWriter("OnlyEmails.out"));
		
		int i = 0;
		for (String string : list) {
			buffWriter.write(i+++". "+string);
			buffWriter.newLine();
		}	
		
		buffWriter.close();
	}

}
