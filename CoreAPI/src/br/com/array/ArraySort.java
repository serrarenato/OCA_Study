package br.com.array;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		//int[1][1] xxx= new int[1][1];
		int[] teste= {4,5,8,7,9,0,1,11};
		int[] teste1[]= {{1,2},{1,2,3,4},{1,2,4}};
		System.out.println(Arrays.deepToString(teste1));
		System.out.println(Arrays.toString(teste));
		System.out.println(Arrays.toString(teste));
		Arrays.sort(teste,2,6);
		System.out.println(Arrays.toString(teste));
		Arrays.sort(teste);
		System.out.println(Arrays.toString(teste));
		int[] a= {-1,2,3};
		int[] b= {-1,2,3};
		System.out.println(Arrays.equals(a, b));
		int x=1;
		Object o= x;
		Object[] a1= {-1,2,3};
		Object[] b1= {-1,2,3};
		System.out.println(Arrays.deepEquals(a1,b1));
	}
}
