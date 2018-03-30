package br.com.sorting;

import java.util.Scanner;

public class Counting1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		couting(ar);
	}

	private static void couting(int[] ar) {
		int[] novo = new int[100];

		for (int x = 0; x < ar.length; x++) {
			novo[ar[x]]++;
		}

		for (int x = 0; x < novo.length; x++) {
			System.out.print(" " + novo[x]);
		}

	}
}
