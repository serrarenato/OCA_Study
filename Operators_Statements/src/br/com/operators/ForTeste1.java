package br.com.operators;

public class ForTeste1 {
	public static void main(String... args) {
		int z = 0;
		for (int i = 0; i <= 10;) {
			i = ++i;
			z = i++;
			System.out.println("teste" + i);
		}
		for (int x = 0; x < 10; System.out.println(x))
			x++;
		System.out.println("teste 3. for");
		for (int x = 0; x < 10; x++) {
			if (x == 5)
				x += 4;
			System.out.print(" " + x);
		}
		System.out.println("");
		System.out.println("teste 4. for");
		for (int x = 10; x > 5; x++) {
			if (x == 16)
				x -= 12; // se colocar 11 nao termina pq quando entra no for soma 1.
			System.out.print(" " + x);
		}
	}
}
