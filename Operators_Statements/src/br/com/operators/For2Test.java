package br.com.operators;

public class For2Test {
	public static void main(String[] args) {
		for (int x = 0; x < 9; System.out.print(x))// here first test x after print, then will print 9
			x++;
		System.out.println();
		for (int x = 0; x < 9; System.out.print(x++));// when x<9 dont execute syso, hence the last number is 8
	}
}
