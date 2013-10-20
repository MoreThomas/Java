package com.ex18;

import java.text.ParseException;
import java.util.Date;

/*
 * Скільки літ, скільки зим. Написати програму, 
 * яка вводить з клавіатури два моменти часу та підраховує, скільки між ними пройшло днів.
 */
public class CalcHistory {

	public static void main(String[] args) throws ParseException {			
		Date date1 =new Date(args[0]);		
		Date date2 = new Date(args[1]);
		
		System.out.print("From <"+date1.toString() +"> till <"+date2.toString()+">");
		
		long d1 = date1.getTime();
		long d2 = date2.getTime();						
			
		if(date2.compareTo(date1) < 0) {
			System.out.println("Please input correct Date diapason: FROM <MM/DD/YYYY> TO <MM/DD/YYYY>");			
		} else if(date2.compareTo(date1) > 0) {
			// 1000*60*60*24 - it's one day
			System.out.println(", it's spent "+Math.abs((d2-d1)/(1000*60*60*24))+" days.");						
		} else 			
			System.out.println("Your inputted dates are equal!");
	}

}
