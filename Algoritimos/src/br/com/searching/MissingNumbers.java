package br.com.searching;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {
	public static void main(String... args) {
		Scanner in = new Scanner(System.in);
		int maxA = in.nextInt();
		int[] conjA = new int[10001];

		for (int ii = 0; ii < maxA; ii++) {
			conjA[in.nextInt()]++;
		}

		int maxB = in.nextInt();
	

		for (int ii = 0; ii < maxB; ii++) {
			conjA[in.nextInt()]--;
		}

		System.out.println(missingNumbers(conjA));
		in.close();
	}

	private static String missingNumbers(int[] conjA) {
		String missing = "";
		
		for (int x = 0; x < conjA.length; x++) {
			if (conjA[x]!=0) {
				missing += x + " ";
			}

		}

		return missing;
	}
}
