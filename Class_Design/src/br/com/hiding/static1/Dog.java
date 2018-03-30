package br.com.hiding.static1;

public class Dog extends Animal {
	// variable are hiding too like static, not exist override variable
	public int x = 2;

	public static void growl() {
		System.out.println("I am Barking. I am Domestic? " + isDomestic());
	}

	public static boolean isDomestic() {
		return true;
	}

	public void dogTest() {
		System.out.println(isDomestic());
	}

	public void printX() {
		System.out.println(x + "||" + super.x);
	}
	public int animalTest(int x) {
		System.out.println("tesste");
		return 1;
	}
	public static void main(String[] args) { // Hiring example
		Animal a = new Dog();
		Animal a1 = new Animal();
		a.growl();
		a1.growl();
		Dog d = new Dog();
		d.growl();
		d.animalTest();
		d.dogTest();
		d.printX();
	}

}
