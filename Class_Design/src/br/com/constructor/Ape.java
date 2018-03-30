package br.com.constructor;

public class Ape extends Primate{

	public Ape() {
		super(5);// the constructor is necessary, otherwise the code not compile.		
	}
	public static void main(String[] args) {
		System.out.println(new Ape().getAge());
		System.out.println(new Primate(4).getAge());
	}

}
