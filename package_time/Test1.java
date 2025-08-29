package com.practice.datetime;

import java.time.LocalDate;

public class Test1 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		LocalDate birthDate = LocalDate.parse("2004-02-20");
		System.out.println(birthDate);
		
		System.out.println(now.getYear());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfYear());
		
		LocalDate after1Week = now.plusWeeks(1);
		LocalDate before1Month = now.minusMonths(1);
		System.out.println(after1Week);
		System.out.println(before1Month);
		
		
		System.out.println(now.isLeapYear());
		System.out.println(now.isAfter(before1Month));
		System.out.println(now.isEqual(now));
		System.out.println(now.equals(now));
		
		
		
		
	}
}
