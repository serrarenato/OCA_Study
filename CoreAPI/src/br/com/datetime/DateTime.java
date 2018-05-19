package br.com.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTime {
	public static void main(String[] args) {
		LocalTime t= LocalTime.now();
		System.out.println(t);
		t=LocalTime.of(12, 05);
		System.out.println(t);
		LocalDate d = LocalDate.of(2019, Month.APRIL, 5);
		System.out.println(d);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		dt=dt.plusDays(7);
		t=t.plusMinutes(5);
		t=t.minusHours(1);
		System.out.println(t);
		System.out.println(dt);
		Period onMonth = Period.ofMonths(3);
		dt=dt.plus(onMonth);
		System.out.println(dt);
		System.out.println("Basic ISO "+dt.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println("Local ISO "+dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		
		LocalDateTime d1 = LocalDateTime.of(2015, 5, 10, 11, 22, 33);
		Period p = Period.ofDays(1).ofYears(2);
		d1 = d1.minus(p);
		Period.of(5, 6, 1); // year month day
		//DateTimeFormatter.of
		
		
	}
}
