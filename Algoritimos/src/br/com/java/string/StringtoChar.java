package br.com.java.string;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringtoChar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] words = new String[t];
		for (int i = 0; i < t; i++) {
			words[i] = in.next();
		}

		for (int x = 0; x < t; x++) {
			String even = "";
			String odd = "";
			int i =0;
			for (char n : words[x].toCharArray()) {
				if (i % 2 == 0)
					even += n;
				else
					odd += n;
				i++;
			}
			System.out.println(even + " " + odd);
		}
	}
}