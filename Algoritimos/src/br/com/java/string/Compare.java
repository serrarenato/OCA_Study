package br.com.java.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Compare {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "zzzzzz";
		String largest = "aaaaaaa";
		if (s.length()<=k) 
			return s + "\n" + s;
		
		for (int x = 0; x <= (s.length() - k); x++) {
			String newString = s.substring(x, x+k);
			if (smallest.compareTo(newString) > 0)
				smallest = newString;
			if (largest.compareTo(newString) < 0) {
				largest = newString;
			}
		}

		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
