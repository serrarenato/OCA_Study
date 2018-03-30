package br.com.java.collections;

import java.util.Collection;
import java.util.HashSet;

public class TestCollections {

	public static void main(String[] args) {
		Collection<Integer> colecao = new HashSet<Integer>();
		//Collection<Integer> colecao = new ArrayList<Integer>();
		long tempoInicial = System.currentTimeMillis();

		for (int i = 0; i < 90000; i++) {
			colecao.add(i);
		}

		for (int i = 0; i < 90000; i++) {
			colecao.contains(i);
		}
		
		long tempoFinal = System.currentTimeMillis();
		System.out.printf("%.3f segundos%n", (tempoFinal - tempoInicial) / 1000d);
	}

}
