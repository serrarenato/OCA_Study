package br.com.interview.prime;

import java.math.BigInteger;
import java.util.Scanner;

public class primeBigInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		in.close();
		if (n.isProbablePrime(3)) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
		/*if (n.equals(new BigInteger("1")))
			System.out.println("not prime");
		else if (n.equals(new BigInteger("2")))
			System.out.println("prime");
		else if (n.mod(new BigInteger("2")).equals(new BigInteger("0")))
			System.out.println("not prime");
		else if (n.mod(new BigInteger("5")).equals(new BigInteger("0")))
			System.out.println("not prime");
		else {
			boolean prime = true;
			for (BigInteger x = new BigInteger("3"); x.compareTo(n) < 0;x = x.add(new BigInteger("2"))) {
				if (n.mod(x).equals(new BigInteger("0"))) {
					prime = false;
					break;
				}
				
			}
			if (!prime)
				System.out.println("not prime");
			else
				System.out.println("prime");
		}*/
	}

}
