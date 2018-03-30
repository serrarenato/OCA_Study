package br.com.hiding.static1;

public class Dog2 extends Animal2 { //this is override
	
	public  void growl(){
		System.out.println("I am Barking. I am Domestic? " + isDomestic());
	}
	public  boolean isDomestic(){
		return true;
	}
	public void dogTest(){
		System.out.println(isDomestic()); 
	}
	public static void main(String[] args) { //Hiring example 
		Animal2 a = new Dog2();
		Animal2 a1 = new Animal2();
		a.growl();
		a1.growl();
		Dog2 d = new Dog2();
		d.growl();
		d.animalTest();
		d.dogTest();
	}
	
}
