package com.practice.datetime;

import java.time.LocalDateTime;

public class Test3 {

	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		LocalDateTime VenkateshBirthDay = LocalDateTime.parse("2003-02-20T15:30");
		System.out.println(VenkateshBirthDay);
		
		System.out.println(currentDateTime.getHour());
		
		
		LocalDateTime after2Weeks = currentDateTime.plusWeeks(2);
		System.out.println(after2Weeks);
		
	}
}
