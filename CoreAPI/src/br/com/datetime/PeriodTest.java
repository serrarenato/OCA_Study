package br.com.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;

public class PeriodTest {
	public static void main(String[] args) {
		Period p1 = Period.of(1, 30, 3);
		Period p2 = Period.ofDays(5);
		Period p3 = p1.plus(p2);
		p3 = p3.plus(Period.ofMonths(12));
		System.out.println(p1.getDays());
		System.out.println(p3.getDays());
		System.out.println(p3.getYears());
		System.out.println(p3.getMonths());
		System.out.println(p3.toTotalMonths());
	
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		ld = ld.with(ChronoField.DAY_OF_MONTH,2);
		System.out.println(ld);
	}
}
