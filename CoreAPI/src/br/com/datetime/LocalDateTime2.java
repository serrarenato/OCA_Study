package br.com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTime2 {
	public static void main(String[] args) {
	
		LocalDate date = LocalDate.of(2018, 2, 15);
		LocalDateTime dateTime = date.atTime(10,20);
		System.out.println(date);
		System.out.println(dateTime);
		System.out.println(dateTime.getDayOfMonth());
		System.out.println(dateTime.getDayOfWeek());
		System.out.println(dateTime.getMonth());
		System.out.println(dateTime.getMonthValue());
	}
}
