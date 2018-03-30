package br.com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class FullCountingSort {

	private static void couting(StringBuilder[] ar) {
		for (StringBuilder s : ar) {
			System.out.print(s);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		StringBuilder[] ar = new StringBuilder[100];
		int max = 0;
		for (int i = 0; i < size; i++) {
			int index = in.nextInt();
			String string = in.next();
			if (ar[index] == null)
				ar[index] = new StringBuilder("");
			if (i >= size / 2)
				ar[index].append(string + " ");
			else
				ar[index].append("- ");
			if (max < index)
				max = index;
		}
		ar = Arrays.copyOf(ar, max + 1);
		couting(ar);
	}
}
