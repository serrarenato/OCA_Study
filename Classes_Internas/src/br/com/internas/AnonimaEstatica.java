package br.com.internas;

public class AnonimaEstatica {
	int x=1;
	static class Inner{
		void go(){
			System.out.println("metodo go de Inner"); // x not function here,because it's non-static
		}
		
	}
	class Inner2{
		void go(){
			System.out.println("metodo go de Inner2 "+x);
		}
		
	}
	public static void main (String[] args){
		AnonimaEstatica.Inner i = new AnonimaEstatica.Inner();
		i.go();
		AnonimaEstatica.Inner2 i2 = new AnonimaEstatica().new Inner2();
		i2.go();
	}
}
