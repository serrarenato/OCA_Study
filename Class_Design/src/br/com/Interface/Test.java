package br.com.Interface;

public interface Test {
	public String getName();
	

}

interface Mama{
	public default String getName() {return null;}
}
abstract class Otter implements Test{
	public static void main(String[] args) {
		//boolean t= new boolean("//rere");
		System.out.println(new Boolean("true"));
		System.out.println(new Boolean("tRue"));
	}
}
