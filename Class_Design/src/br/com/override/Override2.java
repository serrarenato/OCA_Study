package br.com.override;

public class Override2 {
	public static void main(String[] args) {
		//Ab1 ab= new C1();
		Ab1 ab= new Ab1();
		C1 c1 = (C1) ab;
		c1.method();
	}
}

interface I1{
	void method();
}
class C1 extends Ab1 implements I1{
	@Override
	public void method() {
		System.out.println("C");
		
	}
}
class Ab1 implements I1 {
	void A(String teste) {
		
	}

	@Override
	public void method() {
		System.out.println("A");
		
	}
}
