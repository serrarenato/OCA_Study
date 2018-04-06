package br.com.operators;

/**
 * Diference between two number divided by 0, but one of then is double and
 * other is int.
 * 
 * @author renato
 *
 */
public class Operators3 {
	public static void main(String[] args) {
		int x = 10;
		try {
			x = x / 0;
		} catch (ArithmeticException e) {
			System.out.println("int Error");

		}
		try {
			double y = x / 0;
		} catch (ArithmeticException e) {
			System.out.println("double Error");

		}
		double y = x / 0.0;
		Double k = y;
		
		System.out.println("doble:" + y);
		System.out.println(" Double is Infinite: " + k.isInfinite());
		System.out.println(" Double is Nan: " + Double.isNaN(0 / 0.0));
		System.out.println(" Double is Infinite: " + Double.isInfinite(0 / 0.0));
		System.out.println(Double.isNaN(Math.sqrt(-1)));
	}
}
