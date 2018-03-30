package br.com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SortAdvanced {

	static long count = 0;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int[] ar = new int[n];
			int[] arOld = new int[n];
			for (int j = 0; j < n; j++) {
				ar[j] = in.nextInt();

			}
			count = 0;
			mergeSort(ar, arOld, 0, n - 1);
			// System.out.println(c);
			System.out.println(Arrays.toString(ar));
			System.out.println("Movimentações: " + count);
		}
	}

	public static void mergeSort(int[] ar, int arNew[], int begin, int end) {
		// long count = 0;

		if (begin < end) {
			int meio = (begin + end) / 2;
			mergeSort(ar, arNew, begin, (begin + end) / 2);
			mergeSort(ar, arNew, ((begin + end) / 2) + 1, end);
			intercalar(ar, arNew, begin, meio, end);
		}
		// return count;

	}

	private static void intercalar(int[] ar, int[] arNew, int begin, int meio, int end) {
		for (int x = begin; x <= end; x++) {
			arNew[x] = ar[x];
		}
		int ini = begin;
		int meio2 = meio + 1;
		// percorre todo o array
		for (int x = begin; x <= end; x++) {
			// se os vetores acabaram
			if (ini > meio)
				ar[x] = arNew[meio2++];
			else if (meio2 > end)
				ar[x] = arNew[ini++];
			// ordenação
			else if (arNew[ini] <= arNew[meio2]) {			
				ar[x] = arNew[ini++];
			} else {
				//if (ar[x] != arNew[meio2] || (x != meio2))
					count++;
				ar[x] = arNew[meio2++];

			}
		}

	}
}
