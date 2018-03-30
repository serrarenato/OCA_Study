/**
 * My solution with O(n2) another file IceCream2 have a solution O(n)
 */
package br.com.searching;

import java.util.Arrays;
import java.util.Scanner;

public class IceCream {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int trips = in.nextInt();
		for (int i = 0; i < trips; i++) {
			int money = in.nextInt();
			int qtdFlavors = in.nextInt();
			int[] flavors = new int[qtdFlavors];
			for (int ii = 0; ii < qtdFlavors; ii++) {
				flavors[ii] = in.nextInt();
			}
			System.out.println(chooseFlavor(flavors, money));
		}
		in.close();
	}

	private static String chooseFlavor(int[] flavors, int money) {
		String chooseFlavor = new String();		
		First:
		for (int id = 1; id <= flavors.length; id++) {
			if (flavors[id - 1] > money)
				continue;
			for (int id2 = id + 1; id2 <= flavors.length; id2++) {
				if (flavors[id-1]+flavors[id2-1]==money) {
					chooseFlavor = id+" "+id2;
					break First;
				}
			}
		}
		return chooseFlavor;
	}

}
