package br.com.operators;

public class OperatorTernary {
	public static void main(String... strings) {
		int x = 5;
		int z = 9;
		z = x > 4 ? z + 9 : z++;
		System.out.println(z);
		z = (x > 4 && z > 9) ? z = 0 : z++;
		System.out.println(z + "," + x);
		z = (x++ > 5 && z++ > 8) ? z = 0 : z++;
		System.out.println(z + "," + x);
		x = 5;
		z = (++x > 5 && ++z > 0) ? 111 : 222;
		System.out.println(z + "," + x);
	}
}
