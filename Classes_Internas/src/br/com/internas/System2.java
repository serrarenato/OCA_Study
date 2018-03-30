package br.com.internas;

import java.io.PrintStream;

public  class System2 {
	public  static Prints out = new System2().new Prints();

	public static void main (String[] args){
		System2.out.println("ferer");
	}

	class Prints{
		public void println(String string){
			System.out.println(string);
		}
	}
}
