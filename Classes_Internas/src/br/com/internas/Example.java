package br.com.internas;

public class Example {
	private String texto = "texto Externo";
	public class Interna{
		private String texto = "texto Interno";
		public void print() {
			System.out.println(texto);
		}
	}
	static class Interna2{
		private class Interna3{
			public void print() {
				System.out.println("Dentro da Interna 3");
			}	
		}
	}
	public static void  main (String[] args) {
		Interna interna = new Example().new Interna();
		interna.print();
		Interna2 interna2 = new Interna2();
		Interna2.Interna3 interna3 = interna2.new Interna3();
		interna3.print();
		
	}
}
