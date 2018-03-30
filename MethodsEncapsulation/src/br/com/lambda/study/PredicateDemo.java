package br.com.lambda.study;



public class PredicateDemo {
	public static void main(String[] args) {
		Predicate start = s -> ((String) s).startsWith("K");
		System.out.println(start.test("OCAJP8")); // prints true
	}
}
 interface Predicate<T> {
	boolean test(T t);

}
