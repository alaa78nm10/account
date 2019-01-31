package com.muhammedessa.oopclassess;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateClass {

	public static void main(String[] args) {

		Date dt = new Date();
		System.out.println(dt);
		
		System.out.println("------------------");

		GregorianCalendar gc = new GregorianCalendar(2015, 4, 30);
		gc.add(GregorianCalendar.DATE, 1);
		
		Date dt2 = gc.getTime();
		System.out.println(dt2); // output is May not April
		
		System.out.println("------------------");
		
		DateFormat d1 = DateFormat.getDateInstance(DateFormat.FULL);
		String d2 = d1.format(dt2);
		System.out.println(d2);
		
		System.out.println("------------------");
		
		//new JAVA 
		LocalDateTime daytime = LocalDateTime.now();
		System.out.println(daytime);
		
		System.out.println("------------------");
		
		LocalDate ld =  LocalDate.of(2015, 4, 30);
		System.out.println(ld);
		
		System.out.println("------------------");
		
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
		String ld2 = dtf.format(ld);
		System.out.println(ld2);

		System.out.println("------------------");
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("M/d/yyyy");;
		String ld3 = dtf1.format(ld);
		System.out.println(ld3);
	}

}

	