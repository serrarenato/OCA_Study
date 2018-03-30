package br.com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestNumbers {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = in.nextInt();
		}
		differenceSort(ar);
	}

	private static void differenceSort(int[] ar) {

		StringBuilder resp = new StringBuilder("");
		int diff = Integer.MAX_VALUE;
		Arrays.sort(ar);
		for (int x = 0; x < ar.length - 1; x++) {

			if ((Math.abs(ar[x] - ar[x + 1]) < diff) && ((diff = Math.abs(ar[x] - ar[x + 1])) >= 0))
				resp = new StringBuilder(ar[x] + " " + ar[x + 1] + " ");
			else if (Math.abs(ar[x] - ar[x + 1]) == diff)
				resp.append(ar[x] + " " + ar[x + 1] + " ");

		}
		System.out.println(resp);
	}

}
