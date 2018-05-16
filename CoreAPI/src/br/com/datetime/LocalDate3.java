package br.com.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDate3 {
	public static void main(String[] args) {
		LocalDate localDate;
		String data = "10/12/2019";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		localDate = LocalDate.parse(data, dtf);
		System.out.println(localDate);
		localDate = LocalDate.parse("2019-02-18");
		System.out.println(localDate);
		System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd/MMM/uuuu")));
		localDate = LocalDate.parse("2019/02/18"); //it is not a iso_local_date
		System.out.println(localDate);
		
		
	}
}
