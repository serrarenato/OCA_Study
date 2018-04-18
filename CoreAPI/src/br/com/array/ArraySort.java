package br.com.array;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		//int[1][1] xxx= new int[1][1];
		int[] teste= {4,5,8,7,9,0,1,11};
		int[] teste1[]= {{1,2},{1,2,3,4},{1,2,4}};
		System.out.println(Arrays.deepToString(teste1));
		System.out.println(Arrays.toString(teste));
		Arrays.sort(teste,2,6);
		System.out.println(Arrays.toString(teste));
		Arrays.sort(teste);
		System.out.println(Arrays.toString(teste));
	}
}
