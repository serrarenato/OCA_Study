package br.com.searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Hackerland {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int range = in.nextInt();
		int[] x = new int[n];
		for (int x_i = 0; x_i < n; x_i++) {
			x[x_i] = in.nextInt();
		}
		Arrays.sort(x);
		int i = 0;
		int count = 0;
		while (i < n - 1) {
			i = observe(i, x, range);
			count++;
		}
		if (i == n - 1)
			count++;
		System.out.println(count);
		HashMap<String, String> teste= new HashMap<String, String>();
		
	}

	static int observe(int index, int[] position, int range) {
		int j = index + 1;
		while (position[j] - position[index] <= range) {
			j++;
			if (j == position.length) {
				return position.length;
			}
		}
		int t = j;
		while (position[t] - position[j - 1] <= range) {
			t++;
			if (t == position.length) {
				return position.length;
			}
		}
		return t;
	
	}
}
