package br.com.internas;

public class TestInners {
	public static void main(String[] args) throws Exception{
		new TestInners().go();
	}

	private void go() {
		new A().m();
		class A{
			void m() {
				System.out.println("Inner method");
			}
		}
		new A().m();
		new TestInners().new A().m();
	}
	class A{
		void m(){
			System.out.println("middle");
			
		}
	}
}
