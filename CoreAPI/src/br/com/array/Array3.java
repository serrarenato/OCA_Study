package br.com.array;

public class Array3 {
	public static void main(String[] args) {
		char cA[][] = new char[3][];
		for (int i = 0; i < cA.length; i++)
			cA[i] = new char[4];
		System.out.println(cA[1]);
		char[][] cA1 = new char[3][4];
		int[][] cA2 = new int[3][3];
	}
}
