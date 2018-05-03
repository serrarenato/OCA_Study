package br.com.plymorphism;

public class Whiz {
	public static void main(String[] args) {
		A a= new B();
		a.meth();
		a = (A) a;
		a.meth();
		B b = (B) a;
		b.meth();
		Number n = 2.2;
		Integer i = (Integer) n;
		System.out.println(i);
	}
}

interface I {
	public abstract void meth();
}

class A implements I {
	@Override
	public void meth() {
		System.out.println("A");

	}
}

class B extends A implements I {
	@Override
	public void meth() {
		System.out.println("B");

	}
}