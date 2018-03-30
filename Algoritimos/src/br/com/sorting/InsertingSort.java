package br.com.sorting;

import java.util.Scanner;

public class InsertingSort {
	public static void insertIntoSorted(int[] ar) {
		int item = ar[ar.length - 1];
		for (int x = ar.length - 2; x >= 0; x--) {
			if (item>ar[x]) {
				ar[x+1]=item;
				printArray(ar);
				break;
			}else {
				ar[x+1]=ar[x];
			}
			printArray(ar);
		}
		if (ar[0]>item) {
			ar[0]=item;
			printArray(ar);
		}
			

	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
