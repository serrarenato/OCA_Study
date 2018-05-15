package br.com.lambda.study;

import java.util.function.Consumer;

public class MethodReference {
	public static void main(String[] args) {
		Consumer <String> c = s-> System.out.println(s);
		Consumer <String> c1 = System.out::println;
		c.accept("teste1");
		c1.accept("teste2");
	}
}
