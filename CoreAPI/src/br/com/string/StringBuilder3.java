package br.com.string;

public class StringBuilder3 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("ABCdeAfg");
		sb.insert(7, 533);
		sb.insert(sb.lastIndexOf("A"), 533);
		System.out.println(sb);
		System.out.println(sb.lastIndexOf("A"));
	}
}
