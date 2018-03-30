package br.com.operators;

public class Ifs {
	public static void main(String[] args) {
		boolean b1 = false;
		boolean b2 = false;
		if (b2 != b1) {
			System.out.println("true1");
		} else {
			System.out.println("false");
		}
		if (true != b1) {
			System.out.println("true");
		}
//		if (true =! b1) {  Its not permitted because is a value not a variable
//			System.out.println("true");
//		}
		if (b1 = b2 != b1) {
			System.out.println("true");
		}
		if (b1 != b2 != b1) {
			System.out.println("true");

		}
		if (b1 =! b2 ) {
			System.out.println("true2");

		}
		
	}
}
