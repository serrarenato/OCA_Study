package br.com.lambda;

public class Test {
	public static void main(String[] args) {
		Secret secret = ((e) -> "Poof");
		Secret secret2 = ((e) -> {  e = 6; return "Poof"; }); 
		System.out.println(secret.magic(4));
	}
	
}
interface Secret {  String magic(double d); }
