package br.com.interface1;

@FunctionalInterface
public interface Interface1 {
	public  boolean test(String op);

	// public abstract boolean test2(String op); only one method abstract in a Funcional Interface
	
	public default boolean test3(String op) {		
		return test4(op);  //always call the method static of the interface
	}
	
	public static boolean test4(String op) { // dont can be override
		return true;
	}
}
