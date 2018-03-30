package br.com.operators;

public class Switch {
	public static void main (String args[]){
		int data=1;
		final int  val=2;
		
		switch (data){
		default:
			System.out.println("re");
			break;
		case val:
			System.out.println("re2");
			break;
		case 3:
			System.out.println("re3");
			break;
		case 1:
			System.out.println("re1");
			break;	
		}
	}
}
