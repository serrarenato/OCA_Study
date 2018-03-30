package br.com.internas;

public class Anonima3 {
	void go() {
		Bar b = new Bar();
		b.doStuff(new Foo(){
			@Override
			public void test() {
				// TODO Auto-generated method stub
				
			}
		});
	}
	interface Foo{
		void test();
	}
	class Bar {
		void doStuff(Foo f){
			
		}
	}
}
