package br.com.operators;

public class Operators1 {
	public static void main(String... args) {
		short x=4;
		short y=6;
		short k=((Integer) (x+y)).shortValue();
		short k1=((short) (x+y));
		float x1=6;
		float x2=9.0f;
		double x3=8.0;
		float y1= x1+x2;
		y1= (float) (x1+x2+x3); 
		long k2=9;
		int x4=5;
		x4+=k2;
		//x4=x4+k2; long to int is not possible
		
		 byte a = 40, b = 50;
		 byte sum = (byte) (a + b);
		 int i = 0;
		 i= i++;
		 System.out.println(i);
		 System.out.println(x);
		 System.out.println(x > 2 ? x <	 4 ? 10 : 8 : 7);
		
	}
}
