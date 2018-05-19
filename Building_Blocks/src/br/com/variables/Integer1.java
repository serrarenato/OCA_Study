package br.com.variables;

public class Integer1 {
	public static void main(String[] args) {
		Integer i1= new Integer("10");
		Integer i2= Integer.decode("10");
		Integer i3= Integer.parseInt("010",8);
		Integer i4= Integer.decode("010");
		Integer i5= Integer.parseInt("010");
		Double d1= Double.parseDouble("10");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(d1+i1);
		System.out.println(d1.equals(i1));
	}
}
