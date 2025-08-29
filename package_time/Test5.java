package com.practice.datetime;

import java.time.Duration;
import java.time.LocalTime;

public class Test5 {
	public static void main(String[] args) {
		LocalTime currentTime = LocalTime.now();
		LocalTime startingTime = LocalTime.parse("14:00");
		
		Duration duration = Duration.between(startingTime, currentTime);
		System.out.println(duration);
		System.out.println(duration.toMinutes());
		System.out.println(duration.toMinutesPart());
	}
}


