package br.com.internas;

public class Bar extends Boo {

	Bar() {

	}

	Bar(String s) {
		super(s);
	}

	void zoo() {
		Boo f = new Boo() {
			String s;
		};
		Boo g = new Bar(){
			
		};
	
	}
	public   class teste{
		
	}
	static class teste2{
		
	}
	private class teste3{
		
	}
	public static void main(String[] args){
		Boo f = new Boo();
		Boo.BooInner s = f.new BooInner();
		Boo.BooInner p = new Boo().new BooInner();
		
	}
}
