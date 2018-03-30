package br.com.sorting;

import java.util.Scanner;

public class Sorting {

	public static void insertionSortPart2(int[] array) {
		 for (int i = 1; i < array.length; i++) {
		        int j = i;
		        int value = array[i];
		        while (j >= 1 && array[j-1] > value) {
		            array[j] = array[j-1];
		            j--;
		        }
		        array[j] = value;
		        printArray(array);
		    }

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);

	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
