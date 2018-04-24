package br.com.Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestException {
	public static void main(String... args) throws Exception {
		try {
			method();
			method1();
		}catch (IOException e) {
			System.out.println("IOException teste");
		}
		
		try {
			throw new RuntimeException("teste");
		} catch (RuntimeException e) {
			throw new RuntimeException("teste2");
		} finally {
		//	throw new Exception("teste3");
			System.out.println("rerere");
		}

	}

	private static void method() throws IOException{		
		try {
			throw new IOException("teste IO");
		}catch(IOException e) {
			e.printStackTrace();
		}		
	}
	private static IOException method1() throws IOException{		
		try {
			 return new IOException("teste IO");			
		}catch(Exception e) { //it isnt possible put IOException or FileNotFoundException Compiler error
			e.printStackTrace();
		}	
		return null;
	}
}
