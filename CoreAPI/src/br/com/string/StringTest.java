package br.com.string;

public class StringTest {
	public static void main(String[] args) {
		char[] charString = { 'a', 'b', 'c', 'd', 'e', 'a', 'b', 'c', 'd', 'e','1' };
		String x = new String(charString);
		System.out.println(x);
		
		System.out.println(x.charAt(4)); // charAt receve a int to get the position.
		System.out.println(x.isEmpty()); // if length() == 0.
		System.out.println(x.codePointAt(4));
		System.out.println(x.codePointAt(x.length()-1)); //CodePointAt return the value in ASCII of the position.
		x.getChars(4, 7, charString, 0);
		System.out.println(charString);
		
		String teste = "teste";
		System.out.println(teste.equalsIgnoreCase("teSTE"));
		teste= teste.concat("s");
		System.out.println(teste.indexOf('e'));
		System.out.println(teste.indexOf('e',2));
		
		System.out.println(teste.lastIndexOf('e'));
		
		System.out.println(teste.replace('e', 'i')); // Replace all occurs, char and String
		
		System.out.println(teste.contains("st"));
		
		System.out.println(teste.replaceAll("es", "iz")); // Replace all occurs, only to String, accept regex
		
		System.out.println(teste.replace("es", "iz")); // Replace all occurs, char and String
		
		System.out.println("RRR".toLowerCase());
		System.out.println(teste.toUpperCase());
		System.out.println( " RR R ".trim()); // both sides of string.
		System.out.println("RRR".toCharArray());
		
		
		
		
	}
}
