package com.collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class WordCalc {

	static String[] strWords;
	
	public static void main(String[] args) throws IOException {
//		File file = new File("wordcounter.txt");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		File file = new File(args[0]);
		
		// считываем файл в буффер buff
		BufferedReader reader = new BufferedReader(new FileReader(file));
		StringBuffer buff = new StringBuffer();
		while(reader.ready())
			buff.append(reader.readLine());				
		
		reader.close();
		
		// разбиваем считаный текс в буфере на разделители: робел, табул€ци€, нова€ строка и т.д. 
		StringTokenizer tokens = new StringTokenizer(buff.toString(), " \t\n\r,:-().");
		int countFile = tokens.countTokens();						
		
		// выводим кол-во слов в файле
		System.out.println("In file we found "+countFile+" words.");
		
		// наполн€ет HashMap map словом - кол-во вхождений, т.к. в HashMap <key, value> key - уникальны 
		// и дубликаты не вставл€ютс€, то мы имеем только уникальные слова 
		while(tokens.hasMoreTokens()) {			
			String str = tokens.nextToken();
			int countSingle = countWord(str, buff);
			map.put(str, countSingle);
		}					
		
		// сортируем кол-во в пор€дке убывани€
		List<Integer> sortSount = new ArrayList<Integer>(map.values());
		Collections.sort(sortSount, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {				
				return o2 - o1;
			}
			
		});
		
		Iterator<String> iterWords = map.keySet().iterator();
		Iterator<Integer> iterCount = sortSount.iterator();
		
		while(iterWords.hasNext() && iterCount.hasNext()) {					
			System.out.println("Word: "+iterWords.next()+" -> "+iterCount.next());
		}
		
	}

	// считает вхождение слова в текст и возвращает это кол-во
	static int countWord(String str, StringBuffer buff) {
		StringTokenizer tokens = new StringTokenizer(buff.toString(), " \t\n\r,:-().");
		int count = 0;
		while(tokens.hasMoreElements()) {
			String str2 = tokens.nextToken();
			if(str.equalsIgnoreCase(str2))
				count++;
		}
		
		return count;
	}
	
}
