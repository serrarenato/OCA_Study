package br.com.internas;

import java.time.Instant;

public class MyOuter {
	private int x = 7;

	class MyInner {
		public void print() {
			System.out.println("MyInner");
			System.out.println(x);
			System.out.println(this);
			System.out.println(MyOuter.this);
		}
	}

	public void myMethod() {
		 String interna="teste";
		class MyInnerMethod {
			public void printMethod() {
				System.out.println("Dentro do metodo" + x);
				System.out.println("Variavel do metodo" + interna);
			}
		}		
		MyInnerMethod myInnerMethod = new MyInnerMethod();
		myInnerMethod.printMethod();
		
	}

	public static void main(String[] args) {

		MyOuter.MyInner myInner = new MyOuter().new MyInner();
		new MyOuter().myMethod();
		myInner.print();
		
		Instant agora = Instant.now();
		System.out.println(agora);
	}
}
