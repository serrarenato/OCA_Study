package br.com.array;

import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
		char cA[][] = new char[3][];
		for (int i = 0; i < cA.length; i++)
			cA[i] = new char[4];
		System.out.println(cA[1]);
		char[][] cA1 = new char[3][4];
		int[][] cA2 = new int[3][3];
		int [][] x= new int[2][3];
		x[0]= new int[5];
		x[1]= new int[]{1,2,36,7,8,9,9};//Array constants can only be used in 		 initializers
		int [] x1 = {1,3,5}; //Array constants can only be used in 		 initializers
		System.out.println(Arrays.deepToString(x));
		System.out.println(Arrays.toString(x1));
		
		String array1[] = new String[10];
		Arrays.fill(array1, "renato"); //one dimensional only
		System.out.println(Arrays.toString(array1));
		//char xx=1;
		//byte xx=1;
		//short xx=1;
		//long xx=1; // erro
		//double xx=1; //erro
		//float xx=1; //erro
		int xx=1;
		System.out.println(array1[xx]);
	}
}
