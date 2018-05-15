package br.com.string;

public class StringBuilder4 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Renato");
		sb.append("teste");
		System.out.println(sb.indexOf("teste"));
		System.out.println(sb);
		sb.substring(4);
		System.out.println(sb.indexOf("teste"));
		System.out.println(sb);
		
	}
}
