package br.com.hiding.static1;

public class Animal {
	public int x=10;
	public static void growl(){
		System.out.println("I am Growling. I am Domestic? " + isDomestic());
	}
	public static boolean isDomestic(){
		return false;
	}
	
	public void animalTest(){
		System.out.println(isDomestic()+" "+x); 
	}
}
