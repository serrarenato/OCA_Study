package br.com.Interface;

public class Poodle extends Dog{

	@Override
	public boolean hair() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void type(String type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		
	}
	public void speak(){
		System.out.println("Au Au Au...");
	}
	public static void main(String[] args) {
		System.out.println(Mammal.domestic +" " +Dog.domestic);
		new Poodle().speak();
		Mammal.Jump();
	}
	
}
