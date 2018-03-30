package br.com.java.binary;

import java.util.Scanner;

public class BinaryNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String binary = "";
		boolean teste = true;
		while (teste) {

			if (n % 2 == 0)
				binary = 0 + binary;
			else
				binary = 1 + binary;
			if (n == 1)
				teste = false;
			n = ((Integer) n / 2);

		}
		int max = 0;
		int count = 0;
		for (char p : binary.toCharArray()) {
			if (p == '0') {
				if (max < count)
					max = count;
				count = 0;
			} else
				count++;
		}
		if (max < count)
			max = count;
		//System.out.println(binary);
		System.out.println(max);
	}
	// 8->1000
}
