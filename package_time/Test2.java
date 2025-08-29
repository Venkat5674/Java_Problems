package com.practice.datetime;

import java.time.LocalTime;
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalTime night7 = LocalTime.parse("19:30:30");
		System.out.println(night7);
		
		System.out.println(time.getHour());
		System.out.println(time.getNano());
		
		
		LocalTime before1hour = time.minusHours(1);
		System.out.println(before1hour);
		
		
		System.out.println(time.isAfter(before1hour));
		System.out.println(time.equals(before1hour));
	}

}
