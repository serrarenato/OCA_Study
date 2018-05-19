package br.com.array;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
		////////////////////////// Array never is null;
		String [] arrayNull = new String[5];
		if (arrayNull == null) {
			System.out.println("array is null");
		}else {
			System.out.println("array is not null");
		}
		arrayNull[0].isEmpty();
		////////////////////
		String[] o = new String[]{"a","b","c"};	//Dont put size when you inicialize anonymous
		System.out.println(Arrays.toString(o));
		Object[] e = o;
		System.out.println(Arrays.toString(e));
		e[2]="re";
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(o));
		e[2]= new StringBuilder("re1"); //Exception -> tentar por um StringBuilder num Array de String
		System.out.println(Arrays.toString(e));
		System.out.println(Arrays.toString(o));
		
	
		
	}	
	
}
