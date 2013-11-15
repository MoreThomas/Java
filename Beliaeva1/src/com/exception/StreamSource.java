package com.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamSource extends MySource {
	InputStream istream;
	
	public StreamSource() {}
	
	public StreamSource(InputStream istream) {
		this.istream = istream;
	}

	public InputStream getInputStream() {
		return istream;
	}
	
	@Override
	public String getData() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(istream));
		String output = null;
		try {
			output = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return output;
	}

	
	
	public static void main(String[] args) {		
		StreamSource source = new StreamSource(System.in);
		
		System.out.print("Enter input stream for reading and render: ");		
		String str = source.getData();									
											
		System.out.println("Our StreamSource class read data, it's: "+str);
	}
}
