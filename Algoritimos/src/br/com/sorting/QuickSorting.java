package br.com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSorting {
	public static void insertionSort(int[] A) {
		int shifts = 0;
		int[] equals = new int[1];
		equals[0] = A[0];
		int[] left, right;
		left = new int[A.length];
		right = new int[A.length];
		int xLeft, xRight;
		xLeft = xRight = 0;
		for (int i = 1; i < A.length; i++) {
			if (equals[0] >= A[i]) {
				left[xLeft] = A[i];
				xLeft++;
			} else {
				right[xRight] = A[i];
				xRight++;
			}
		}
		left = Arrays.copyOf(left, xLeft);
		right = Arrays.copyOf(right, xRight);
		printArray(left);
		printArray(equals);
		printArray(right);
	}

	static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		// System.out.println("");
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		insertionSort(ar);
	}
}
