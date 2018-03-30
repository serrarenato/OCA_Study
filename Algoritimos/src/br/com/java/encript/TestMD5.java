package br.com.java.encript;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class TestMD5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String string = in.next();
		try {
			//MessageDigest m=MessageDigest.getInstance("MD5");
			MessageDigest m=MessageDigest.getInstance("SHA-256");
			m.update(string.getBytes());
			//System.out.println(new BigInteger(1,m.digest()).toString(16));	
			 for (byte i : m.digest()) {
		            System.out.print(String.format("%02x", i));
		        }
		} catch (NoSuchAlgorithmException e) {			
			e.printStackTrace();
		}
	}

}
