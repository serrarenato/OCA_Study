package br.com.methods;

import java.util.concurrent.atomic.AtomicInteger;

public class Methods3 {
	public static void main(String[] args) {
		Integer x = 1;
		change(x);
		System.out.println("Com Integer:" + x);
		Integer2 integer2 = new Integer2();
		integer2.x = 1;
		changeInteger2(integer2);
		System.out.println("Com class Integer2 :" + integer2.x);
		AtomicInteger atomicInteger = new AtomicInteger(1);
		change(atomicInteger);
		System.out.println("Com class AtomicInteger :" + atomicInteger.get());
	}

	private static void change(AtomicInteger i) {
		i.set(2);

	}

	private static void changeInteger2(Integer2 integer2) {
		integer2.x += 1;

	}

	private static void change(Integer i) {
		i = i + 4;
	}
}

final class Integer2 {
	final private int x;
	
	public int getX() {
		return x;
	}

	public Integer2(int value) {
		this.x = value;
	}

	public void setX(int x) {
		this.x = x;
	}
}
