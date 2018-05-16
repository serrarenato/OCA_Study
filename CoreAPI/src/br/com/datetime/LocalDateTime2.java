package br.com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

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
		System.out.println("----------------------------------");
		dateTime = LocalDateTime.now();
		System.out.println(dateTime.get(ChronoField.DAY_OF_MONTH));
		System.out.println(dateTime.get(ChronoField.DAY_OF_WEEK));
		System.out.println(dateTime.get(ChronoField.DAY_OF_YEAR));
		System.out.println(dateTime.get(ChronoField.HOUR_OF_AMPM));
		System.out.println(dateTime.get(ChronoField.MINUTE_OF_DAY));
		System.out.println(dateTime.get(ChronoField.MINUTE_OF_HOUR));
		System.out.println(dateTime.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(dateTime.get(ChronoField.YEAR_OF_ERA));
		System.out.println(dateTime.get(ChronoField.YEAR));
		System.out.println(dateTime.getLong(ChronoField.MONTH_OF_YEAR));
	}
}
