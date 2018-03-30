package br.com.Interface;

interface Pow {
	static void wow() {
		System.out.println("In Pow.wow");
	}
}

abstract class Wow {

	static void wow() {
		System.out.println("In Wow.wow");
	}
}

public class Powwow extends Wow implements Pow {
	public static void main(String[] args) {
		Powwow f = new Powwow();
		f.wow();
		Powwow.wow(); // Only access to class
		Pow.wow(); // Is this a olny way to access static method of interface

		String teste = null;
		System.out.println(teste + true);
		// System.out.println(null + true); //1
		// System.out.println(true + null); //2
		// System.out.println(null + null); //3
		// System.out.println(true + true); //3
	}
}
