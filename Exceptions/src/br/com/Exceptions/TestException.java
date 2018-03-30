package br.com.Exceptions;

public class TestException {
	public static void main(String... args) throws Exception {
		try {
			throw new RuntimeException("teste");
		} catch (RuntimeException e) {
			throw new RuntimeException("teste2");
		} finally {
		//	throw new Exception("teste3");
			System.out.println("rerere");
		}

	}
}
