package br.com.internas;

public class Anonima2 {
	interface Cook {
		public void cook();
	}
	class Food{
		Cook cook = new Cook(){

			@Override
			public void cook() {
				System.out.println("I am cooking");
				
			}
			
		};
	}
}
