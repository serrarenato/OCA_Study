package br.com.lambda.study;

public class PredicateDemo1 {

	public static void main(String[] args) {
		call(s -> s.startsWith("O"),"OCAJP8");

	}

	public static void call(Predicate<String> start, String l) {
		boolean b = start.test(l) ? true : false;
		System.out.println(b);// prints true
	}
}
