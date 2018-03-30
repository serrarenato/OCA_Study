package br.com.override;

public class TestClass {

	public static void main(String args[]) {
		A o1 = new C();
		B o2 = (B) o1;
	
		System.out.println(o1.m1());
		System.out.println(o1.i);
		System.out.println(o2.i);
		System.out.println(o2.m1());
	}
}

class A {
	public int i = 10;

	int m1() {
		return i;
	}
}

class B extends A {
	public int i = 20;

	int m1() {
		return i;
	}
}

class C extends B {
	public int i = 30;

	int m1() {
		return i;
	}
}
