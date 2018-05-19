package br.com.Exceptions;

import java.util.Arrays;

public class Exception2 {
	public static void main(String[] args) {
		try {
			System.out.println(Arrays.toString(args));
			System.out.println(args[0]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: "+e.getMessage());
			e = new ArrayIndexOutOfBoundsException ("novo");
			System.out.println("Erro: "+e.getMessage());
		}
		
		//multi catch block
		
		try {
			System.out.println(args[0]);
		}catch (ArrayIndexOutOfBoundsException|NullPointerException e) { // variable "e" is final
			System.out.println("Erro: "+e.getMessage());
			//e = new ArrayIndexOutOfBoundsException ("novo"); //here we have a compile error
			System.out.println("Erro: "+e.getMessage());
		}
		
	}
}
