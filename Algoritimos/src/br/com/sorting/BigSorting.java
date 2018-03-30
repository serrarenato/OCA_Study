package br.com.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigSorting {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); 
		
	
		
/*		// BigInteger is very slow		
		BigInteger[] unsorted = new BigInteger[n];
		for (int unsorted_i = 0; unsorted_i < n; unsorted_i++) {
			unsorted[unsorted_i] = new BigInteger(in.next());
		}
		for (int sorted_i = 0; sorted_i < n - 1; sorted_i++) {
			if (unsorted[sorted_i].compareTo(unsorted[sorted_i + 1])>0) {
				BigInteger p = unsorted[sorted_i];
				unsorted[sorted_i] = unsorted[sorted_i + 1];
				unsorted[sorted_i + 1] = p;
				sorted_i = -1;
			}
		}
*/
	    String a[] = new String[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.next();
        }
		Arrays.sort(a, new Comparator<String>() {
            public int compare (String left, String right) {
            	if (left.length()==right.length())
            			return left.compareTo (right);
            	else return left.length()-right.length();
            }
        });
		for (int sorted_i = 0; sorted_i < n; sorted_i++) {
			System.out.println(a[sorted_i]);
		}
	}
}
