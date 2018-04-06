package br.com.datetime;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;

public class LocalDateTime1 {
	public static void main(String[] args) {
		Year year = Year.of(2017);
		LocalDate date = year.atMonth(11).atDay(10);
		System.out.println(date);
		date = year.atMonthDay(MonthDay.of(2, 28));
		System.out.println(date);
		
		date = year.atMonthDay(MonthDay.of(2, 30));
		System.out.println(date);
	}
}
