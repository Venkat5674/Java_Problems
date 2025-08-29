package com.practice.datetime;

import java.time.LocalDate;
import java.time.Period;

public class Test4 {
	public static void main(String[] args) {
		LocalDate birthDay = LocalDate.parse("2002-05-03");
		LocalDate currentdate = LocalDate.now();
		
		Period age = Period.between(birthDay, currentdate);
		System.out.println(age);
		
		System.out.println(age.getMonths()); 
		System.out.println(age.getYears());
		
		System.out.println(age.toTotalMonths());
		
	}
}

