package br.com.internas;

public class Anonima {
	class PopCorn{
		public void pop(){
			System.out.println("popcorn");
		}
	}
	class Food {
		PopCorn  p = new PopCorn(){
			public void pop() {
				System.out.println("pipoca");
			}
			public void pop2() {
				System.out.println("pipoca");
			}
		};
		public void teste(){
			p.pop();
		}
		
	}
	public  static void main (String[] args){
		Anonima.Food f = new Anonima().new Food();
		f.teste();
		
	}
}
