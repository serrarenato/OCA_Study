package br.com.array;

import java.util.Arrays;

public class Array2 {
	static int[] x2;

	public static void main(String[] args) {
		int[] x1, x3= { 1, 2 , 7, 3};
		
		String[] kkk = new String[0];
		///kkk[0]="rere"; exception
		x1= new int[6];
		System.out.println(Arrays.toString(x1));
		System.out.println(Arrays.toString(x2));
		System.out.println(Arrays.toString(x3));
		for (int x4 : x1) {
			//System.out.println(x4);
		}
		System.out.println("Busca sem sort:"+Arrays.binarySearch(x3, 7));
		Arrays.sort(x3);
		System.out.println(Arrays.toString(x3));
		System.out.println(Arrays.binarySearch(x3, 2));
		System.out.println(Arrays.binarySearch(x3, 4)); // -4 pq começa contando no -1 q é antes do 1.
		int k = x1.length;
		int[][] ll = new int[4][];
		
	}
}
