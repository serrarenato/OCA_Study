package br.com.Interface;

public interface Animal extends A,B{
	public void type(String type);
	public default void speak(){
		System.out.println("Rrrrrrmmm...");
	}
}
interface A{
	
}
interface B{
	
}