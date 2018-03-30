package br.com.interview.prime;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Prime {
	public static boolean isPrime(int n) {
		
		if (n == 1)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		for (int test = 3; test < n; test+=2) {
			if (n % test == 0) {
				return false;				
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] p = { 1,2 };
		for (int a0 = 0; a0 < p.length; a0++) {
			int n = p[a0];

			System.out.println(isPrime(n) ? "Prime" : "Not prime");
		}

	}
}