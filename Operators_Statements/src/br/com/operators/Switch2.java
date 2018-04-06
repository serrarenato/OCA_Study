package br.com.operators;

public class Switch2 {
	public static void main(String[] args) {
		final int x=2;
		//final int x;
		//x=2;
		switch(x) {
		case 1: System.out.println("rerere");
		default: System.out.println("default");
		case x: System.out.println("2222222");
		//case 2: System.out.println("2222222");
		}
	}
}
