package br.com.hiding.static1;

public class Animal2 {
	public  void growl(){
		System.out.println("I am Growling. I am Domestic? " + isDomestic());
	}
	public  boolean isDomestic(){
		return false;
	}
	
	public void animalTest(){
		System.out.println(isDomestic()); 
	}
}
