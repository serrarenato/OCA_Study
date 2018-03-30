package br.com.override;

import java.io.FileNotFoundException;

public class Dog extends Animal{
	@Override
	public void swim() throws FileNotFoundException{ // Override exception less generic
		System.out.println("I am Flyiing");
		 throw new NullPointerException();
	}
	public void fly() throws FileNotFoundException{
		System.out.println("rerer");
	}
	public static void main(String[] args) {
		Animal dog = new Dog();
		try {
			dog.swim();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Dog dog1 = new Dog();
		try {
			dog1.swim();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			dog1.fly();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
