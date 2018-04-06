package br.com.string;

public class StringBuilder2 {
	public static void main(String[] args) {
		char[] chars= {'R', 'E', 'N', 'A', 'T'};
		System.out.println(chars.length);
		StringBuilder sb = new StringBuilder();
		sb.append(chars,0,chars.length);
		System.out.println(sb);
		sb.setLength(4);
		System.out.println(sb);
		sb.append("TO");
		System.out.println(sb);
		sb.insert(7, "Erro"); // StringIndexOfBoundsException because its greater than length
		System.out.println(sb);
		CharSequence c;
		String d;
	}

}
