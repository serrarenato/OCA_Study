package br.com.Error;

public class Errors {
	public static void main(String[] args) {
		System.out.println("teste");
		doNotCodeThis(5);
	}
	public static void doNotCodeThis(int num) {
		doNotCodeThis(1);
		}
}
