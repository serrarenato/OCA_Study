package br.com.methods;

import java.math.BigDecimal;
import java.util.Date;

public class Methods1 {
	public static void main(String[] args) {
		Methods1 methods = new Methods1();
		String x = "jose";
		StringBuilder ss = new StringBuilder("teste");
		methods.methods1(x);
		System.out.println(x);
		int x1 = 3;
		methods.methods1(x1);
		System.out.println(x1);
		methods.methods1(ss);
		System.out.println(ss);
		Integer x3 = 5;
		methods.methods1(x3);
		System.out.println(x3);
		
		Date date1 = new Date();
		methods.methods1(date1);
		System.out.println(date1);
		
		BigDecimal bigDecimal = new BigDecimal(2);
		methods.methods1(bigDecimal);
		System.out.println(bigDecimal);
		methods.fly("ere","rerer");
		methods.fly(new String[5]);
		//methods.fly1("rerer", "rerer"); dont work
	}

	private void methods1(String x) {
		x = x + "renato";		
	}

	private void methods1(int x) {
		x = 2;
	}

	private void methods1(StringBuilder x) {
		//x.append("renato");
		x= new StringBuilder("jose1");
		
	}

	private void methods1(Integer x) {
		x = 2;
	}
	private void methods1(Date x) {
		//x = new Date("2017/09/09");
		x.setHours(13);
	}
	private void methods1(BigDecimal x) {		
		x=x.add(new BigDecimal(3));	
	}
	private void fly(String ...strings ){
		System.out.println("rere");
	}
	private void fly1(String[] string2){
		return;
	}
}

