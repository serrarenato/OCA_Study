package br.com.override;

public class OverrideTest extends Abc{
	public void meth() {
		System.out.println("Teste Override");
	}
	public void meth2() throws NumberFormatException{ //unchecked Exception
		System.out.println("teste abc");
	}
	public static void main(String[] args) {
		OverrideTest o = new OverrideTest();
		
		o.meth();
		Abc a = new OverrideTest();
		System.out.println(o==a );
		try {
			a.meth();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
class Abc{
	public void meth() throws Exception{
		System.out.println("teste abc");
	}
	public void meth2() {
		System.out.println("teste abc");
	}
}
