package br.com.operators;

public class ForTeste1 {
	public static void  main(String ... args) {
		int z=0;
		for (int i=0;i<=10;) {
			i=++i;
			z=i++;
			System.out.println("teste"+i);
		}
		for (int x=0; x<10; System.out.println(x))x++;
	}
}
