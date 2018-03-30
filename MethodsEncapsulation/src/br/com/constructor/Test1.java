package br.com.constructor;

 class Test {

	void x(Object... x) {
		System.out.println("Object");
		System.out.println(x.length);
	}

	void x(Long... x) {
		System.out.println("Long");
		System.out.println(x.length);
	}

	void x(int... x) {
		System.out.println("int");
		System.out.println(x.length);
	}
}

public class Test1 {
	public static void main(String[] args) {
		new Test().x(1l);
		
		new Test().x(new Integer[]{5,6,7});
	}

}
