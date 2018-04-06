package br.com.Exceptions;

public class Exception1 {
	public static final void main(String[] args) {
		try {
			print();
		} catch (Exception e) {
			System.out.println("Exception");
		}
	}

	private static void print() {
		try {
			//throw new  NumberFormatException();
		} catch (ClassCastException e) {//unchecked Exception
			System.out.println("Exception Print");
			throw new NullPointerException("");//unchecked Exception
		} finally {
			System.out.println("finally");
		}
		System.out.println("acabou");
		throw new ClassCastException("");
		
	}

}
