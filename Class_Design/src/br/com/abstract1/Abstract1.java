package br.com.abstract1;

abstract class Abstract1 {

	abstract void calculate();

	public static void main(String[] args) {
		System.out.println("calculating");
		Abstract1 x = new Abstract1() {
			@Override
			void calculate() {
				System.out.println("Calcule");
			}
		};
		x.calculate();
	}
}
