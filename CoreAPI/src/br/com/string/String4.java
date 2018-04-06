package br.com.string;

public class String4 {
	public static void main(String[] args) {
		Comparable p = new String("teste");
		Comparable p2 = new String("teste");
		System.out.println(p.equals(p2));
		Object p3 = new String("teste");
		Object p4 = new String("teste");
		System.out.println(p3.equals(p4));
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
		System.out.println(p3 == p4);
	}
}
