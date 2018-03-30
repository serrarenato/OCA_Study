package br.com.lambda.study;

public class SupplyDemo {

	public static void main(String[] args) {
		MyNumber numb1 = ()-> 5;
		MyNumber numb2 = ()->{return 7;};
		System.out.println(numb1.getValue());
		System.out.println(numb2.getValue());

	}
	interface MyNumber { int getValue(); }

}
