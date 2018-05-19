package br.com.interface1;

public class Interface2 {
	public static void main(String[] args) {
		
		Teste teste = new Teste() {};
		System.out.println(teste.method1(true));
		Teste teste2 = new Teste2();
		System.out.println(teste2.method1(true));
		System.out.println(Teste.method2(true));
		System.out.println(new Teste() {}.method1(true));
		
		Teste teste3 = new Teste2() {}; //Reference Type is Teste;
		//Member Variable are static != instance variable
		Teste2 teste4 =(Teste2)teste3;
		Teste teste5 = teste4;
		
	}

}
class Teste2 implements Teste{
	public boolean method1(boolean teste) {
		return !teste;
	}
}
//Default methods dont override methods from class Object
abstract interface Teste{
	
	public default boolean method1(boolean teste) {
		return teste;
	}
	public static boolean method2(boolean teste) {
		return teste;
	}
}
