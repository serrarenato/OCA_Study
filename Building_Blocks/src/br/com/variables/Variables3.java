package br.com.variables;

public class Variables3 {
	public static void main(String[] args) {
		//teste(10); //dont work because 10 is a int, first should be convert to a short
		teste((short) 19);
		short x=10;
		teste(x);
		int y = x;
		
	}
	static void teste(short x) {}
	static void teste(byte x) {}
	static void teste(char x) {}
}
