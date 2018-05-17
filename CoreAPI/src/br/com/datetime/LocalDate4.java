package br.com.datetime;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;

public class LocalDate4 {
	public static void main(String[] args) {
		Year y = Year.now();
		LocalDate ld = y.atDay(10);
		System.out.println(ld.toString());
		ld = y.atMonthDay(MonthDay.now());
		System.out.println(ld.toString());
		ld = y.atMonthDay(MonthDay.of(2, 27));
		System.out.println(ld.toString());
	}
}
