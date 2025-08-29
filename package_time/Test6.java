package com.practice.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// DateTimeFormatter
public class Test6 {
	public static void main(String[] args) {
		String date = "01-02-2025";
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate localDate = LocalDate.parse(date,pattern);
		System.out.println(localDate);
		
		
		String stringDate = localDate.toString();
		System.out.println(stringDate);
		DateTimeFormatter pattern2 = DateTimeFormatter.ofPattern("MMMM/dd/yy");
		stringDate = localDate.format(pattern2);
		System.out.println(stringDate);
		
	}
}
